package kr.revelope

object Ex2ValueAndVariable {
  def main(args: Array[String]): Unit = {
    val a = 10
    println(a)
    val b = "헬로, 스칼라!"
    println(b)
    val c = null
    println(c)
    val d = None
    println(d)
    val e: Int = 10
    println(e)
    val i = Int.MaxValue
    println(i)
    val j = i.longValue() + 1
    println(j)

    type Name = String
    val name: Name = "홍길동"
    println(name)
  }
}
