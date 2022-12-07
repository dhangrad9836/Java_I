public class AccessModifies {
    public static void main(String[] args){
        A1 obj1 = new A1();
      //  obj1.b = 9;


    }//end main
}//end class

//definition of access modifiers; If you declare a class public...it can be accessed in the entire java project and all of the packages that it part of. If you don't declare something public then it has the default access modifies and can only be access in the current package. IF something is declared as private that it can only be accessed via the same class and not anywhere inside that package. ie: here we have two classess...AccessModifiers and A1 ..if we declared one of the variables a or b as private then only inside the class A1 can access those variables not class AccessModifiers

class A1{
    public int a;
    //private int b;

    void m1(){

    }
}
class A2 extends A1{
    public int b;
    //private int b;

    void m1(){

    }
}

