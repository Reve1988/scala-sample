package kr.revelope

object Ex4Class {
  def main(args: Array[String]): Unit = {
    val car = new Vehicle()
    println("car1")
    println(car.price)
    println(car.hood)

    println()

    val car2 = new Vehicle2(100 * 1000, "expensive hood")
    println("car2")
    println(car2.price)
    println(car2.hood)

    println()

    val car3 = new Vehicle3(100 * 1000, "expensive hood")
    println("car3")
    println(car3.price)
    println(car3.hood)

    println()

    val car4 = Vehicle4(100 * 1000, "expensive hood")
    println("car4")
    println(car4.price)
    println(car4.hood)
  }
}

class Vehicle() {
  var price: Int = 100 * 1000
  var hood: String = "expensive hood"
}

class Vehicle2(p: Int, h: String) {
  var price: Int = p
  var hood: String = h
}

class Vehicle3(var price: Int, var hood: String)

case class Vehicle4(price: Int, hood: String)

object Inherit {
  def main(args: Array[String]): Unit = {
    val paidUser = new PaidUser("홍길동", 20, 'M', 10 * 1000)
    paidUser.sayName()
    paidUser.showMoney()
  }
}

class User(name: String, age: Int, sex: Char) {
  def sayName(): Unit = println("제 이름은 : " + name)
}

class PaidUser(name: String, age: Int, sex: Char, moneny: Int) extends User(name, age, sex) {
  def showMoney(): Unit = println(moneny + "원이 있습니다.")
}

object Trait {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new FlyingWhale
    flyingWhale.fly()
    flyingWhale.swim()

    println()

    val pig = new Pig
    pig.eat()

    println()

    val shoutPig = new ShoutPig
    shoutPig.fly()
    shoutPig.eat()
    shoutPig.shout()
  }
}

trait Swimming {
  def swim(): Unit = println("수영을 합니다.")
}

trait Flying {
  def fly(): Unit = println("납니다.")
}

trait Running {
  def run(): Unit = println("달립니다.")
}

trait Eating {
  def eat()
}

class FlyingWhale extends Flying with Swimming

class Pig extends Eating {
  override def eat(): Unit = println("먹습니다.")
}

abstract class Animal {
  def shout()
}

class ShoutPig extends Animal with Flying with Eating {
  override def shout(): Unit = println("꿀꿀")

  override def eat(): Unit = println("쩝쩝")
}

object MixInTrait {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
    println(robot.shoot2)
    println(robot.shoot3)
  }
}

class Mazinga extends Robot with M16 with Bazooka with Daepodong {
  override def shoot3: String = "푸와앙"
}

abstract class Robot {
  def shoot: String = "뿅뿅"

  def shoot2: String = "뿅뿅"

  def shoot3: String = "뿅뿅"
}

trait M16 extends Robot {
  override def shoot: String = "빵야"

  override def shoot2: String = super.shoot2 + "빵야"

  override def shoot3: String = "빵야"
}

trait Bazooka extends Robot {
  override def shoot: String = "뿌왕뿌왕"

  override def shoot2: String = super.shoot2 + "뿌왕뿌왕"

  override def shoot3: String = "뿌왕뿌왕"
}

trait Daepodong extends Robot {
  override def shoot: String = "콰르르릉"

  override def shoot2: String = super.shoot2 + "콰르르릉"

  override def shoot3: String = "콰르르릉"
}