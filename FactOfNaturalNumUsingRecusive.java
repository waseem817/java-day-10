public class FactOfNaturalNumUsingRecusive 
{
    int sum(int n)
    {
        if(n==0)
        return 1;
        return n*sum(n-1);
    }
    public static void main(String[] args)
    {
        FactOfNaturalNumUsingRecusive ob=new FactOfNaturalNumUsingRecusive();
        int res=ob.sum(10);
        System.out.println(res);
    }
    
}
