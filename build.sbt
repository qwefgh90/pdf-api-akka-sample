name := """Locker"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

val akkaVersion = "2.4.4"
scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "org.webjars" % "requirejs" % "2.2.0",
  "org.webjars" % "angularjs" % "1.5.7",
  "org.webjars" % "bootstrap" % "3.3.7-1",
  "org.webjars.npm" % "angular-ui-bootstrap" % "2.0.0",
  "org.webjars.npm" % "jquery" % "1.12.4",
  "org.webjars.bower" % "ng-file-upload" % "12.2.5",
       "org.apache.pdfbox" % "pdfbox" % "2.0.2",
      "org.apache.pdfbox" % "xmpbox" % "2.0.2",
      "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
      "org.scalactic" % "scalactic_2.11" % "2.2.6",
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-remote" % akkaVersion,
      "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
      "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion,
      "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
      "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
      "org.scalatest" %% "scalatest" % "2.2.1" % "test",
      "io.kamon" % "sigar-loader" % "1.6.6-rev002"
  )
  
publishTo := Some("My resolver" at "http://localhost:8081/nexus/content/repositories/snapshots/")

credentials += Credentials(
  "Sonatype Nexus Repository Manager", "localhost", "admin", "admin123"
)
