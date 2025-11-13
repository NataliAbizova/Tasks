package H3_Builder;

public class Director {
    public void constructWoodHome(StepBuilder builder){
        builder.setFoundation(FoundationType.COLUMN);
        builder.setWalls(WallsType.WOOD);
        builder.setDoors(1);
        builder.setWindows(4);
        builder.setRoof(RoofType.LAMINIERTE_FLEXIBLE_FLIESEN);
    }

    public void constructStoneHome(StepBuilder builder){
        builder.setFoundation(FoundationType.STRIP);
        builder.setWalls(WallsType.STONE);
        builder.setDoors(1);
        builder.setWindows(4);
        builder.setRoof(RoofType.CORRUGATED_SHEET);
    }

    public void constructModernHome(StepBuilder builder){
        builder.setFoundation(FoundationType.STRIP);
        builder.setWalls(WallsType.CLT);
        builder.setDoors(1);
        builder.setWindows(4);
        builder.setRoof(RoofType.EUROCODE);
    }
}
