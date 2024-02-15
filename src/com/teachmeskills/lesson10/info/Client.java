package com.teachmeskills.lesson10.info;
/*
The client class has fields with client data and a constructor.
overrides the to-string method
*/

public class Client {
    private String fullName;
    private String country;
    private String passportNumber;
    private Card[] cards;


    public Client(String fullName, String country, String passportNumber, Card[] cards) {
        this.fullName = fullName;
        this.country = country;
        this.passportNumber = passportNumber;
        this.cards = cards;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}


