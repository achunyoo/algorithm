package com.chun.listNode;

/**
 * @description: 合并两个有序链表
 * @author: chun
 **/
 class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class mergeTwoList {



    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        ListNode res = merge(l1,l2);
        while(res != null){
            System.out.println(res.val);
            res = res.next;
        }

    }


    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode cur = new ListNode();
        ListNode dummy = cur;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 != null ? l1 : l2;

        return dummy.next;
    }
}
