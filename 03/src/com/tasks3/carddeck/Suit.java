 package com.tasks3.carddeck;

public class Suit {
    public static final Suit HEARTS = new Suit("HEARTS");
    public static final Suit DIAMONDS = new Suit("DIAMONDS");
    public static final Suit CLUBS = new Suit("CLUBS");
    public static final Suit SPADES = new Suit("SPADES");

    public static Suit[] values = { HEARTS, DIAMONDS, CLUBS, SPADES};

    private String name;

    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}