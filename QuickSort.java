import java.util.Scanner;

public class QuickSort {

    public static void qSort(int[] arr, int low, int high, char c){


        System.out.println(low+":"+high +":"+c);
        if (low < high){

            for (int i=low; i <=high; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            int p = partition(arr,low,high);

            qSort(arr,low,p-1,'l');
            qSort(arr,p+1,high,'r');
        }
    }

    public static int partition (int[] arr, int low, int high){
        int pivot=arr[high];

        int i = (low -1);

        for (int j=low; j< high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
            System.out.println();
    }

    private static final  Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] items = scan.nextLine().split(" ");
        int [] input=new int[items.length];

        int low =0;
        int high = input.length-1;

        for (int i=0; i<items.length; i++){
        input[i] = Integer.parseInt(items[i]);
        }

        qSort(input, low, high,'f');
        printArray(input);
    }
}
