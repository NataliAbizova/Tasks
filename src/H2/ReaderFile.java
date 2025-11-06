package H2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReaderFile {
    public static void main(String[] args) {
        String src = "C:\\Users\\natab\\OneDrive\\Рабочий стол\\testt.txt";

        try (FileOutputStream outputStream = new FileOutputStream(src);
             FileInputStream inputStream = new FileInputStream(src)) {

            String str = "Запись в файл";
            outputStream.write(str.getBytes());
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(new String(bytes));

        } catch (IOException e) {
            new NewIOException("File not found" + e.getMessage());
        }
    }
}





