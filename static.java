class staticword
{
static int a;
public static void main(String args[])
{
staticword t1 = new staticword();
staticword t2 = new staticword();
staticword t3 = new staticword();
 t1.a =10;
t2.a =20;
t3.a = 30;
System.out.println(t1.a);
System.out.println(t2.a);
System.out.println(t3.a);
}
}