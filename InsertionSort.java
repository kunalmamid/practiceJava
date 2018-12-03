import java.util.Scanner;

public class InsertionSort {

    public static void inSort(int[] ar){
        for (int i=1; i<ar.length; i++)
        {
            int m =i;
            for (int j = i-1; j >=0; j--)
            {
                if (ar[j] > ar[m])
                {
                    int temp = ar[m];
                    ar[m] = ar[j];
                    ar[j] = temp;
                    m--;

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

        inSort(input);
    }
}
