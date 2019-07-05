val ScalatraVersion = "2.6.5"

organization := "com.github.phillipbarron"

name := "kafka-audit-trail"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val KafkaClientVersion = "1.0.0"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-clients" % KafkaClientVersion,
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "runtime",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.9.v20180320" % "container",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided",
  "joda-time" % "joda-time" % "2.9.3",
  "org.joda" % "joda-convert" % "1.8",
  "org.json4s" %% "json4s-jackson" % "3.6.5",
  "org.json4s" %% "json4s-ext" % "3.6.5",
)

enablePlugins(SbtTwirl)
enablePlugins(ScalatraPlugin)
