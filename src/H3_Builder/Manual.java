package H3_Builder;

public class Manual {
    private FoundationType foundation;
    private WallsType walls;
    private int windows;
    private RoofType roof;
    private int doors;

    public Manual(FoundationType foundation, WallsType walls, int windows, RoofType roof, int doors) {
        this.foundation = foundation;
        this.walls = walls;
        this.windows = windows;
        this.roof = roof;
        this.doors = doors;
    }

    public String print() {
        String info = "";
        info += "Home: " + walls +"\n";
        info += "Foundation type: " + foundation +"\n";
        info += "Roof type: " + roof +"\n";
        return info;
    }
}
