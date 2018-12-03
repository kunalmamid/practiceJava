import java.util.Scanner;

public class LargestLexicographicalSubSequence {

   private static final Scanner S = new Scanner(System.in);

    public static void main(String[] args) {
      String str=S.nextLine().trim();

      String subStr = String.valueOf(str.charAt(str.length()- 1));

      for (int i = str.length() -1 , j=str.length()-2; i>=1; i--){

           if(str.charAt(j) > str.charAt(i)){
               subStr=str.charAt(i-1)+subStr;
               j--;
           }
      }

      System.out.println(subStr);
    }
}
