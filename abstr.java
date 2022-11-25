abstract class A
{
abstract void show();
void display()
{
System.out.println("hello from class A");
}
}
class B Extends A
{
void show()
{
System.out.println("hello from class b");
}
}
}
class abstr
{
public static void main(String args[])
{
B b1= new B();
b1.show();
b1.display();
}
}