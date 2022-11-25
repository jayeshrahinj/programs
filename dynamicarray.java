import java.util.Scanner;
class dynamicarray
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter size of array");
int n = sc.nextInt();
int a[]=new int[n];
for (int i=1;i<n;i++)
{
a[i] = sc.nextInt();
}
for(int i:a)
{
System.out.println(i);
}
}
}


