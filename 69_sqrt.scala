object Solution {
    
    def mySqrt(x: Int, beg: Int = 0, end2: Int = -1): Int = {
        val end = if (end2 < 0) x else end2
        if (x == 1){
            1
        } else if (end - beg <= 1) {
            beg
        } else {
            val mid = ((beg + end) / 2).toLong
            if (mid * mid > x.toLong) mySqrt(x, beg, mid.toInt) else mySqrt(x, mid.toInt, end)
        }
    }
}
