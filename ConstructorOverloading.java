class Constructor
{
    String name;
    Constructor()
    {
        name="Waseem";
    }
    Constructor(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
}
class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Constructor c1=new Constructor();
        c1.display();
        Constructor c2=new Constructor("Mudassir");
        c2.display();
    }
}
