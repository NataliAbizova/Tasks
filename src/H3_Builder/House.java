package H3_Builder;

public class House {
    private FoundationType foundation;
    private WallsType walls;
    private int windows;
    private RoofType roof;
    private int doors;

    public House(FoundationType foundation, WallsType walls, int windows, RoofType roof, int doors) {
        this.foundation = foundation;
        this.walls = walls;
        this.windows = windows;
        this.roof = roof;
        this.doors = doors;
    }

    public FoundationType getFoundation() {
        return foundation;
    }

    public WallsType getWalls() {
        return walls;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getWindows() {
        return windows;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setRoof(RoofType roof) {
        this.roof = roof;
    }

    public RoofType getRoof() {
        return roof;
    }
}
