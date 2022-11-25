class Arrayargs
{
void add(int a[]);
int sum=0;
for(int i=1;i<=a.length;i++)
{
sum = sum + a[i];
}
System.out.println(sum);

}
public static void main(String args[])
{
 Arrayargs t = new Arrayargs();
int x[]={10,20,30,40,50,60,70,80,90};
int y[]={1,2,3,4,5,6,7,8,9};
t.add(x);
t.add(y);
}
}
