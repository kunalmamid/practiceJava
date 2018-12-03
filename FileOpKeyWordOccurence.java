import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class FileOpKeyWordOccurence {

    public static void main(String[] args) {
        BufferedReader br= null;

        String line;
        LinkedList<Pair<Integer,Integer>> logLine = new LinkedList<Pair<Integer,Integer>>();
        int lineCount = 0;
        int totalCount=0;

        try{
            br = new BufferedReader(new FileReader("/Users/kunalmamid/log3.txt"));
            while ((line=br.readLine()) != null){
                lineCount++;
                //System.out.println("Line Number is: "+lineCount);
                int count= (line.split("test")).length -1;
                if (line.endsWith("test"))
                    count=count+1;

                if (count > 0);
                {
                  logLine.add(new Pair<Integer, Integer>(lineCount,count));
                }

                totalCount=totalCount+count;
                //System.out.println("This is Total: "+totalCount);
                Integer firstCount = logLine.getFirst().getValue();
                //System.out.println("This is First Count: "+firstCount);

                while ((totalCount - firstCount) >=10){
                    //System.out.println("Inside IF");
                    logLine.removeFirst();
                    totalCount=totalCount-firstCount;
                    firstCount=logLine.getFirst().getValue();
                }
            }

            for (Pair<Integer,Integer> temp: logLine){
                System.out.println("Line number: "+temp.getKey()+" Count: "+temp.getValue());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
