import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Hangman!!");
        System.out.println("The rules are simple:");
        System.out.println("You input a secret word or phrase and then guess without getting any letters wrong.");
        System.out.println("Have fun and good luck!!");
        int numberOfMisses = 0;
        for (int i = 0; i < 15; i++){
            hangManImage(i);
            {
                int tries = 0;

                boolean iterated = false;
                String temp = "";
                String holder = "";

                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter your secret word or phrase:");
                String word = keyboard.nextLine();
            }
        }





    }

    private static void hangManImage(int tries) {
        String display = "";
        switch (tries) {

            case 0:
            default:
                System.out.println("    |-------------------------|");
                System.out.println("    |          ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 1:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 2:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          |");
                System.out.println("    |                         | |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 3:
                System.out.println("    |--------------------------|");
                System.out.println("    |                          | ");
                System.out.println("    |                       ( | | )");
                System.out.println("    |                             ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 4:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                        ( | |  )");
                System.out.println("    |                           |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 5:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                           |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 6:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                          ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 7:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |    ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 8:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |    ");
                System.out.println("    |                       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 9:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 10:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 11:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---");
                System.out.println("    |                       |   |");
                System.out.println("    |                       |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 12:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---|");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                       |   |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-----------------------------------");
                break;

            case 13:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---|");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                           |");
                System.out.println("    |                         |   ");
                System.out.println("    |                         |");
                System.out.println("    |                         |");
                System.out.println("----|-----------------------------------");
                break;

            case 14:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---|");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                           |");
                System.out.println("    |                         |   |");
                System.out.println("    |                         |   |");
                System.out.println("    |                         |   |");
                System.out.println("----|-----------------------------------");
                break;

            case 15:
                System.out.println("    |---------------------------|");
                System.out.println("    |                           | ");
                System.out.println("    |                       (  | |  )");
                System.out.println("    |                           |");
                System.out.println("    |                       |---|---|");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                       |   |   |");
                System.out.println("    |                           |");
                System.out.println("    |                         |   |");
                System.out.println("    |                         |   |");
                System.out.println("    |                      __ |   |__");
                System.out.println("----|-----------------------------------");
                break;


        }


    }



}