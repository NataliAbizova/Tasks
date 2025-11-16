package H3_Decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceStream implements DataSource {
    private String fileName;

    public FileServiceStream(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String readData() {
        byte[] data;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);) {
            data = fileInputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new String(data);
    }

    @Override
    public void writeData(String data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
