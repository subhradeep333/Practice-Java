package Numbers;

/*
Design a class to overload a function series( ) as follows:
        (a) void series(int a, int n) — To display the sum of the series given below:
a - (a/2!) + (a/3!) - (a/4!) + …… n terms
        (b) void series(int n) — To display the sum of the series given below:
        1/2 - 2/3 + 3/4 - 4/5 + …… n terms
Write a main method to create an object and invoke the above methods.
*/
class Practice
{
    int fact(int n)
    {
        if(n==1 || n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    void series(int a,int b)
    {
        double sum=0;
        for(int i=1;i<=b;i++)
        {
            if(i%2==0)
            {
                sum=sum-(a/fact(i));
            }
            else
                sum=sum+(a/fact(i));
        }
        System.out.println("The sum of the series is : "+sum);
    }
    void series(int n)
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                sum=sum-(double)(i/i+1);
            else
                sum=sum+(double)(i/(i+1));
        }
        System.out.println("The sum of the series is : "+sum);
    }
    public static void main(String[] args)
    {
        Practice ob=new Practice();
        ob.series(2,6);
        ob.series(8);
    }
}