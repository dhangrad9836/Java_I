import java.util.Scanner;

public class DiceJack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        //check if number is less than 1
        if(num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Number cannot be less than 1. Shutting game down");
            System.exit(0);
        }
        //check if number is greater than 6
        if(num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Number cannot be greater than 6. Shutting game down");
            System.exit(0);
        }

        //if all numbers pass the checks add them up
        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumOfDiceRolls + ". Number sum = " + sumOfNumbers);

        //call checkWin() function
        if(checkWin(sumOfDiceRolls, sumOfNumbers)){
            System.out.println("Congrats! You win");
        }else{
            System.out.println("Sorry you lose");
        }



        scan.close();
        
    }//end main

    public static int rollDice(){
        //this produces a random number from 0 - 5.999
        double randomNumber = Math.random() * 6;
        randomNumber += 1;  //this shifts our selection from 0 - 5.999 ... to 1 - 6.999
        //we type casted the randomNumber to an int to round the decimal to a whole number
        return (int)randomNumber;
    }// end rollDice

    public static boolean checkWin(int sumOfDiceRolls, int sumOfNumbers){
        return (sumOfNumbers > sumOfDiceRolls && sumOfNumbers - sumOfDiceRolls < 3);
    }
    // public static void checkWin(int sumOfDiceRolls, int sumOfNumbers){
    //     if(sumOfNumbers > sumOfDiceRolls && sumOfNumbers - sumOfDiceRolls < 3){
    //         System.out.println("You win");
    //     } else{
    //         System.out.println("Sorry you lose");
    //     }
    // }
}