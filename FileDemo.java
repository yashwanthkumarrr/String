package string;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File fileObj = new File("D:\\New folder\\two.txt");
//        boolean created = fileObj.createNewFile();
//        System.out.println(created);
//        fileObj= new File("D:\\yash\\thariq\\div");
//        System.out.println(fileObj.mkdirs());
        FileDemo o = new FileDemo();
      //  o.f1();
        o.f2();

    }

    private void f2() {
        File fileObj = new File("E:\\MCA project");
        File[] files_folders = fileObj.listFiles();
        for(File element:files_folders)
        {
            boolean result = element.isFile();
            if(result == true)
            {
                System.out.println(element);
            }
        }
    }

    private void f1() {
        File fileObj = new File("E:\\dhanapani");
        String[] list_of_files_folders = fileObj.list();
        for(int i=0; i<list_of_files_folders.length;i++)
        {
            System.out.println(list_of_files_folders[i]);
        }
        //for each loop - forward direction loop
        //enhanced for loop
        for(String name:list_of_files_folders)
        {
           // System.out.println(name);
            int len = name.length();

            System.out.println(name.substring(len-2));
//            int len = name.length();
//            String extension = name.substring(len-4);
//            if(extension.equals(".txt"))
//                System.out.println(name);
        }

    }
}
