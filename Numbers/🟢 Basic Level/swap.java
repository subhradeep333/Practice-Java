package Numbers;

import java.util.*;
class swap 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swapping\na= "+a+",b= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping\na= "+a+",b= "+b);
        sc.close();
    }    
}