public class ExceptionHandlingEg2 {
    public static void main(String[] args) {
        try {
            int balance=0;
            if(balance>0)
            System.out.println("Balance :"+balance);
            else
                throw new Exception("Zero Balance");
        } catch (Exception e) {
            // TODO: handle exception
            //System.err.println("Zero Balance");
            System.out.println(e.getMessage());
        }
    }
}
