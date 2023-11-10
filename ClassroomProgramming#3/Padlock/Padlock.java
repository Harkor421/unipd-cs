public class Padlock
{

private boolean opened = false;
private String password = "0000";


public void close()
{
    
    if(opened == true)
    {
        this.opened = false;
    }


}


public void open(String pass)
{

    if(opened == false)
    {
        if(password == pass)
        {
            opened = true;
        }
    }

}

public void setCombination(String oldpass, String newpass)
{

    if(oldpass == this.password)
    {
        this.password = newpass;
        this.opened = true;
    }

}

// Code of Object.toString()
public String toString() {
    if(opened == false){
        return  "Padlock is closed";
    }
    else
    {
        return "Padlock is opened";
    }
}


}