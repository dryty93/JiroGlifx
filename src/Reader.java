import java.io.*;
import java.util.Scanner;

public class Reader {

    String fileContent;



    public static void init_interpret(){

    }

    public static void startInterpretter() {

        Variable var = new Variable();


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
            int nRead = 0;
            while ((nRead = inputStream.read(buffer)) != -1) {

                String fileContent = new String(buffer);
                int enumerate = 0;

                String[] lineArray = new String[enumerate];
                System.out.println(fileContent);

                if(fileContent.contains("=")){
                   String[] n = fileContent.split("=");
                   String varName = n[0];
                   String varVal = n[1];


                   //Jobeject jobj = new Jobeject();
                 //  jobj.getData(varName +" = "+varVal );
                }
                total += nRead;
            }

            inputStream.close();

          //  System.out.println("Read " + total + " bytes");
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



