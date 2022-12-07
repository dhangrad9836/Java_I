public class MethodOverloading {
    public static void main(String[] args){
        Test obj1 = new Test();
        obj1.m1(10);
        obj1.m1(3.5);
        obj1.m1(5, 6);

    }//end main
}//end class

///method overloading is when you have two or more of the same methods with diffrent parameters. If you pass in a whole number the the method witht the int will run. If you pass in a parameter with a decimal then the method with the double will run
class Test{
    void m1(int a){
        System.out.println("Int value = " + a);
    }
    void m1(double a){
        System.out.println("Double value = " + a * 2);
    }
    void m1(int a, int b){
        System.out.println("value 1 = " + a);
        System.out.println("value 2 = " + b);
    }
}
