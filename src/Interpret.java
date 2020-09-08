public class Interpret
{
    public String name;
    public String nationality;
    public boolean death;
    public String manager;

    public Interpret(String name, String nationality, boolean death, String manager)
    {
        this.name = name;
        this.nationality = nationality;
        this.death = death;
        this.manager = manager;
    }

    public void print()
    {
        System.out.println(name + " " + nationality + " " + death + " " + manager);
    }
}

