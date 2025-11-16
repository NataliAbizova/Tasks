package H3_Decorator;

import java.util.Arrays;

public class Decorator {
    public static void main(String[] arrgs) {
        String string = "Data to be encrypted";
        DataSource dataSource = new EncryptionDecorator(new FileServiceStream("test.txt"));

        dataSource.writeData(string);
        System.out.println(dataSource.readData());
    }
}
