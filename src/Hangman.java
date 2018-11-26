import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        System.out.println("Hello and welcome to Hangman!!");
        System.out.println("The rules are simple:");
        System.out.println("You input a secret word or phrase and then guess without getting any letters wrong.");
        System.out.println("Have fun and good luck!!");
        int numberOfMisses = 0;
        for (int i = 0; i < 16; i++){
            hangManImage(i);
            {
                int tries = 0;

                String storedword;
                char[] charstring;
                int length;
                char[] censor;
                int attempts = 0;

                StringBuilder pastguesses = new StringBuilder();

                Scanner typedword = new Scanner(System.in);
                System.out.println("Enter word to guess: ");
                storedword = typedword.nextLine();
                storedword = storedword.toUpperCase();
                length = storedword.length();

                charstring = storedword.toCharArray();


                censor = storedword.toCharArray();
                System.out.println("Your secret word is: ");

                for (int index = 0; index < length; index++) {
                    censor[index] = '-';
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
                    System.out.println("Type your guess: ");
                    tempword = guess.next();
                    charguess = tempword.charAt(0);

                    pastguesses.append(charguess);
                    tempstring = pastguesses.toString();


                    if (tempstring.lastIndexOf(charguess, tempstring.length() - 2) != -1) {
                        System.out.println("You already guessed this letter! Guess again. Your previous guesses were: ");
                        pastguesses.deleteCharAt(tempstring.length() - 1);
                        System.out.println(tempstring.substring(0, tempstring.length() - 1));
                        repeated = true;
                    }


                    if (repeated == false) {
                        for (int index = 0; index < length; index++) {

                            if (charstring[index] == Character.toUpperCase(charguess)) {

                                censor[index] = Character.toUpperCase(charguess);
                                correct = true;
                                times++;
                            }
                        }
                        if (correct == true) {
                            System.out.println("The letter " + charguess + " is in the secret word! There are " + times + " " + charguess + " 's in the word. Revealing the letter(s): ");
                        } else if (correct == false) {
                            System.out.println("Sorry, the letter is not in the word. Your secret word looks like this:  ");
                        }
                        System.out.println();
                    }
                    attempts++;
                }
                System.out.println("You guessed the entire word " + storedword.toUpperCase() + " correctly! It took you " + attempts + " attempts!");



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