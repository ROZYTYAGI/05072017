class Main
{
static class SubMain
{
static void display()
{
System.out.println("Rozy");
}
}
}
class MainMain
{
public static void main(String a[])
{
Main c=new Main();
Main.SubMain c1=c.new SubMain();
c1.display();
}
}
