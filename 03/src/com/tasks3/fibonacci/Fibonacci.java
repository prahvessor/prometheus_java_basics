package com.tasks3.fibonacci;

public class Fibonacci
{
    public long getNumber(int position){
        //PUT YOUR CODE HERE
        if (position <= 0) {
            return -1;
        }
        //if (position == 0) return 0;
        if (position == 1) return 1;
        if (position == 2) return 1;
        return getNumber(position - 1) + getNumber(position - 2);
        //PUT YOUR CODE HERE
    }
}
