public class App {
    public static void main(String[] args)
    {
        Interpret fooFighters = new Interpret("Foo Fighters","USA",false,"Dave Crowl");


        Title forAllTheCows = new Title("For all the cows", fooFighters,"alternative rock","03:31","Foo Fighters");


        Title izziBizzy = new Title("Izzi Bizzi", fooFighters,"rock, pop","03:15","Foo Fighters");

        Title loveIs = new Title("Love is in ", fooFighters,"rock, pop","03:15","Foo Fighters");

        Album fighters = new Album("Foo Fighters","Songs",1995,"pistol","Roswell Records","AKM");

    Title[] titles = {izziBizzy,loveIs,forAllTheCows};

        Player player = new Player(titles);
        player.play();
    }
}
