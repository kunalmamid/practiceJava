import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatch {


    public static void patMatch(String input, String pat){

        String tPat="";
        int count=0;
        for (int i =0; i < input.length(); i++)
        {
            while (tPat.length() < pat.length()) {
                tPat=tPat+input.charAt(i);
            }

            if (tPat.equals(pat)) {
                count++;
            }

            tPat=tPat.substring(1,tPat.length());

        }

        System.out.println("Count of pat is: " + count);

    }


   private static final  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

         String str = s.nextLine().trim();
         String p = s.nextLine().trim();
         //Pattern pat = Pattern.compile(s.nextLine().trim());
         //Matcher match = pat.matcher(str);

         //int count=0;
         //int pos=0;

         //while (match.find(pos)){
           //  count++;
             //pos=match.start() + 1;
         //}

       //System.out.println(count);

        patMatch(str,p);

    }
}
