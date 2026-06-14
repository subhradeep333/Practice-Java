public class ExceptionHandlingEg9 {
    public static void main(String[] args) {
        String name = null;
        int n = 10;
        try{
            try{
                int len = name.length();
            }
            catch(NullPointerException e){
                System.out.println("Null pointer error");
            }
       
            try {
                n = n/0;
            } catch (ArithmeticException e) {
                // TODO: handle exception
                System.out.println("Divided by zero error");
            }
        }
        catch(Exception e){
            System.out.println("Other error 2");
        }
    }
}
