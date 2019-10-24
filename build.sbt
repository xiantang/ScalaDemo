import scala.sys.process._
name := "ScalaDemo"

version := "0.1"

scalaVersion := "2.13.1"

//lazy val execScript = taskKey[Unit]("Execute the shell script")
//
//execScript := {
//  "git clone ssh://vcs-user@codes.growingio.com/source/skywalking-agent.git ./agent" !
//}
lazy val buildFrontend = taskKey[Unit]("Execute frontend scripts")


buildFrontend := {
  "git clone ssh://vcs-user@codes.growingio.com/source/skywalking-agent.git ./agent" !
}
//val helloTask = TaskKey[Unit]("hello", "Print hello")
//
//helloTask := println("hello world")