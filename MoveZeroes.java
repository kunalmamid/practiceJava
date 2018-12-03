import java.util.Scanner;

public class MoveZeroes {

     public static void shiftZeroes(int[] ar){

         for (int i = 1; i < ar.length; i++)
         {
             if (ar[i] != 0)
             {
                 for (int j =i; j >= 0; j--)
                 {

                     if ( j == 0 && i != j )
                     {
                         int temp = ar[j];
                         ar[j] = ar[i];
                         ar[i] = temp;
                     }

                     else if ( ar[j-1] != 0 )
                     {
                         int temp = ar[j];
                         ar[j] = ar[i];
                         ar[i] = temp;
                         break;
                     }

                 }
             }
         }

         for (int i = 0; i< ar.length; i++)
         {
             System.out.print(ar[i]+" ");
         }

     }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] arItems = scan.nextLine().split(" ");
        int[] input = new int[arItems.length];



        for (int i = 0; i < arItems.length; i++) {
            input[i] = Integer.parseInt(arItems[i]);

        }

        shiftZeroes(input);
    }

}