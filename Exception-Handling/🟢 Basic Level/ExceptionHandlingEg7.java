public class ExceptionHandlingEg7{
    public static void main(String[] args) {
        String name = null;int n = 10;
        try{

            int len = name.length();
            n = n/0;
        }
        catch(ArithmeticException e){
            System.out.println("Number divided by zero");
        }
        // catch(NullPointerException e){
        //     System.out.println("Null pointer error");
        // }
        catch(Exception e){
            System.out.println("General Error");
        }
    }
}