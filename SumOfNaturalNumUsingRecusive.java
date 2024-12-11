public class SumOfNaturalNumUsingRecusive 
{
    int sum(int n)
    {
        if(n==0)
        return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        SumOfNaturalNumUsingRecusive ob=new SumOfNaturalNumUsingRecusive();
        int res=ob.sum(10);
        System.out.println(res);
    }
    
}
