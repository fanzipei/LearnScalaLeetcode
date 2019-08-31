object Solution {
    def reverse(x: Int): Int = {
        my_reverse(x, 0)
    }
    
    def my_reverse(res: Int, out: Int): Int = {
        if (res == 0) out
        else if (out > 214748364 || (out == 214748364 && res > 7)) 0
        else if (out < -214748364 || (out == -214748364 && res < -8)) 0
        else my_reverse(res / 10, out * 10 + res % 10)
    }
}
