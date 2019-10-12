object Solution {
    def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
        if (target == 0) List(List()) else {
            val comb = for {
                i <- 0 until candidates.length;
                if candidates(i) <= target;
                rest <- combinationSum(candidates.drop(i), target - candidates(i))
            } yield candidates(i) +: rest
            comb.toList
        }
    }
}
