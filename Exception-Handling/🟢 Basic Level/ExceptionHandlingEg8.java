public class ExceptionHandlingEg8 {
    public static void main(String[] args) {
        String name = null;
        int n = 10;

        try {
            int len = name.length();
            n = n / 0;               
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error");
        } catch (Exception e) {
            System.out.println("General Error");
        }
    }
}