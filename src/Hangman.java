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
                {
                    {

                        String storedword;
                        char[] charstring;
                        int length;
                        char[] censor;
                        int attempts = 0;

                        StringBuilder pastguesses = new StringBuilder();

                        Scanner typedword = new Scanner(System.in);
                        System.out.println("Enter your word or phrase: ");
                        storedword = typedword.nextLine();
                        storedword = storedword.toUpperCase();
                        length = storedword.length();

                        charstring = storedword.toCharArray();

                        censor = storedword.toCharArray();
                        System.out.println("Your secret word is: ");

                        for (int index = 0; index < length;index++) {
                            censor[index] = '*';
                        }

                        while (String.valueOf(censor).equals(storedword) == false) {

                            char charguess;
                            String tempword;
                            String tempstring;
                            boolean correct = false;
                            int times = 0;
                            boolean repeated = false;

                            for (int a = 0; a < length; a++) {
                                System.out.print(censor[a]);
                            }
                            System.out.println();

                            Scanner guess = new Scanner(System.in);
                            System.out.println("Type in your guess: ");
                            tempword= guess.next();
                            charguess = tempword.charAt(0);

                            pastguesses.append(charguess);
                            tempstring = pastguesses.toString();

                            if(tempstring.lastIndexOf(charguess, tempstring.length()-2) != -1) {
                                System.out.println("You have already guessed that letter, these are your previous guesses: ");
                                pastguesses.deleteCharAt(tempstring.length()-1);
                                System.out.println(tempstring.substring(0, tempstring.length() - 1));
                                repeated = true;
                                System.out.println("Guess again: ");
                            }

                            if(repeated==false) {
                                for (int index=0; index < length; index++) {

                                    if (charstring[index] == Character.toUpperCase(charguess)) {
                                        censor[index] = Character.toUpperCase(charguess);
                                        correct = true;
                                        times++;
                                     }
                                }
                            }
                        }









    public static void hangManImage(int tries) {
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
                }
            }
        }
    }}