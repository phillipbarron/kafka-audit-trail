package com.github.phillipbarron

import EventType._
import scala.collection.mutable.ListBuffer
import java.util.{Date}

class MockStorage {
    object AuditData {
        var all = ListBuffer(
        AssetEvent("007", "wd40", AssetCreated, "Phill", "all the things", new Date())
        )
    }
    def getAuditEvents(assetId: String) : List[AssetEvent] =
        AuditData.all.toList.filter(_.assetId == assetId)
    def getAuditEvent(eventId: String) : AssetEvent =
        AuditData.all.toList.filter(_.eventId == eventId).head
    def getAuditEvents() : List[AssetEvent] =
        AuditData.all.toList

    def addAuditEvent(auditEvent : AssetEvent) : Unit =
        AuditData.all += auditEvent
}