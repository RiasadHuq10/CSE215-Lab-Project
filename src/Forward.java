public class Forward extends Player
{
    int numberOfGoals;
    int numberOfShots;
    Forward()
    {
        this.position = "Forward";
    }
    Forward(String name, int age, int numberOfGames, int numberOfGoals, int numberOfShots)
    {
        this.name = name;
        this.age = age;
        this.position = "Forward";
        this.numberOfGames = numberOfGames;
        this.numberOfGoals =  numberOfGoals;
        this.numberOfShots = numberOfShots;
    }
    public int getNumberOfGoals()
    {
        return numberOfGoals;
    }
    public void setNumberOfGoals(int numberOfGoals)
    {
        this.numberOfGoals = numberOfGoals;
    }
    public int getNumberOfShots()
    {
        return numberOfShots;
    }
    public void setNumberOfShots(int numberOfShots)
    {
        this.numberOfShots = numberOfShots;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() +
                "Number of Shots: " + getNumberOfShots() + "\n" +
                "Number of Goals: " + getNumberOfGoals() + "\n";
    }
}
