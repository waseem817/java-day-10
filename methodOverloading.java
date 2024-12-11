class methodOverloading
{
    static void a()
    {
        System.out.println("hello");
    }
    static void a(int b)
    {
        System.out.println("hello"+" "+b);
    }
    static void a(int b, int c)
    {
        System.out.println("hello"+b+" "+c);
    }
    public static void main(String[] args)
    {
        a();
        a(2);
        a(5,6);
    }
}

