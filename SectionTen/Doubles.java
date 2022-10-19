import java.io.ObjectOutputStream.PutField;

public class Doubles {
    public static void main(String[] args) {

        /* Task 2
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.   

        */
        int dice1;
        int dice2;

        dice1 = rollDice();
        dice2 = rollDice();

         System.out.println("Dice 1: " + dice1);
         System.out.println("Dice 2: " + dice2 + "\n");

        /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values. 
         */
        while(dice1 != dice2){
            System.out.println("Dice 1: " + dice1 + " Dice 2: " + dice2);
            //re-roll the dice witht he rollDice function
            dice1 = rollDice();
            dice2 = rollDice();
        }
        System.out.println(dice1 + " = " + dice2 + " You rolled doubles!");



        // Task 4: After they roll doubles, print: You rolled doubles!
    }


    /** Task 1 
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */   
     public static int rollDice(){
        //this gives us a randNum from 0.00 to 6.99
        double num = Math.random() * 6;
        //to eliminage the 0 so it's only 1-6
        num +=1;    
        //and we parse it to an integer then return it
        return (int)num;
     }

}





