package string;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        Files o = new Files();
        o.file();


    }

    private void file()  {
        File obj = new File("E:\\MCA project\\test.txt");

        try {
            obj.createNewFile();
        } catch (IOException e) {

        }


        obj = new File("E:\\MCA project\\yashwanth\\kumar\\anu");
        System.out.println( obj.mkdirs());
    }
}
