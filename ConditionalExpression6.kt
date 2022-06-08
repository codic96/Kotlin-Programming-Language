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
}


 #3 /* For Loop*/
 
 var items = ("apple","banana","grapes")
 for(item in items)
  {
    println(item)
  }  

  #4 /* while loop */
  
  var item = listOf("apple","banana","grapes")
  val index = 0
  while(item<index)
  {
    println("The Number are ${item.index}")
    index++
  } 

  #5 When Expression 
for describe(obj : Any): String = when(obj)
{
  1 -> "Hello"
  2 -> "World"
  else -> "unknown"
}
fun main()
{
  println(describe(1))
  println(describe(2))
} 

#6 For  Range Expression

fun main()
{
  val x = 10
  val y = 11
  for (x in 1..10)
  {
    println(x)
  }
}

fun main()
{
  val x = 9
  val y = 8
  if(x==y)
  {
    println("x equal to y")
  }
  else
  {
    println("x is not equal to y")
  }
  
