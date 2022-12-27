package MediumProblems;

public class AddTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = ListToInt(l1) + ListToInt(l2);
        int length = FindLength(val);
        int temp = val / (10^length);
        length = length - 1;

        ListNode res = new ListNode(temp);

        while (length >= 0) {
            res = new ListNode(val, res);

            }
        }
    }
    private int ListToInt(ListNode list) {
    int res = 0;
    int val = 0;
    while (list != null) {
        res += list.val * (10^val);
        list = list.next;
        val++;
        }
    return res;
    }
    private int FindLength(int val) {
        int length = 0;
        long temp = 1;
        while (temp <= val) {
            length++;
            temp = (temp << 3) + (temp << 1);
        }
        return length;
    }
}
