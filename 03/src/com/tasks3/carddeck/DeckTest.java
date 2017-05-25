 package com.tasks3.carddeck;

public class DeckTest {
    public static void main(String[] args) {

        // create new deck
        Deck deck = new Deck();

        // print the deck
        System.out.println("----------new deck:-----------");
        for (int i = 0; i < 36; i++) {
            System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
        }

        // shuffle the deck
        deck.shuffle();

        //print shuffled deck
        System.out.println("--------shuffled deck:--------------");
        for (int i = 0; i < 36; i++) {
            System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
        }

        // order the deck
        deck.order();

        // print ordered deck
        System.out.println("--------ordered deck:--------------");
        for (int i = 0; i < 36; i++) {
            System.out.println(deck.cards[i].getSuit().getName() + " " + deck.cards[i].getRank().getName());
        }

        // take top car from the deck
        System.out.println("--------lastCard:--------------");
        while (deck.hasNext()) {
            Card lastCard = deck.drawOne();
            System.out.println(lastCard.getSuit().getName() + " " + lastCard.getRank().getName());
        }
    }
}
