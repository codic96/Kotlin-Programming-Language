#1 /*if can be used as a if expression*/

fun maxOf(a:Int,b:Int):Int
{
  if(a<b)
  {
    println("Kotlin")
  }
  else
  {
    println("Programming")
  }
}
fun main()
{
  println("The Number are ${maxOf(12,13)}")
}


#2 /* Second method*/

fun maxOf(a:Int,b:Int)= if(a<b) a else b
fun main(){
  println("The Number are ${maxOf(12,11}")

