package H3_Decorator;

public class EncryptionDecorator extends DataSourseDecorator {

    EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void write(String data) {
        super.write(encription(data));
    }

    @Override
    public String read() {
        return decryption(super.read());
    }

    private String decryption(String data) {
        byte[] dataByte = data.getBytes();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dataByte.length; i++) {

            stringBuilder.append(dataByte[i] + 7);
        }

        return stringBuilder.toString();
    }

    private String encription(String data) {
        byte[] dataByte = data.getBytes();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < dataByte.length; i++) {
            stringBuilder.append(dataByte[i] >> 3);
        }

        return stringBuilder.toString();
    }
}
