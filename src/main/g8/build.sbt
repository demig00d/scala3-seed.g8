ThisBuild / organization := "$organization;format="lower,package"$"
ThisBuild / scalaVersion := "3.2.0"
ThisBuild / version      := "0.1.0"

ThisBuild / scalacOptions ++=
  Seq(
    "-deprecation",
    "-explain",
    "-feature",
    "-language:implicitConversions",
    "-unchecked",
    "-Xfatal-warnings",
    "-Ykind-projector",
    "-Ysafe-init", // experimental (I've seen it cause issues with circe)
  ) ++ Seq("-rewrite", "-indent") ++ Seq("-source", "future-migration")

lazy val `$name;format="norm"$` =
  project
    .in(file("."))
    .settings(name := "$name$")
    .settings(libraryDependencies := Dependencies.$name$)
    .settings(testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework")))

lazy val commonSettings = commonScalacOptions ++ Seq(
  update / evictionWarningOptions := EvictionWarningOptions.empty
)

lazy val commonScalacOptions = Seq(
  Compile / console / scalacOptions --= Seq(
    "-Wunused:_",
    "-Xfatal-warnings",
  ),
  Test / console / scalacOptions :=
    (Compile / console / scalacOptions).value,
)

