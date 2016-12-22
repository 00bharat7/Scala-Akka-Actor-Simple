import akka.actor.{ActorSystem, Props}

/**
  * Created by bharaka on 12/21/16.
  */
object ActorDemo {
  def main(args: Array[String]): Unit = {

    val system=ActorSystem("drinks")
    val props=Props[DrinkActor]

    val drinkActor= system.actorOf(props,"drinks-1")

    drinkActor ! "tea"
    drinkActor ! "cofee"
    drinkActor ! "Bed"

  }

}
