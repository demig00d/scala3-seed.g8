ThisBuild / scalaVersion := "2.12.16"
ThisBuild / autoStartServer := false

update / evictionWarningOptions := EvictionWarningOptions.empty

addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.15.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
