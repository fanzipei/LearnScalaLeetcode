object Solution {
    def letterCombinations(digits: String): List[String] = {
        if (digits.isEmpty) List() else{
            val keyMap = Map('2' -> "abc", '3' -> "def", '4' -> "ghi", '5' -> "jkl", '6' -> "mno", '7' -> "pqrs", '8' -> "tuv", '9' -> "wxyz")
            digits.map(keyMap).foldLeft(List(""))(for {a <- _; b <- _} yield (a + b))
        }
    }
}
