class Tree
{
class SubTree
{
void display()
{
System.out.println("this is inner class");
}
}
}
class MainTre
{
public static void main(String a[])
{
Tree n1=new Tree();
Tree.SubTree n2=n1.new SubTree();
n2.display();
}
}