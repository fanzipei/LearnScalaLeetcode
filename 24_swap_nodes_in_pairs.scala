object Solution {
    def swapPairs(head: ListNode): ListNode = {
        if (head == null || head.next == null) head
        else{
            val ret = head.next
            head.next = swapPairs(ret.next)
            ret.next = head
            ret
        }
    }
}
