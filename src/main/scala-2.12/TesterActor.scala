/**
  * Created by bharaka on 12/21/16.
  */
import akka.actor.{Actor, Props}
import DeveloperActor.NewFeature

class TesterActor extends Actor{

   def receive= {
     case feature:NewFeature => println(s"Testing Feature - '${feature.name}'")
     case _ => println("App Testing")
   }
}

object TesterActor {
  def props = Props(new TesterActor)
}