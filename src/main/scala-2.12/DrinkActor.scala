/**
  * Created by bharaka on 12/21/16.
  */

import akka.actor.Actor

class DrinkActor extends Actor{

   def receive ={
     case "tea" => println("Tea time")
     case "cofee" => println("Cofee Time")
     case _ => println("Nothing")
  }

}
