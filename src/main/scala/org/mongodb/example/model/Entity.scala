package org.mongodb.example.model

import org.bson.types.ObjectId

case class Entity(_id: ObjectId = ObjectId.get, name: String)
