 class Car
{
int age;


 Car(int ab)
{
this.age=ab;

}
public boolean equals(Car c)
{
Car age=(Car)c;
return(this.age.equals(c.age));
}
}
class MainAge
{
public static void main(String a[])
{
Car ob1=new Car(26);
Car ob2=new Car(27);
System.out.println(ob1.compareTo(ob2));
}
}