object Solution {
    def myPow(x: Double, n: Int): Double = {
        if (n == 0){
            1
        }else if (n == 1){
            x
        }else if (n == -1){
            1 / x
        }else if (n % 2 == 0){
            val half = myPow(x, n / 2)
            half * half
        }else{
            val half = myPow(x, n / 2)
            half * half * myPow(x, n - (n / 2) * 2)
        }
    }
}
