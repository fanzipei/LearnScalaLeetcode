object Solution {
    def shoppingOffers(price: List[Int], special: List[List[Int]], needs: List[Int]): Int = {
        val special_filtered = special.filter(x => (x.init zip needs).map(y => y._1 <= y._2).reduce(_ && _))
        (special_filtered.map(x => x.last + shoppingOffers(price, special_filtered, (needs zip x.init).map(y => y._1 - y._2))) ++ List((price zip needs).map(x => x._1 * x._2).reduce(_ + _))).reduce(Math.min)
    }
}
