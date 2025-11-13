package H3_Decorator;

public class Decorator {
    public static void main(String[] arrgs) {
        String string = "Data to be encrypted";
        DataSource dataSource = new EncryptionDecorator(new FileServiceStream("test.txt"));

        dataSource.write(string);
        System.out.println(dataSource.read());
    }
}
