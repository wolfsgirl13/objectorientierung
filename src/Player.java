public class Player {
    public Title[] titles;

    public Player(Title[] titles)
    {
        this.titles = titles;
    }
    public void play() {
        for (Title title: titles){
            title.print();
        }
    }
}
