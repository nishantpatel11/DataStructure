package com.org.datastructure.operation;

public class LinkedListOperation {

    Node head;
    LinkedListOperation(){
        head = null;
    }
    public LinkedListOperation(Integer data){
        this.head = new Node(data);
    }

    public Integer getLength(){
        int count =0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node addNode(Integer data){
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node temp = head;
        while (temp != null)
            temp = temp.next;

        temp = new Node(data);
        return head;
    }

    public Integer removeNodeFromLast() {
        if (head == null) {
            return -1;
        }

        if (head.next == null){
            head =null;
            return head.data;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        int tData = temp.next.data;
        temp.next = null;
        return tData;
    }

    public Integer removeNodeFromFirst() {
        if (head == null) {
            return -1;
        }

        int tData = head.data;
        head = head.next;
        return tData;
    }


    public Node reverseLinkedList(){

        Node curr = head;
        Node prev = null;
        Node next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }

    public Node reverseLinkedList(int k){

        Node curr = head;
        Node prev = null;
        Node next = null;

        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
        }
        if(next != null)
            head.next = reverseLinkedList(k);

        head = prev;
        return head;
    }

    public Node kthAlternateReverseNode(Node node,int k, boolean b){

        int count = 1;
        Node curr = node;
        Node prev = null;
        Node next = null;
        while(curr != null && count <= k){
            next = curr.next;
            if(b)
                curr.next = prev;
            prev = curr;
            curr = next;
            count ++;
        }

        if(b) {
            node.next = kthAlternateReverseNode(curr, k, !b);
            return prev;
        }else{
            prev.next = kthAlternateReverseNode(curr,k,!b);
            return node;
        }
    }

}
class Node{

    Integer data;
    Node next;

    public Node(Integer data){
        this.data = data;
        this.next = null;
    }
}