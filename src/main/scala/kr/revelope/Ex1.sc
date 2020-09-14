println("Welcome to the Scala worksheet")

val a = 10
10 + 20

val list = List(1, 2, 3, 4, 5)
val set = Set("hey!", "banga~")

list.foldRight(5)((result, i) => result + i)
set.foldRight("hi!")((result, i) => result + i)