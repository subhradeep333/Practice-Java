public class ExceptionHandlingEg {
    public static void main(String[] args) {
        try{
        int a=8,b=0,c;
        c=a/b;
        System.out.println("c="+c);
        }
        catch(Exception e)
        {
            System.out.println("Denominator cannot be zero");
        }
    }
}