object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {
        if (strs.isEmpty) ""
        else{
            if (strs.map(_.isEmpty).reduce(_ || _)) ""
            else{
                val prefix = strs(0).head
                if (strs.map(_.head == prefix).reduce(_ && _)) prefix + longestCommonPrefix(strs.map(_.tail))
                else ""
            }
        }
    }
}
