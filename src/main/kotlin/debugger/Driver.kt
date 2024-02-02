package debugger

object Driver {
  @JvmStatic
  fun main(args: Array<String>) {
    println("Started")
    val mainClassName = args[0]
    val mainClass = javaClass.classLoader.loadClass(mainClassName)
    val mainMethod = mainClass.getDeclaredMethod("main")
    mainMethod.invoke(null)
    println("Ended")
  }
}
