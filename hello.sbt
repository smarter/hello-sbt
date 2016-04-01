def main(args: Array[String]): Unit = {
  println("Hello, sbt!")
}

val className = getClass.getName.dropRight(1)
mainClass in Compile := Some(className)
unmanagedClasspath in Runtime += baseDirectory.value / "project/target/config-classes"
