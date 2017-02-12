sbtPlugin := true

name := "sbt-friends"

organization := "org.nomadblacky"

version := "0.0.1-SNAPSHOT"

scalacOptions ++= Seq("-feature", "-deprecation")

ScriptedPlugin.scriptedSettings
scriptedBufferLog := false
scriptedLaunchOpts <+= version { "-Dplugin.version=" + _ }
watchSources <++= sourceDirectory map { path => (path ** "*" ).get }
