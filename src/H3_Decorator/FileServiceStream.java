package H3_Decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileServiceStream implements DataSource {
    private String fileName;

    public FileServiceStream(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String read() {
        byte[] data;
        try (FileInputStream fileInputStream = new FileInputStream(fileName);) {
            data = fileInputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Arrays.toString(data);
    }

    @Override
    public void write(String data) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(data.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
