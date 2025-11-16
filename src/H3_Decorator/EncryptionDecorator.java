package H3_Decorator;

import java.util.Arrays;

public class EncryptionDecorator extends DataSourseDecorator {

    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encription(data));
    }

    @Override
    public String readData() {
        return decryption(super.readData());
    }

    private String decryption(String data) {
        byte[] dataByte = data.getBytes();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dataByte.length; i++) {
            stringBuilder.append((char)(dataByte[i] + 1));
        }
        return stringBuilder.toString();
    }

    private String encription(String data) {
        byte[] dataByte = data.getBytes();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dataByte.length; i++) {
            stringBuilder.append((char) (dataByte[i] - 1));
        }
        return stringBuilder.toString();
    }
}
