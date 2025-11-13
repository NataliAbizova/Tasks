package H3_Wrapper;

public class SoketA {
    private int current = 220;
    private boolean positiveSoket;
    private boolean negativeSoket;

    SoketA() {
        this.positiveSoket = true;
        this.negativeSoket = true;
    }

    public void connectionToSocket(PlugA plug) {
        System.out.println("Connected");
    }
}
