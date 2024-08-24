import java.util.Scanner; //
import java.util.Random;

public class numberGuess {

    static void checkNumber(int num, int compNum) {

        boolean isItTheCompNumber = false;
        int guesses = 1;

        while(!isItTheCompNumber) {
            if (num != compNum) {
                System.out.println("Nope. Not it. \n\n Guess Again(0-10) ... [Guesses so far: " + Integer.toString(guesses) + "]");
                num = getNumber();
            } else {
                isItTheCompNumber = true;
                System.out.println("That's it!\n\n!!!YOU WIN!!!");
//                break;
            }
        }


    }

    static int getNumber() {
        Scanner getNum = new Scanner(System.in);
        return getNum.nextInt();
    }


    public static void main(String[] args) {

        // Getting instance of Random class
        Random rand = new Random();

        // I need two things: a randomized number and a user input number

        int randomNumber = rand.nextInt(11);


        System.out.println("Give me a number between 0 and 10:");

        int myNum = getNumber();
        System.out.println("Your Number is: " + myNum);

        checkNumber(myNum, randomNumber);

    }
}
