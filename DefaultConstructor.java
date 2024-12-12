class Constructor
{
    int c;
    String b;
    Constructor()
    {
        this.c=345;
        this.b="hello world";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
class DefaultConstructor
{
    public static void main(String[] args)
    {
        Constructor c1=new Constructor();
        c1.display();
    }
}
