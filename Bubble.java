import java.util.Scanner;

public class Bubble {

    public static void bubbleSort(int [] ar) {

        for (int i=0; i < ar.length - 1 ; i++ )
            for (int j = ar.length - 1; j > i; j--)
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }

        for (int k=0; k< ar.length; k++)
        {
            System.out.print(ar[k] +" ");
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main (String[] args){

        String [] arItems = scan.nextLine().split(" ");
        int [] input = new int [arItems.length];

        for (int i=0; i < arItems.length; i++)
        {
            input[i] = Integer.parseInt(arItems[i]);
            System.out.println(input[i]);
            System.out.println(arItems[i]);
        }

        bubbleSort(input);

    }

}
