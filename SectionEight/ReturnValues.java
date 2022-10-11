public class ReturnValues {
       public static void main(String[] args) {
        double measure1 =  measureRectangle(-5, 2.2, "area");
        double measure2 =  measureRectangle(1.3, 6.2, "perimeter");
        System.out.println(measure1);    

        stringPrinter(4.3, 2.2, measure1, "area");
        stringPrinter(1.3, 6.2, measure2, "perimeter");
    }

    public static double measureRectangle(double len, double wid, String option){
        /**
         * check to see if len or width is less than zero
         */
        if(len < 0 || wid < 0){
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }

         switch (option){
            case "area": return len * wid;
            case "perimeter": return 2 * (len + wid);
            default: return 404;
         }
    }

    public static void stringPrinter(double length, double width, double area, String option){
        System.out.println("The " + option + " of a rectangle with length " + length + " and width " + width
        + " is equal to " + area + "\n");

    }


}//end ReturnValues class
