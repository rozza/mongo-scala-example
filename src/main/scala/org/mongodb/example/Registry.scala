package org.mongodb.example

import org.bson.codecs.configuration.CodecRegistries.{fromProviders, fromRegistries}
import org.mongodb.example.model.Entity
import org.mongodb.scala.bson.codecs.DEFAULT_CODEC_REGISTRY
import org.mongodb.scala.bson.codecs.Macros._

object Registry {

  fromRegistries(fromProviders(classOf[Entity]), DEFAULT_CODEC_REGISTRY)

}
