 package com.tasks3.carddeck;

public class Rank {
    public static final Rank ACE = new Rank("Ace");
    public static final Rank KING = new Rank("King");
    public static final Rank QUEEN = new Rank("Queen");
    public static final Rank JACK = new Rank("Jack");
    public static final Rank TEN = new Rank("10");
    public static final Rank NINE = new Rank("9");
    public static final Rank EIGHT = new Rank("8");
    public static final Rank SEVEN = new Rank("7");
    public static final Rank SIX = new Rank("6");

    public static Rank[] values = { ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX };

    private String name;

    Rank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

