package com.github.phillipbarron

import org.scalatra.test.scalatest._

class AudtTrailTests extends ScalatraFunSuite {

  addServlet(classOf[AuditTrail], "/*")

  test("GET / on AudtTrail should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
