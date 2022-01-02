import java.io.Serializable;

public class Password implements Serializable
{
    private String username;
    private String password;

    Password(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
