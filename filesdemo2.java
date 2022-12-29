package string;

import java.io.*;

public class filesdemo2 {
    public static void main(String[] args) throws IOException {
        filesdemo2 obj = new filesdemo2();
      // obj.write();
      //  obj.write1();
       // obj.read();
      //  obj .read1();
        obj.read3();

    }

    private void read3() throws IOException {
        File fobj = new File("E:\\MCA project\\karthick.txt");
        FileReader readerObj = null;
        try {
            readerObj = new FileReader(fobj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader breaderObj = new BufferedReader(readerObj);
        String output = breaderObj.readLine();
        // System.out.println(output);
        // int output = readerObj.read
        //();

        while(output!=null)
        {

            System.out.print(output);
            output = breaderObj.readLine();

        }
        breaderObj.close();

    }

    private void read1() throws IOException {
        File fobj = new File("E:\\MCA project\\karthick.txt");
        FileReader readerObj = null;
        try {
            readerObj = new FileReader(fobj);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int output = readerObj.read();
        // System.out.println(output);
        // int output = readerObj.read
        //();
        int count =0;
        while(output!=-1)
        {
            char ch =(char) output;
            if(ch==' ')
                count++;
            System.out.print((char)output);
            output =
                    readerObj.read
                            ();
        }
        System.out.println (count);
    }

    private void read() throws IOException {
        File fobj = new File("E:\\MCA project\\karthick.txt");
        FileReader readerObj = new FileReader(fobj);
        int output = readerObj.read();// T =30 -1
       // System.out.println(output);
       // int output = readerObj.read
                        //();
        while(output!=-1)
        {
            System.out.print((char)output);
            output =
                    readerObj.read
                            ();
        }
    }

    private void write1() throws IOException {
        File obj = new File("E:\\MCA project\\karthick.txt");
        obj.createNewFile();
        FileWriter f = new FileWriter(obj,true);
        BufferedWriter bwriterObj = new BufferedWriter(f);
        bwriterObj.write("Thariq");
        bwriterObj.newLine();
        bwriterObj.write("Yashwanth");
        bwriterObj.close();
    }

    private void write() throws IOException {
        File obj = new File("E:\\MCA project\\kar.txt");
        obj.createNewFile();
        FileWriter f = new FileWriter(obj,true);
        f.write("vicky");
        f.write("\n");
        f.write("karthick");
        f.close();
    }
}
