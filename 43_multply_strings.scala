object Solution {

    def multiply(num1: String, num2: String): String = {
        if (num1 == "0" || num2 == "0") "0"
        else{
          val dig1 = num1.reverse.zipWithIndex
          val dig2 = num2.reverse.zipWithIndex
          val digits = for {
            (c1, p1) <- dig1
            (c2, p2) <- dig2
          } yield (p1 + p2 -> (c1 - '0') * (c2 - '0'))
          val rst = digits.groupBy(_._1).mapValues(_.map(_._2).sum).toList.sortBy(_._1).foldLeft(("", 0))((x, y) => (((x._2 + y._2) % 10 + '0').toChar + x._1, (x._2 + y._2) / 10))
          if (rst._2 == 0) rst._1 else {
            rst._2.toString + rst._1
          } 
        }
    }
}
