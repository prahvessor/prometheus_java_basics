package com.tasks3.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {

        int index = 0;

        LinkedList ll = new LinkedList();

        // fill list by values
        System.out.println("size before = " + ll.size());
        ll.add(0);//0
        ll.add(1);//1
        ll.add(2);//2
        ll.add(3);//3
        ll.add(4);//4
        System.out.println("size after = " + ll.size());

        // print LinkedList
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i)+ " ");
        }

        Integer value = ll.get(index);
        System.out.println("\nlist(" + index + ")= " + value);

        // remove LinkedList by index
        System.out.println("element deleted: " + ll.delete(index));

        // print LinkedList
        System.out.println("size after deleting = " + ll.size());
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
