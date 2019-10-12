object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        strs.toList.groupBy(_.toSeq.sorted).values.toList
    }
}
