package lectures.part1basics

object ValuesVariablesTypes extends App{
  val x: Int = 42
  println(x)

  // VALs are immutable
  //    x = 2
  //    > Reassignment to val x
  //      x = 2

  // COMPILER can infer types
  //  val y: Int = "hello, Scala" - Fails

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 51525131515L
  val aFloat: Float = 2.0
  val aDouble: Double = 3.14

  // Variables
  var aVariable: Int = 4

  // aVariable = 5 // side effect

}