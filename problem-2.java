class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static int addTwoNumbers(ListNode l1, ListNode l2) {

        int first_num = 0;
        int second_num = 0;
        int i = 0;

        // ListNode l3 = new ListNode(0);

        while (l1.next != null){
            first_num += (l1.val * Math.pow(10, i));
            i += 1;
            l1 = l1.next;
        }

        i = 0;

        while (l2.next != null){
            second_num += (l2.val * Math.pow(10, i));
            i += 1;
            l2 = l2.next;
        }

        int result = first_num + second_num;
        String values = Integer.toString(result);

        // for (int j = values.length()-1; j > -1; j-- ){

        // }

        return first_num;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(5, l1);

        System.out.println(addTwoNumbers(l1, l2));



    }
}