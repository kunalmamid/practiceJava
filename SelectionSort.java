import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for (int i=0; i< arr.length -1; i++)
        {
            int m=i;
            for (int j=i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[m])
                {
                    m=j;
                }
            }

            if (m != i)
            {
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp;
            }
        }

        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }

    }


    private static final Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {

        String[] items = scan.nextLine().split(" ");
        int[] input = new int[items.length];

        for (int i=0; i< items.length; i++)
        {
            input[i] = Integer.parseInt(items[i]);
        }

        selectionSort(input);
    }
}
