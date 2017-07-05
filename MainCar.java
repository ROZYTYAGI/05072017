 class Car
{
String model;
String color;
String name;

 Car(String ab,String bc,String cd)
{
this.model=ab;
this.color=bc;
this.name=cd;
}
public boolean equals(Car c)
{
return(this.model.equals(c.model)&&this.color.equals(c.color)&&this.name.equals(c.name));
}
}
class MainCar
{
public static void main(String a[])
{
Car ob1=new Car("A6","Black","audi");
Car ob2=new Car("A6","Black","audi");
System.out.println(ob1.equals(ob2));
}
}