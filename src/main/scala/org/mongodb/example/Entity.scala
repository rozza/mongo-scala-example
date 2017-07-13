package org.mongodb.example

import org.bson.codecs.configuration.CodecRegistries.{fromRegistries, fromProviders}
import org.bson.types.ObjectId
import org.mongodb.scala.bson.codecs.DEFAULT_CODEC_REGISTRY
import org.mongodb.scala.bson.codecs.Macros._

case class Entity(_id: ObjectId = ObjectId.get, name: String)

object Entity {

    fromRegistries(fromProviders(classOf[Entity]), DEFAULT_CODEC_REGISTRY)

}
