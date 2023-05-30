//*************************************************************************
//M6-Dalmuti.java
//Date: 02/21/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: Develop a Java application that displays the standard Dalmuti
// deck to the user and randomly “deal” two cards from a Dalmuti deck.
//*************************************************************************
public class Main {
    public static void main(String[] args) {

        //variables
        String card = null, userCardName = null, comCardName = null;
        int min = 1; // Minimum value of random range
        int max = 13; // Maximum value of random range

        System.out.println("\n*******Welcome to*******\n ***The Great Dalmuti***\n");
        System.out.println("Here are the cards:\n");

        //generate card list 1-80
        for(int i=1; i<=80; i++) {
            switch (i) {
                case 1:
                    card = "Dalmuti";
                    break;
                case 2: case 3:
                    card = "Archbishop";
                    break;
                case 4: case 6:
                    card = "Earl Marshal";
                    break;
                case 7: case 10:
                    card = "Baroness";
                    break;
                case 11: case 15:
                    card = "Abbess";
                    break;
                case 16: case 21:
                    card = "Knight";
                    break;
                case 22: case 28:
                    card = "Seamstress";
                    break;
                case 29: case 36:
                    card = "Mason";
                    break;
                case 37: case 45:
                    card = "Cook";
                    break;
                case 46: case 55:
                    card = "Shepherdess";
                    break;
                case 56: case 66:
                    card = "Stonecutter";
                    break;
                case 67: case 78:
                    card = "Peasant";
                    break;
                case 79: case 80:
                    card = "Jester";
                    break;
            }
            // print cards
            System.out.printf("Card %s: \t%s\n", i, card);
        }
        //error checking loop
        int userCard = 1, comCard = 1;
        while (userCard == 1 && comCard == 1) {

            //generate and assign random numbers for user and computer
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            userCard = random_int;
            random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            comCard = random_int;

            //determine user card
            if (userCard == 1) {
                userCardName = "Dalmuti";
            } else if (userCard == 2) {
                userCardName = "Archbishop";
            } else if (userCard == 3) {
                userCardName = "Earl Marshal";
            } else if (userCard == 4) {
                userCardName = "Baroness";
            } else if (userCard == 5) {
                userCardName = "Abbess";
            } else if (userCard == 6) {
                userCardName = "Knight";
            } else if (userCard == 7) {
                userCardName = "Seamstress";
            } else if (userCard == 8) {
                userCardName = "Mason";
            } else if (userCard == 9) {
                userCardName = "Cook";
            } else if (userCard == 10) {
                userCardName = "Shepherdess";
            } else if (userCard == 11) {
                userCardName = "Stonecutter";
            } else if (userCard == 12) {
                userCardName = "Peasant";
            } else if (userCard == 13) {
                userCardName = "Jester";
            }
            //determine computer card
            if (comCard == 1) {
                comCardName = "Dalmuti";
            } else if (comCard == 2) {
                comCardName = "Archbishop";
            } else if (comCard == 3) {
                comCardName = "Earl Marshal";
            } else if (comCard == 4) {
                comCardName = "Baroness";
            } else if (comCard == 5) {
                comCardName = "Abbess";
            } else if (comCard == 6) {
                comCardName = "Knight";
            } else if (comCard == 7) {
                comCardName = "Seamstress";
            } else if (comCard == 8) {
                comCardName = "Mason";
            } else if (comCard == 9) {
                comCardName = "Cook";
            } else if (comCard == 10) {
                comCardName = "Shepherdess";
            } else if (comCard == 11) {
                comCardName = "Stonecutter";
            } else if (comCard == 12) {
                comCardName = "Peasant";
            } else if (comCard == 13) {
                comCardName = "Jester";
            }
        }
        //display what cards were drawn
        System.out.printf("\nUser card: \t%s\n", userCardName);
        System.out.printf("Com card: \t%s\n", comCardName);

        //determine and display winner
        if (userCard < comCard) {
            System.out.println("\nUser Wins!");
        } else if (userCard > comCard) {
            System.out.println("\nComputer Wins!");
        } else{
            System.out.println("\nIt's a Tie!");
        }
    }
}
