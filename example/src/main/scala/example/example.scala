package example

import com.mongodb.Block
import com.mongodb.connection.{ClusterSettings, SslSettings}
import org.mongodb.scala.{MongoClient, MongoClientSettings}

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps


object example {

  def main(args: Array[String]): Unit = {
    val clusterSettings = ClusterSettings.builder().build()
    val sslSettings = SslSettings.builder().build()
    val settings: MongoClientSettings = MongoClientSettings
      .builder()
      .applyToClusterSettings(new Block[ClusterSettings.Builder]() {
        override def apply(b: ClusterSettings.Builder): Unit = b.applySettings(clusterSettings)
      })
      .build()

    val future = MongoClient(settings).listDatabaseNames().toFuture()
    println(Await.result(future, 5 seconds))
  }

}
