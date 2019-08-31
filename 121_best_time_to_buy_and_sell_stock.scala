object Solution {
    def maxProfit(prices: Array[Int]): Int = {
        if (prices.isEmpty) 0
        else prices.scanLeft(prices.head)(Math.min(_, _)).tail zip prices map (x => x._2 - x._1) reduce(Math.max(_, _))
    }
}
