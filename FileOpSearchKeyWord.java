import com.sun.org.apache.xerces.internal.xs.StringList;

import java.io.*;
import java.util.*;

public class FileOpSearchKeyWord {

    public static void main (String[] args) throws FileNotFoundException  {

        BufferedReader br1 = new BufferedReader(new FileReader("/Users/kunalmamid/SamplText.txt"));
        Map<String, Integer> mp = new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER);

        try {


            String line;
            String[] wl;
            int linenum=0;

            while ((line = br1.readLine()) != null) {

               wl = line.split(" ");
               for (int i=0; i < wl.length; i++)
               {
                   if (mp.containsKey(wl[i])){
                       mp.put(wl[i], mp.get(wl[i]) + 1);
                   }
                   else {
                       mp.put(wl[i],1);
                   }
               }

            }

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (br1 != null)
                    br1.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        List<Map.Entry<String,Integer>> list = new LinkedList<Map.Entry<String, Integer>>(mp.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue().compareTo(o2.getValue()));
            }
        });

        for (int i=list.size() -1 ; i >= list.size() -5; i--){
            System.out.println(list.get(i));
        }

        //for(Map.Entry<String,Integer> entry: mp.entrySet()){
         //   System.out.println(entry.getKey()+":"+ entry.getValue());
        //}

    }


}
