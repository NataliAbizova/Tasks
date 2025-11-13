package H3_CoR;

public class Person {
    private String name;
    private AccessLevels levels;

    public Person(String name, AccessLevels levels){
        this.name = name;
        this.levels = levels;
    }

    public String getName() {
        return name;
    }

    public AccessLevels getLevels() {
        return levels;
    }
}
