package com.github.phillipbarron
import java.util.{Calendar, Date}

object EventType extends Enumeration {
  type EventType = Value
  val AssetCreated, AssetPublished, AssetSaved, AssetWithdrawn = Value
}

import EventType._

case class AssetEvent(eventId: String, assetId: String, eventType: EventType, userName: String, content: String, eventTime: Date)
