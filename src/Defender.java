public class Defender extends Player
{
    int numberOfTackles;
    int numberOfBlocks;
    Defender()
    {
        this.position = "Defender";
    }
    Defender(String name, int age, int numberOfGames, int numberOfBlocks, int numberOfTackles)
    {
        this.name = name;
        this.age = age;
        this.position = "Defender";
        this.numberOfGames = numberOfGames;
        this.numberOfBlocks = numberOfBlocks;
        this.numberOfTackles = numberOfTackles;
    }
    public int getNumberOfBlocks()
    {
        return numberOfBlocks;
    }
    public void setNumberOfBlocks(int numberOfBlocks)
    {
        this.numberOfBlocks = numberOfBlocks;
    }
    public int getNumberOfTackles()
    {
        return numberOfTackles;
    }
    public void setNumberOfTackles(int numberOfTackles)
    {
        this.numberOfTackles = numberOfTackles;
    }
    @Override
    public String getInfo()
    {
        return super.getInfo() +
                "Number of Blocks: " + getNumberOfBlocks() + "\n" +
                "Number of Tackles: " + getNumberOfTackles() + "\n";
    }
}
