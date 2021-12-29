import java.io.*;
import java.util.ArrayList;

public class MainMethod
{

    static ArrayList<Team> teams;
    static void readTeam() throws IOException, ClassNotFoundException
    {
        try {
            FileInputStream fis = new FileInputStream("src/teamdata.dat");

        ObjectInputStream ois = new ObjectInputStream(fis);
        teams = ( ArrayList<Team>) ois.readObject();
        ois.close();}
        catch (Exception ex)
        {
            teams = new ArrayList<Team>();
        }
    }
    static void writeTeam() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/teamdata.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(teams);
        oos.close();

    }

    public MainMethod() throws IOException, ClassNotFoundException {
    }

    public int searchTeam(String TeamName)
    {
        for(int i = 0; i<teams.size();i++)
        {
            if(TeamName.equals(teams.get(i).teamName))
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]) throws IOException, ClassNotFoundException {
        readTeam();
        FrontPage frontPage = new FrontPage();
        frontPage.setVisible(true);
       




        writeTeam();
    }
}
