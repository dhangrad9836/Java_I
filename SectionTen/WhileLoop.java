public class WhileLoop {
    public static void main(String[] args) {
        //while loop keeps running while something is true
       double choice = 0.01;
       double guess = 0.99;

       while(guess > choice){
        guess = Math.random();
        System.out.println(guess);
       }



    }
}
