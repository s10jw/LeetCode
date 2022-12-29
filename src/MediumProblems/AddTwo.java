package MediumProblems;

public class AddTwo {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int node;
        int val1;
        int val2;
        ListNode list = new ListNode();
        while (l1 != null || l2 != null) {
           if (l1 == null) { val1 = 0; } else { val1 = l1.val;}
           if (l2 == null) { val2 = 0;} else { val2 = l2.val;}
           node = val1 + val2 + carry;
           if (node >= 10) {
               carry = 1;
               node = node - 10;
               list = new ListNode(node, list);
               System.out.println(node);
               if (l1 != null) {l1 = l1.next;}
               if (l2 != null) {l2 = l2.next;}
           } else {
               System.out.println(node);
               list = new ListNode(node, list);
               if (l1 != null) {l1 = l1.next;}
               if (l2 != null) {l2 = l2.next;}
               carry = 0;
           }
        }
        return ReverseLinkedList(list);
    }
    public static ListNode ReverseLinkedList(ListNode list) {
        ListNode res = new ListNode();
        while (list != null) {
            res = new ListNode(list.val, res);
            list = list.next;
        }
        return res;
    } public static void main (String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(l1, l2));
    }
}

