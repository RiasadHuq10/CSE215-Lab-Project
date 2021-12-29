public abstract class Player
{
    String name;
    int age;
    int numberOfGames;
    String position;
    Player()
    {

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getNumberOfGames()
    {
        return numberOfGames;
    }
    public void setNumberOfGames(int numberOfGames)
    {
        this.numberOfGames = numberOfGames;
    }
    public String getPosition()
    {
        return position;
    }
    public void setPosition(String position)
    {
        this.position = position;
    }
    public String getInfo()
    {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Position: " + getPosition() + "\n" +
                "Number of Games: " + getNumberOfGames() + "\n";
    }
}
