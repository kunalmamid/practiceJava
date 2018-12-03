
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileOpParseLogFile2 {

    static class LogLine {
        Date logDate;
        String feature;
        String message;

        public Date getLogDate() {
            return logDate;
        }

        public void setLogDate(Date logDate) {
            this.logDate = logDate;
        }

        public String getFeature() {
            return feature;
        }

        public void setFeature(String feature) {
            this.feature = feature;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static void main(String[] args) {

        BufferedReader br = null;
        String line = "";
        String[] feLine;
        SimpleDateFormat dft = new SimpleDateFormat("yyyy:MM:dd_HH:mm:ss");
        List<LogLine> lL = new LinkedList<LogLine>();
        try {
            br = new BufferedReader(new FileReader("/Users/kunalmamid/Log2.txt"));

            while ((line=br.readLine()) != null){
                feLine = line.split("::");
                String sDate=feLine[0];
                Date d1 = dft.parse(sDate);
                LogLine l = new LogLine();
                l.setLogDate(d1);
                l.setFeature(feLine[1]);
                //System.out.println(line);
                if(feLine.length == 4) {
                    l.setMessage(feLine[3]);
                }
                lL.add(l);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ParseException e1){
            e1.printStackTrace();
        }

        Collections.sort(lL, new Comparator<LogLine>() {
            @Override
            public int compare(LogLine o1, LogLine o2) {
               return (o1.getLogDate().compareTo(o2.getLogDate()));
            }
        });

        System.out.println("PASS/FAIL");

        for (LogLine l : lL){
        System.out.println(dft.format(l.getLogDate())+", "+l.getFeature()+(l.getMessage() != null ? ", "+l.getMessage() : ""));
        }

    }

}
