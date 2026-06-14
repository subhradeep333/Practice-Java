package Numbers;

//S=a+a^2+a^3+a^4...a^n;
class Series {
    public static void main(String[] args)
    {
        int s=0,a=2,n=7,i;
        for(i=0;i<=n;i++)
        {
            s+=Math.pow(a,i);
        }
        System.out.println(s);
    }

}