package com.teachmeskills.lesson10.fabric;
/*
this class stores information about the object and a card array
 */
import com.teachmeskills.lesson10.info.Card;

public class CardCreator {
    public static Card[] CreateCards() {
        Card card1 = new Card(567, 23456789, 90.9);
        Card card2 = new Card(567, 23456789, 9.8);
        Card card3 = new Card(976, 89987654, 59.4);
        Card card4 = new Card(123, 11524368, 45.0);
        Card card5 = new Card(321, 93457864, 136.27);

        Card[] cards = new Card[]{card1, card2, card3, card4, card5};
        return cards;
    }
}