public class ClassesAndObjects{
    public static void main(String[] args){

        Dog obj1 = new Dog("Labrador", "White");
        Dog obj2 = new Dog("German Sheppard", "Brown");
        

    }//end main 

}//end ClassesAndObjects class

class Dog{

    String breed;
    String color;

    //constructor
    Dog(String b, String c){
        breed = b;
        color = c;
    }

    void bark(){
        System.out.println("Barks");
    }
    void walk(){
        System.out.println("Walks");
    }
}