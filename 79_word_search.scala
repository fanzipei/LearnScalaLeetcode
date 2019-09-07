object Solution {
    
    def existRest(board: Array[Array[Char]], word: String, lastLoc: (Int, Int), locSet: Set[(Int, Int)]): Boolean = {
        if (word.isEmpty) true
        else{
            val candidates = Iterator(
                (lastLoc._1 + 1, lastLoc._2),
                (lastLoc._1 - 1, lastLoc._2),
                (lastLoc._1, lastLoc._2 + 1),
                (lastLoc._1, lastLoc._2 - 1)
            ).filter(loc => (loc._1 >= 0 && loc._1 < board.length) && (loc._2 >= 0 && loc._2 < board(0).length) && (board(loc._1)(loc._2) == word.head) && !locSet.contains(loc))
            if (candidates.isEmpty) false else candidates.exists(loc => existRest(board, word.tail, loc, locSet + loc))
        }
    }
    
    def exist(board: Array[Array[Char]], word: String): Boolean = {
        val indices = for{
            (a, i) <- board.iterator.zipWithIndex
            (c, j) <- a.iterator.zipWithIndex
            if( c == word.head )
        } yield i -> j
        if (indices.isEmpty) false else indices.exists(loc => existRest(board, word.tail, loc, Set(loc)))
    }
}
