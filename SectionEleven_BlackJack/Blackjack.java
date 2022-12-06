import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        
               
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();     

        //Return a random number from 1 - 13, store in a variable
        int playerCardOne = drawRandomCard();
        int playerCardTwo = drawRandomCard();

        //Return random card
        

        //Task 4 – Get two random cards.
         String playerCard1 = cardString(playerCardOne);
         String playerCard2 = cardString(playerCardTwo);
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        System.out.println("\n You get a \n" + playerCard1 + "\n and a \n" + playerCard2);

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        //sum of players total
        int playerSum = playerCardOne + playerCardTwo;
        System.out.println("your total is: " + playerSum);

        //dealer cards get random number
         int dealerCardOne = drawRandomCard();
        int dealerCardTwo = drawRandomCard();

        // String dealerCard1 = cardString(dealerCardOne);
        //  String dealerCard2 = cardString(dealerCardTwo);
        
        //Task 6 – Get two random cards for the dealer.
         String dealerCard1 = cardString(dealerCardOne);
         String dealerCard2 = cardString(dealerCardTwo);
         String faceDownCard = faceDown();
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        System.out.println("The dealer shows \n" + dealerCard1 + "\nand has a card facing down \n" + faceDownCard);
        System.out.println("\nThe dealer's total is hidden");
   
        //test hitOrStay function just for testing will not actually be in production
        // String userMove = hitOrStay();
        // System.out.println("The user wants to " + userMove.toLowerCase());

        //create while loop that runs forever and validate if player hits or stays
        //if player stays break the loop
       while(true){
        String option = hitOrStay();
        if(option.equals("stay")){
            break;
        } //this runs when the player hits
        int newCard = drawRandomCard();
        playerSum += newCard;
        System.out.println("/nYou get a /n " + cardString(newCard));
        System.out.println("Your new total is " + playerSum);
        
        if(playerSum > 21){
            System.out.println("Bust!! Player Loses.");
            System.exit(0);
        }

       }//end while loop

       //task 10 Dealers turn
       System.out.println("/nDealer't turn");
       System.out.println("/nThe dealer's cards are /n" + dealerCard1 + "/n " 
       + dealerCard2);



        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        
        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }//end main function

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard(){
        double randNum = Math.random() * 13;
        randNum += 1;
        return (int)randNum;
    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int cardNumber){
        switch(cardNumber){
            case 1: return 
            
                    "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n";

            case 2: return
                    "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";

            case 3: return
                    "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";

            case 4: return
                    "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5: return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6: return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7: return
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";

            case 8: return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";

            case 9: return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10: return
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";

            case 11: return
                    "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";

            case 12: return                    
                    "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";

            case 13: return
                    "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default : return "This should not get called";
        
        }
    } //end cardString function

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){       
        System.out.println("Do you want to hit or stay?");
        String userMove = scan.nextLine();
        while(!(userMove.equalsIgnoreCase("hit") || userMove.equalsIgnoreCase("stay"))){
            System.out.println("Please write 'hit or 'stay'");
            //pick up the usermove
             userMove = scan.nextLine();
        }
        return userMove;

    }

    } //end BlackJack class

