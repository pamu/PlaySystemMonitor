name := """PlaySystemMonitor"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.8"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.5.0",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.webjars" % "jquery" % "2.1.3"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)
