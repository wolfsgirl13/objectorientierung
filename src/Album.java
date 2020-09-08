public class Album {
    public String name;
    public String songs;
    public int year;
    public String cover;
    public String label;
    public String akm;

    public Album(String name, String songs, int year, String cover, String label, String akm)
    {
        this.name = name;
        this.songs = songs;
        this.year = year;
        this.cover = cover;
        this.label = label;
        this.akm = akm;
    }
    public void print()
    {
        System.out.println(name + " " + songs + " " + year + " " + cover + " " + label + " " + akm);
    }
}
