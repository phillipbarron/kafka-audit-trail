package com.github.phillipbarron

import org.scalatra._
import org.scalatra.json._
import org.json4s.{DefaultFormats, Formats}
import org.slf4j.{Logger, LoggerFactory}
import org.scalatra.{InternalServerError, BadRequest}

class AuditTrail extends ScalatraServlet with JacksonJsonSupport{

  protected implicit val jsonFormats: Formats = DefaultFormats + new org.json4s.ext.EnumNameSerializer(EventType)

  val logger =  LoggerFactory.getLogger(getClass)
  val mockStorage = new MockStorage()
  before("^/(event|asset)/*".r) {
    contentType = formats("json")
  }
  get("/") {
    views.html.hello()
  }
  get("/asset/:id") {
    val id = params("id")
    logger.info(s"$id was requested from the audit trail endpoint")
    mockStorage.getAuditEvents(id)
  }
  get("/event/:eventId") {
    val eventId = params("eventId")
    logger.info(s"event $eventId was requested from the audit trail endpoint")
    mockStorage.getAuditEvent(eventId)
  }
  get("/asset/all") {
    mockStorage.getAuditEvents()
  }
  post("/asset/:id") {
    val id = params("id")
    try {
      val newEntity = parsedBody.extract[AssetEvent]
      logger.info(s"$newEntity was requested posted to the controller")
      mockStorage.addAuditEvent(newEntity)
    } catch {
      case ex: IllegalArgumentException => BadRequest(ex.getMessage)
      case throwable: Throwable => InternalServerError(throwable.getMessage)
    }
  }
}
