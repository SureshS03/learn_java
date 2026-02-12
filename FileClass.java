import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException { // we add the throw exception so that this program will
                                                                // know that this might throw some err and we dont need
                                                                // to catch that

        File file = new File("/home/suresh/test.py"); // file type is imp

        if (file.exists()) {
            System.out.println("file is there!!!");
            System.out.println(file.getAbsolutePath());
            // file.delete();
        }

        try {
            FileWriter w = new FileWriter("test.txt");
            w.write("Hello bro\nHow are you\n"); // method write will always delete all data in file and write newly
            w.append("this is added test"); // append will add the text in the file, not delete all and start newly
            w.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        FileReader r = new FileReader("test.txt");
        int data = r.read(); // read() fun will read the data in file as character by character, so each
                             // character will be in int value like its own ASCII value
        // so we need to cast the int to char to get the character value instead of its
        // int value
        System.out.println(data); // this will print the first word's first letter (H) which is 72 as int
        while (data != -1) { // read() will return the -1 when there is nothing to read anymore
            System.out.print((char) data); // casting the ASCII value to char and using normal print, beacsue
                                           // println will always print in new line
            data = r.read(); // read the next character
        }
        r.close(); // close the readrer

    }
}
