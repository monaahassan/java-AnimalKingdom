package Kingdom;
//fly, breath - lungs, reproduce -eggs

public class Birds extends Animal{
    public Birds (String name, int year){
        super(name, year);
    }
    public String move()
    {
        return "fly";
    }
    public String breathe()
    {
        return "lungs";
    }
    public String reproduce()
    {
        return "eggs";
    }
}
