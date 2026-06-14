class A{
    public void display(){
        System.out.println("display function of A");
    }
    public final void show(){
        System.out.println("show function of class A");
    }
}
class B extends A{
    void output(){
        System.out.println("output function of B");
    }
   /* public void show(){
        System.out.println("show function of class B");
    }*/
}
public class FinalMethod {
   public static void main(String args[]) {
       B ob = new B();
       ob.display();
       ob.show();
       ob.output();
   }
}
