package Numbers;

import java.util.*;
class Pronic
{
    int n;
    Pronic(int n)
    {
        this.n=n;
    }
    int check()
    {
        int i;
        for(i=1;i<=n/2;i++)
        {
            if(i*(i+1)==n)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        Pronic ob=new Pronic(n);
        if(ob.check()==1)
            System.out.println("It is a pronic number");
        else
            System.out.println("It is not a pronic numebr");
        sc.close();
    }
}
