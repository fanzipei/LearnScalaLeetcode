object Solution {
    def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
        if (l1 == null)  return l2
        else if (l2 == null) return l1
        else if(l1.x < l2.x) {
            val ret = new ListNode(l1.x)
            ret.next = mergeTwoLists(l1.next, l2)
            ret
        }else{
            val ret = new ListNode(l2.x)
            ret.next = mergeTwoLists(l1, l2.next)
            ret
        }
    }
}
