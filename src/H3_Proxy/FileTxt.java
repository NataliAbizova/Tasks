package H3_Proxy;

import java.io.*;
import java.util.Arrays;

class FileTxt implements Txt {
    private String file;
    private String text;

    public FileTxt(String file) {
        this.file = file;
        load(file);
    }

    private void load(String file) {
       try(FileReader fileReader = new FileReader(file);
           BufferedReader bufferedReader = new BufferedReader(fileReader)){
           text = bufferedReader.readLine();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        System.out.print("First reading: ");
    }

    public void reading() {
        System.out.println(text);
    }
}
