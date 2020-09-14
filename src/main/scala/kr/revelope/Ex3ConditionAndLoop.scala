package kr.revelope

object Ex3ConditionAndLoop {
  def main(args: Array[String]): Unit = {
    var x = 20

    println("======= if문")

    if (x > 15) {
      println("15보다 큽니다.")
    } else if (x < 15) {
      println("15보다 작습니다.")
    } else {
      println("15입니다.")
    }

    if (x > 15) println("15보다 큽니다.")

    println("======= for문")

    for (x <- 1 to 10) {
      print(x + " ")
    }
    println()

    for (x <- 1 until 10) {
      print(x + " ")
    }
    println()

    for (x <- 1 to 3; y <- 1 to 3) {
      println(x + " X " + y + " = " + (x * y))
    }

    for (x <- 1 to 3; y <- 1 to 3; z <- 1 to 3) {
      println(x + " X " + y + " X " + z + " = " + (x * y * z))
    }

    println("======= while문")

    x = 1
    while (x < 20) {
      print(x + " ")
      x = x + 1
    }
    println()

    x = 1
    do {
      print(x + " ")
      x = x + 1
    } while (x < 20)
    println()

    println("======= 조건이 있는 반복문")

    for (x <- 1 to 10 if x % 2 == 0) {
      print(x + " ")
    }
    println()

    for (x <- 1 to 3; y <- 1 to 3 if x > 1 && y < 3) {
      println(x + " X " + y + " = " + (x * y))
    }

    println("======= 인덱스가 있는 for문")

    for ((num, index) <- (1 to 10).zipWithIndex) {
      println(index + " : " + num)
    }
  }
}
