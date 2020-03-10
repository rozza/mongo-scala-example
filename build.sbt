lazy val commonSettings = Seq(
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.1",
  libraryDependencies += "org.scala-lang" % "scala-library" % "2.13.1",
  libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.0.0" exclude ("org.mongodb.scala", "bson-scala_2.13")
)

lazy val example = (project in file("example"))
  .settings(
    commonSettings,
    name := "mongo-scala-example"
  )
