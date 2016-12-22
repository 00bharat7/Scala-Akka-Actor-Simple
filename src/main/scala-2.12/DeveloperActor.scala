/**
  * Created by bharaka on 12/21/16.
  */
import DeveloperActor.{Bug, NewFeature}
import akka.actor.{Actor, Props}
class DeveloperActor extends Actor{

  def receive ={
    case feature:NewFeature => println(s"Developing on Feature - '${feature.name}'")
    case Bug => println("This is a Bug")
    case _ => println(" Application Ready ")

  }

}

object DeveloperActor {
  def props = Props(new DeveloperActor)

  case class NewFeature(name: String)
  object Bug
}
