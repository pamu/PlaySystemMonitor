name := """PlaySystemMonitor"""

version := "1.0-SNAPSHOT"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.3-M1",
  "org.webjars" % "bootstrap" % "2.3.1",
  "org.webjars" % "requirejs" % "2.1.11-1"
)

lazy val root = (project in file(".")).addPlugins(PlayScala)
