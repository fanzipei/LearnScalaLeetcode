object Solution {
    def canPlaceFlowers(flowerbed: Array[Int], n: Int): Boolean = {
        val notValid = flowerbed.zipWithIndex.filter(_._1 == 1).map(_._2)
        ((Iterable(-2) ++ notValid) zip (notValid ++ Iterable(flowerbed.length + 1))).map(x => (x._2 - x._1 - 2) / 2).filter(_ >= 1).sum >= n
    }
}
