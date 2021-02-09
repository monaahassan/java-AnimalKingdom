package Kingdom;
//name, year, move, breath, and reproduce
public class Mammals extends Animal
{
public Mammals(String name, int year)
{
  super(name, year);
}
@Override
public String move()
{
  return "ambulate";
}
@Override
public String breathe()
{
  return "lungs";
}
@Override
public String reproduce()
{
  return "live birth";
}
}
