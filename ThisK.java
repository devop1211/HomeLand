class Example
{
private int x,y;
void f1(int x,int y)
{
this.x=x;
this.y=y;
}
void display()
{
int x=11,y=4;
System.out.println(x);
System.out.println(y);
}
}
class ThisK
{
public static void main(String []args)
{
Example e1 = new Example();
e1.f1(5,6);
e1.display();
}
}

