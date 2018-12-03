import java.util.Scanner;

public class StiarCase {


    public static void printStaircase(int n){

      for (int i=0; i < n; i++){
          String result="";
          for(int j=0; j < n; j++)
          {
              if (i >= j)
              {
                  result='#'+result;
              }
              else {
                  result=" "+result;
              }

          }
          System.out.println(result);
      }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int h = scan.nextInt();

        printStaircase(h);
    }
}
