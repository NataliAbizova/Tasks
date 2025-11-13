package H3_Builder;

public class HouseManualBuilder implements StepBuilder {
    private FoundationType foundation;
    private WallsType walls;
    private int windows;
    private RoofType roof;
    private int doors;

    @Override
    public void setFoundation(FoundationType foundation) {
        this.foundation = foundation;
    }

    @Override
    public void setWalls(WallsType walls) {
        this.walls = walls;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setRoof(RoofType roof) {
        this.roof = roof;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Manual getResult() {
        return new Manual(foundation, walls, windows, roof, doors);
    }
}
