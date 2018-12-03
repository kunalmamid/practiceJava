import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileOPParseLogFile1 {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("/Users/kunalmamid/Log1.txt"));

        //String line;
        String resultLine = "";
        String logLine="";


        try {
            logLine = br.readLine();

            while (logLine != null){

                if (logLine.startsWith("Test")) {
                    resultLine = logLine;
                    logLine = br.readLine();

                    String prevLine="";
                    while (logLine !=null && !logLine.startsWith("Test")){
                        if (!logLine.equals("")) {
                            prevLine = logLine;
                        }
                        logLine = br.readLine();

                    }

                    resultLine = resultLine +"    "+prevLine;
                    System.out.println(resultLine);
                }
                else {
                    logLine = br.readLine();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}