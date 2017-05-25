package com.tasks3.carddeck;
public class Deck {
    public int topCard = 36;

    public Card[] cards = new Card[36];

    public Deck() {

        for (int i = 0; i < 36; i++) {
            cards[i] = new Card(Rank.values[i % 9],Suit.values[i % 4]);
        }
    }

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        Card[] left = new Card[18];
        Card[] right = new Card[18];
        Card[] shift = new Card[1];

        for (int n = 0; n < 61; n++) {
            for (int i = 0; i < 18; i++) {
                left[i] = cards[i];
                right[i] = cards[i + 18];
            }

            for (int i = 0, j = 0, k = 0; i < 36; i++) {
                if ((i % 2) == 1) {
                    cards[i] = right[j];
                    j++;
//                    System.out.println(i + " " + j);
                } else {
                    cards[i] = left[k];
                    k++;
//                    System.out.println(i + " " + k);

                }
            }
            shift[0] = cards[0];
            cards[0] = cards[35];
            cards[35] = shift[0];
        }
    }
    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                cards[k] = new Card(Rank.values[j],Suit.values[i]);
                k++;
            }
        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (topCard > 0) {
            return true;
        } else {
            return false;
        }
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        if (hasNext()) {
            topCard--;
            return cards[topCard];
        } else {
            return null;
        }
    }
}
