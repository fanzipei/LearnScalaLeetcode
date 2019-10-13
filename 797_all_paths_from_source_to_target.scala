object Solution {
    def allPathsSourceTarget(graph: Array[Array[Int]], beg: Int = 0): List[List[Int]] = {
        if (beg == graph.length - 1){
            List(List(beg))
        }else{
            (for {
                step <- graph(beg);
                rest <- allPathsSourceTarget(graph, step)
            } yield beg +: rest).toList
        }
    }
}
