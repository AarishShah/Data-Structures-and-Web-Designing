// From Abdul Bari's Udemy C++ Course. Program to demonstrate the concept of constructors in Java.

class Rectangle
{
    private int length;
    private int breadth;

    public Rectangle()
    {
        length = 0;
        breadth = 0;
    }

    public Rectangle(int l, int b)
    {
        setLength(l);
        setBreadth(b);
    }

    public void setLength(int l)
    {
        length = l;
    }

    public void setBreadth(int b)
    {
        breadth = b;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }

    public int area()
    {
        return length * breadth;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);

        System.out.println(r.area());
        System.out.println(r2.area());
    }
}
