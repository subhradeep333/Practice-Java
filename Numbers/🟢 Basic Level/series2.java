package Numbers;

//S=1+1/2!+....+1/n!
class Series1
{
    public static void main(String[] args)
    {
        int i,n=5,f=1;
        double s=0;
        for(i=1;i<=n;i++)
        {
            f=1;
            for(int j=1;j<=i;j++)
            {
                f*=j;
            }
            s+=1.0/f;
        }
        System.out.println(s);
    }
}