fun main()
{
  var a =1
  val s1 = "a is $a"
  //simple name in template
  a = 2
  //arbitrary expression in template:
  val s2 = "${s1.replace("is","was")} but now is $a"
  println("The name are : $s2")
