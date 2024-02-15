package com.teachmeskills.lesson10.run;
import com.teachmeskills.lesson10.fabric.CardCreator;
import com.teachmeskills.lesson10.info.Client;
import com.teachmeskills.lesson10.service.CheckCard;
/*
Contains the main method for running the program
 */

public class Runner {
    public static void main(String[] args) {
        Client client1 = new Client("Alekseychik Artem Vitalievich", "Belarus",  "MC23456", CardCreator.CreateCards());
        System.out.println( client1.toString());
        CheckCard.CheckAllCards(client1.getCards());
    }
}
