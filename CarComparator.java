class CarComparator implements Comparator
{
public int compare(Car arg0,Car arg1)
{
retun arg0.getcolor().compareTo(arg1.color);
}
}