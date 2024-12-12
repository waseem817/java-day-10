class Constructor
{
    int c;
    String b;
    Constructor(int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
class ParameterConstructor
{
    public static void main(String[] args)
    {
        Constructor c1=new Constructor(678,"jakeel");
        c1.display();
    }
}
