class Demo
{
int x,y;
Demo(int p,int q)
{
x=p;
y=q;
}
Demo()
{

}
Demo(int p)
{
x=p;
}



}
class Construct7
{
public static void main(String []args)
{
Demo d1 =new Demo(5,6);
Demo d2=new Demo(7,9);
Demo d3=new Demo();
Demo d4=new Demo(7);

}
}