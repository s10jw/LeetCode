package EasyProblems;

public class MergeLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sentinel = new ListNode();
        ListNode list = sentinel;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                sentinel.next = list2;
                return list.next;
            } else if (list2 == null){
                sentinel.next = list1;
                return list.next;
            } else {
                if (list1.val > list2.val) {
                    sentinel.next = list2;
                    list2 = list2.next;
                } else {
                    sentinel.next = list1;
                    list1 = list1.next;
                }
            }
            sentinel = sentinel.next;
        }
        return list.next;
    }
}
