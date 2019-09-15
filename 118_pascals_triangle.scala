object Solution {
    def generate(numRows: Int): List[List[Int]] = {
        numRows match {
            case 0 => List()
            case 1 => List(List(1))
            case _ => List(List(1)) ++ (2 until numRows).scanLeft(List(1, 1))((x: List[Int], y: Int) => List(1) ++ x.sliding(2).map(_.sum).toList ++ List(1)).toList
        }
    }
}
