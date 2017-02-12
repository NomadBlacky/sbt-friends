package org.nomadblacky

import sbt._
import sbt.Keys._
import SbtFriendsKeys._

/**
  * Created by blacky on 17/02/11.
  */
object SbtFriendsTasks extends HogeTask

trait HogeTask {

  lazy val hogeTask = Def.task {
    val log = streams.value.log
    log.info("わーい！")
  }

}
