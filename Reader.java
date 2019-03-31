import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Reader

    {

    String scroll_info;

    public Reader()

    {
        this.scroll_info = scroll_info;
        String fileName = "src\\scroll.glifx";

        try {
            // Use this for reading the data.
            byte[] buffer = new byte[1000];

            FileInputStream inputStream =
                    new FileInputStream(fileName);

            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int ne = 0;
            int nRead = 0;
            while ((nRead = inputStream.read(buffer)) != -1) {

                String fileContent = new String(buffer);
                scroll_info = fileContent;
                //System.out.print(fileContent+"op");
                int count = 0;

                total += nRead;

            }

            inputStream.close();


        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");

        }


    }

}



