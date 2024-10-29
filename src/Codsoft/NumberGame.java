package Codsoft;
import java.util.*;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int generatedNumber=r.nextInt(100);
        int score=5;
        System.out.println("THE NUMBER GAME...");
        System.out.println("You only have 5 attempts to guess the generated number ranged between 1 to 100 ");
        for(int i=1;i<=5;i++) {
            System.out.println("Attempt "+ i + " , Guess the number : ");
            int guessedNumber = sc.nextInt();
            if(guessedNumber>generatedNumber){
                System.out.println("TOO HIGH");
                score--;
            }
            else if(guessedNumber==generatedNumber){
                System.out.println("HOORAH ! CORRECT GUESS");
                break;
            }
            else{
                System.out.println("TOO LOW");
                score--;
            }
        }
        System.out.println("The genarated number is : "+ generatedNumber);
        System.out.println("Your score is : "+ score + " out of 5");

    }
}

