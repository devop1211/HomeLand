abstract class Demo1
{
int x,y;
void f1()
{
x=5;
y=2;
}
abstract void f2();
Demo1()//constructor
{
System.out.println("Parent's Constructor");
}

}

class Demo2 extends Demo1
{
int z;
void f3()
{
z=8;
}
void f2()//override
{
}
Demo2()//constructor
{
System.out.println("Child's's Constructor");
}

}

class Abstract3
{
public static void main(String []args)
{
Demo2 d1=new Demo2();



}
}