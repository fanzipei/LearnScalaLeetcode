object Solution {
    def isPalindrome(x: Int): Boolean = {
        if (x < 0) false
        else x == reversed(x, 0)
    }
    
    def reversed(res: Int, out: Int): Int = {
        if (res < 10) out * 10 + res else reversed(res / 10, out * 10 + res % 10)
    }
}
