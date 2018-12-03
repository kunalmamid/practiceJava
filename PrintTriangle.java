import java.util.Scanner;

public class PrintTriangle {

    public static void printT(int h) {

        int c = (h + (h-1)) / 2 ;

        for (int i=0; i < h; i++)
        {
            String result="";
            for (int j=0; j < (h + (h-1)); j++)
            {
                if ( j >= (c-i) && j <= (c+i) )
                {
                    result=result+"#";

                }
                else {
                    result = result + " ";
                }
            }
            System.out.println(result);
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int height = scan.nextInt();


        printT(height);
    }
}
