package H3_Wrapper;

public class Wrapper {
    public static void main(String[] args) {
        PlugA plugA = new PlugA();
        PlugB plugB = new PlugB();

        SoketA soketA = new SoketA();
        soketA.connectionToSocket(plugA);

        soketA.connectionToSocket(new PlugBAdapter(plugB));
    }
}
