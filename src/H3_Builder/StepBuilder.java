package H3_Builder;

public interface StepBuilder {
    void setFoundation(FoundationType foundation);
    void setWalls(WallsType walls);
    void setWindows(int windows);
    void setRoof(RoofType roof);
    void setDoors(int doors);
}
