package com.tasks3.linkedlist;

public class LinkedList {
    int listSize;
    Node first;
    Node last;
    public LinkedList() {
        //PUT YOUR CODE HERE
        first = null;
        last = null;
        listSize = 0;
        //PUT YOUR CODE HERE
    }

    public void add(Integer data) {
        //PUT YOUR CODE HERE
        Node lastNode = last;

        Node newNode = new Node();
        newNode.setNext(null);
        newNode.setData(data);

        last = newNode;
        if (lastNode == null)
            first = newNode;
        else
            lastNode.setNext(newNode);

        listSize++;
        //PUT YOUR CODE HERE
    }

    public Integer get(int index) {
        //PUT YOUR CODE HERE
        Node indexedNode = first;
        for (int i = 0; i < size(); i++) {
            if (i == index) {
                return indexedNode.getData();
            }
            indexedNode = indexedNode.getNext();
        }
        return null;
        //PUT YOUR CODE HERE
    }

    public boolean delete(int index) {
        //PUT YOUR CODE HERE
        boolean flag = false;
        Node previousNode = null;
        Node currentNode = first;

        if (index < listSize) {
            for (int i = 0; i <= index; i++) {

                if (i == index) {

                    if (previousNode != null) {
                        previousNode.setNext(currentNode.getNext());
                    } else {
                        first = first.getNext();
                    }
                    listSize-=1;
                    flag = true;
                }

                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }

        return flag;
        //PUT YOUR CODE HERE
    }

    public int size() {
        //PUT YOUR CODE HERE
        return listSize;
        //PUT YOUR CODE HERE
    }
}
