package org.example;

public class Phrase {
    public static void main(String[] args) {
        String[] ballPlayers = {"kobe", "Lebron", "Jordan"};
        String[] ballPlayers2 = {"wade", "curry", "Iverson"};
        String[] ballPlayers3 = {"Durrent", "westbrook", "giannis"};
        int playerLength = ballPlayers.length;
        int playerLength2 = ballPlayers2.length;
        int playerLength3 = ballPlayers3.length;

        int rand1 = (int) (Math.random() * playerLength);
        int rand2 = (int) (Math.random() * playerLength2);
        int rand3 = (int) (Math.random() * playerLength3);
        String pharse = ballPlayers[rand1] + " " + ballPlayers2[rand2] + " " + ballPlayers3[rand3];
        System.out.println("What we need is a " + pharse);


    }
}
