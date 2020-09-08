import org.w3c.dom.html.HTMLImageElement;

import java.util.Date;

public class Title {
    public String name;
    public Interpret interpret;
    public String genre;
    public String time; //mm:ss?
    public String album;

    public Title(String name, Interpret interpret, String genre, String time, String album)
    {
        this.name = name;
        this.interpret = interpret;
        this.genre = genre;
        this.time = time;
        this.album = album;
    }
    public void print()
    {
        System.out.println(name + " " + interpret.name + " " + genre + " " + time + " " + album);
    }
}


