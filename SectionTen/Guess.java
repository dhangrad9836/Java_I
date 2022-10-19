import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        

       /* Task 1 
            1. Store a "secret" number between 1 and 5. 
            2. Then, prompt the user to enter a guess.
       */
      int secretNumber = 3;
      System.out.println("Try to select my secret number from 1 - 5");
       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);       
      int userGuess = scan.nextInt();


        /* Task 2 
            1. Set up a loop that keeps running while the user is incorrect
               Every time they get it wrong, write 'Guess again: '

            2. Once they guess it, print: You got it!
        */        
        while(userGuess != secretNumber){
            System.out.println("Guess again: ");
            userGuess = scan.nextInt();
        }
        System.out.println("You got it!");

        scan.close();
    }

}
