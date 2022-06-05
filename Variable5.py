#1
fun main()
{
  val a = Int =1 //immediate assignment
  val b = 2 //'int' type is inferred
  val c:Int // type required when no initialzer is provided
  c = 3 // deferred assignment
  println("a = $a, b = $b, c= $c")
}

#2 
fun main()
{
  var x =5 //'Int' type is inferred
  x += 1
  println("x = $x")
}

#3
val PI = 3.14
var x = 12

fun incrementX()
{
  x += 1
}
fun main()
{
  println("x = $x")
  incrementX()
}


