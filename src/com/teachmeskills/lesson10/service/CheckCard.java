package com.teachmeskills.lesson10.service;
import com.teachmeskills.lesson10.info.Card;
/*
the class contains a method for checking all cards and possible exceptions
 */
public class CheckCard {
    public static void CheckAllCards(Card[] cards) {
        if (cards.length == 0) {
            System.out.println("Unfortunately out system did not find any cards. ");
            return;
        }

        int identicalCards = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].equals(cards[j])) {
                    identicalCards++;
                }
            }
        }
                    if (identicalCards != 0) {
                        System.out.println("the number of identical cards is equal to " + identicalCards);
                    }
                    if (identicalCards == 0) {
                        System.out.println(" Unfortunately out system did not find any identical cards");
                    }
                }
            }





