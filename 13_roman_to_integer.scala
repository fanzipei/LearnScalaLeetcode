object Solution {
    def romanToInt(s: String): Int = {
        if (s == "") 0
        else s.head match {
            case 'V' => 5 + romanToInt(s.tail)
            case 'L' => 50 + romanToInt(s.tail)
            case 'D' => 500 + romanToInt(s.tail)
            case 'M' => 1000 + romanToInt(s.tail)
            case 'I' => if (s.tail == "") 1 else s.tail.head match {
                case 'V' => 4 + romanToInt(s.tail.tail)
                case 'X' => 9 + romanToInt(s.tail.tail)
                case _ => 1 + romanToInt(s.tail)
            }
            case 'X' => if (s.tail == "") 10 else s.tail.head match {
                case 'L' => 40 + romanToInt(s.tail.tail)
                case 'C' => 90 + romanToInt(s.tail.tail)
                case _ => 10 + romanToInt(s.tail)
            }
            case 'C' => if (s.tail == "") 100 else s.tail.head match {
                case 'D' => 400 + romanToInt(s.tail.tail)
                case 'M' => 900 + romanToInt(s.tail.tail)
                case _ => 100 + romanToInt(s.tail)
            }
        }
    }
}
