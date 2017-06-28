

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int userNum = 0;
        char userText = '-';
        String userName = " ";


        System.out.print("Please enter what you would like me to call you: "); // asking for users name
        userName = scnr.nextLine();

        while ((userText != 'n') && (userText != 'N')) { // runs until user presses n

            do {

                System.out.print("Please enter an integer between 1 and 100: "); // asking for user to enter a number

                while (!scnr.hasNextInt()) { // validating user input
                    String input = scnr.next();
                    System.out.println("You did not enter a valid number, please try again!");
                }
                userNum = scnr.nextInt();

            } while (userNum < 0) ;


                if (userNum >= 1 && userNum <= 100) { // if user inputs a number 1-100 stay in this loop


                    if (userNum % 2 == 0) { // if statements for even numbers
                        if (userNum > 0 && userNum < 25) {
                            System.out.println("Even and less than 25");
                        }
                        if (userNum > 26 && userNum < 60) {
                            System.out.println("Even");
                        }
                        if (userNum > 60) {
                            System.out.println("Even");
                        }

                    }

                    if (userNum % 2 == 1) { // if statements for odd numbers
                        System.out.println(userNum + " and " + "odd");
                    } else if (userNum > 60) {
                        System.out.println(" Odd and over 60");
                    }
                } else {
                    System.out.println("Please enter a number between 1 and 100. " + userName); // having user put in a valid number
                }

                System.out.println(userName + " , " + "Would you like to continue? " + " Please press : (y/n)"); // Asking user if they want to continue
                userText = scnr.next().charAt(0);               // If press n- stops, y - continues


                if ((userText != 'n') && (userText != 'N') && (userText != 'y') && (userText != 'Y')) { // if user didn't do y/n
                    System.out.println("ERROR: Please enter a correct letter" + userName); // telling user they did not input a correct letter

                }
                System.out.println(" ");
            }

            return;

        }


    }







