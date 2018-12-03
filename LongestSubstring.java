import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

public class LongestSubstring {

    public static void lSubstring(String s1, String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        String finalStr="";

        for (int i=0; i < s1.length(); i++)
        {
            for (int j=0; j < s2.length(); j++)
            {
                int m=i;
                int n=j;
                String subStr="";
                while (m < s1.length() && n < s2.length() && c1[m] == c2[n]){
                    subStr=subStr+c1[m];
                    m++;
                    n++;
                    //System.out.println(subStr);
                }

                if (subStr.length() >= finalStr.length()){
                    finalStr=subStr;
                }
            }
        }
        System.out.println(finalStr +" length is: " +finalStr.length());
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main (String[] args){

        String s1 = scan.nextLine().trim();
        String s2 = scan.nextLine().trim();

        //System.out.println(s1 +" " +s2);


        lSubstring(s1,s2);

    }
}
