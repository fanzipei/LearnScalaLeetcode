object Solution {
    
    val mat_mul = (x: (Int, Int, Int, Int), y: (Int, Int, Int, Int)) => (x._1 * y._1 + x._2 * y._3, x._1 * y._2 + x._2 * y._4, x._3 * y._1 + x._4 * y._3, x._3 * y._2 + x._4 * y._4)
    
    def fib_mat(n: Int): (Int, Int, Int, Int) = {
        if (n == 1) (1, 1, 1, 0)
        else if (n % 2 == 0) {
            val fib_half = fib_mat(n / 2)
            mat_mul(fib_half, fib_half)
        }else{
            val fib_half = fib_mat(n / 2)
            mat_mul(mat_mul(fib_half, fib_half), (1, 1, 1, 0))
        }
    }
    
    def climbStairs(n: Int): Int = {
        if (n == 1) 1
        else{
            val mat = fib_mat(n - 1)
            mat._1 + mat._2
        }
    }
}
