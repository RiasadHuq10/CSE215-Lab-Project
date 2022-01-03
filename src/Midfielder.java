public class Midfielder extends Player implements FieldPlayer
{
    int numberOfAssists;
    int numberOfPasses;
    Midfielder()
    {
        this.position = "Midfielder";
    }
    Midfielder(String name, int age, int numberOfGames, int numberOfAssists, int numberOfPasses)
    {
        this.name = name;
        this.age = age;
        this.position = "Midfielder";
        this.numberOfGames = numberOfGames;
        this.numberOfAssists =  numberOfAssists;
        this.numberOfPasses = numberOfPasses;
    }
    public int getNumberOfPasses()
    {
        return numberOfPasses;
    }
    public void setNumberOfPasses(int numberOfPasses)
    {
        this.numberOfPasses = numberOfPasses;
    }
    public int getNumberOfAssists()
    {
        return numberOfAssists;
    }
    public void setNumberOfAssists(int numberOfAssists)
    {
        this.numberOfAssists = numberOfAssists;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() +
                "Number of Passes: " + getNumberOfPasses() + "\n" +
                "Number of Assists: " + getNumberOfAssists() + "\n";
    }
}
