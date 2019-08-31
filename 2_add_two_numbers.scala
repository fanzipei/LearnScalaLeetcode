object Solution {
    
    def addTwoNumbers(l1: ListNode, l2: ListNode, inc: Int = 0): ListNode = {
        if (l1 == null && l2 == null) if (inc == 0) null else (new ListNode(1))
        else if (l1 == null) addTwoNumbers(new ListNode(0), l2, inc)
        else if (l2 == null) addTwoNumbers(l1, new ListNode(0), inc)
        else{
            val value = l1.x + l2.x + inc
            val ln = new ListNode(value % 10)
            ln.next = addTwoNumbers(l1.next, l2.next, value / 10)
            ln
        }
    }
}
