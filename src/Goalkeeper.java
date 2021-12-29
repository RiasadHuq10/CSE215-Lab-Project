public class Goalkeeper extends Player
{
    int numberOfCleanSheets;
    int numberOfSaves;
    Goalkeeper()
    {
        this.position = "Goalkeeper";
    }
    Goalkeeper(String name, int age, int numberOfGames, int numberOfCleanSheets, int numberOfSaves)
    {
        this.name = name;
        this.age = age;
        this.position = "Goalkeeper";
        this.numberOfGames = numberOfGames;
        this.numberOfCleanSheets =  numberOfCleanSheets;
        this.numberOfSaves = numberOfSaves;
    }
    public int getNumberOfCleanSheets()
    {
        return numberOfCleanSheets;
    }
    public void setNumberOfCleanSheets(int numberOfCleanSheets)
    {
        this.numberOfCleanSheets = numberOfCleanSheets;
    }
    public int getNumberOfSaves()
    {
        return numberOfSaves;
    }
    public void setNumberOfSaves(int numberOfSaves)
    {
        this.numberOfSaves = numberOfSaves;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() +
                "Number of Saves: " + getNumberOfSaves() + "\n" +
                "Number of Clean Sheets: " + getNumberOfCleanSheets() + "\n";
    }
}
