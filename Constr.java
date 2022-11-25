class Constr
{
int a,b,c;
Constr(int x,int y,int z)
{
a=x;
b=y;
c=z;
}
void show()
{
System.out.println(a +" " + b + " "+ c);
}
Constr(Constr t)
{
a=t.a;
b=t.b;
c=t.c;
}

public static void main(String args[])
{
Constr t1 = new Constr(10,20,30);
Constr t2 = new Constr(100,200,300);

t1.show();
t2.show();
Constr t3 = new Constr(t2);
t3.show();
}
}