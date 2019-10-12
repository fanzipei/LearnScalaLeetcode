object Solution {
    def generateParenthesis(n: Int): List[String] = {
        if (n == 0){
            List("")
        }else{
            val candidates = for {
                i <- 0 to (n - 1);
                s1 <- generateParenthesis(i);
                s2 <- generateParenthesis(n - i - 1)
            } yield "(" + s1 + ")" + s2
            candidates.toList
        }
    }
}
