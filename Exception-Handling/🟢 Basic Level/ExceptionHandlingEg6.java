/*class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}*/
public class ExceptionHandlingEg6 {
    public static void main(String[] args) {
        String name="";
        // System.out.println(name.charAt(7));
        try {
            System.out.println(name.charAt(7));
            //throw new MyException("StringIndexOfBoundException yohoooo");
        } catch (Exception e) {
            // TODO: handle exception
           System.out.println("Index out of bounds exception occurred");
            System.out.println(e.getMessage());
        }
        System.out.println("out of try catch block");
    }
}
