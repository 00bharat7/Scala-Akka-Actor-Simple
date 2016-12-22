import DeveloperActor.{Bug, NewFeature}
import akka.actor.ActorSystem

/**
  * Created by bharaka on 12/21/16.
  */
object Demo {

  def main(args: Array[String]): Unit = {

    val system= ActorSystem.create("Dev-app")

    val devActor=system.actorOf(DeveloperActor.props, "App")
    val testActor=system.actorOf(TesterActor.props, "Test-App")

    devActor ! NewFeature("Sandeep")
    testActor.tell(NewFeature("Raja"),devActor)

    system.terminate()
  }

}
