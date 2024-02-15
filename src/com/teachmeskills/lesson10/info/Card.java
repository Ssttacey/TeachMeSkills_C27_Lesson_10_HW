package com.teachmeskills.lesson10.info;

import java.util.Objects;
/*
the card class contains fields and a constructor. override equals method
 */

public class Card {
    int cvvCode;
    int cardNumber;
    double amount;

    public Card(int cvvCode, int cardNumber, double amount) {
        this.cvvCode = cvvCode;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvvCode == card.cvvCode && cardNumber == card.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvvCode, cardNumber);
    }
}
