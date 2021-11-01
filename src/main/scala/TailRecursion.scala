import scala.annotation.tailrec

class TailRecursion {
  def length(list: List[Int]): Int = {
   @tailrec def getLength(list: List[Int], result: Int): Int = {
      if (list.isEmpty) result
      else getLength(list.tail, 1 + result)
    }

    getLength(list, 0)
  }
}

object main extends App {
  val trec = new TailRecursion
  val list: List[Int] = List(26,10,19,96)
  println(trec.length(list))
}