Option(System.getProperty("plugin.version")) match {
  case None =>
    throw new RuntimeException
  case Some(pluginVersion) =>
    addSbtPlugin("org.nomadblacky" % "sbt-friends" % pluginVersion)
}