package H3_Builder;

public class Builder {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructWoodHome(houseBuilder);

        House house = houseBuilder.getResult();
        System.out.println("Home build:\n" +house.getWalls());

        HouseManualBuilder manualBuilder = new HouseManualBuilder();

        director.constructWoodHome(manualBuilder);
        Manual manual = manualBuilder.getResult();

        System.out.println(manual.print());
    }
}
