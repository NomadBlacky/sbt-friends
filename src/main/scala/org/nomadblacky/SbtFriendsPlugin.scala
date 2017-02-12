package org.nomadblacky

import sbt._
import Keys._

object SbtFriendsPlugin extends AutoPlugin {

  val autoImport = SbtFriendsKeys

  import autoImport._

  val cnf = config("friends")

  import SbtFriendsTasks._

  override def projectSettings: Seq[_root_.sbt.Def.Setting[_]] = inConfig(cnf)(
    Seq(
      hoge <<= hogeTask
    )
  )
}
