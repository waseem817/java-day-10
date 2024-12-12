class AccesingOneClassInAnother
{
    String name;
    AccesingOneClassInAnother(String name)
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);  
    }
    void agt()
    {
        Teacher t1=new Teacher();
        t1.teach(this);
    }
    public static void main(String[] args)
    {
        AccesingOneClassInAnother c1=new AccesingOneClassInAnother("Mudassir");
        c1.agt();
    }
}
class Teacher
{
    public void teach(AccesingOneClassInAnother t1)
    {
        t1.dis1();
    }
}
