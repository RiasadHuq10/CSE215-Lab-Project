import java.io.*;
import java.util.ArrayList;

public class MainMethod
{


    public static ArrayList<Team> teams;
    public static void readTeam() throws IOException, ClassNotFoundException
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
    public static void writeTeam() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/teamdata.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(teams);
        oos.close();

    }

    public MainMethod() throws IOException, ClassNotFoundException {
    }

    public static int searchTeam(String TeamName)
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

    public static ArrayList<Password> users;
    public static void readUser() throws IOException, ClassNotFoundException
    {
        try {
            FileInputStream fis = new FileInputStream("src/userdata.dat");

            ObjectInputStream ois = new ObjectInputStream(fis);
            users = ( ArrayList<Password>) ois.readObject();
            ois.close();}
        catch (Exception ex)
        {
            users = new ArrayList<Password>();

        }
    }
    public static void writeUser() throws IOException {
        FileOutputStream fos = new FileOutputStream("src/userdata.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(users);
        oos.close();

    }
    public static int searchUser(Password userInput)
    {
        for(int i = 0; i<users.size();i++)
        {
            if(userInput.getUsername().equals(users.get(i).getUsername()) && userInput.getPassword().equals(users.get(i).getPassword()))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException
    {
    	
    	
        readTeam();
        readUser();
        
        FrontPage frontPage = new FrontPage();
        frontPage.setVisible(true);


        


        writeTeam();
        writeUser();
        
        System.out.println(users.size());
        for (int i = 0; i < users.size(); i++) {
        	System.out.println(users.get(i).getUsername() + " " + users.get(i).getPassword());
        }
    }
}
