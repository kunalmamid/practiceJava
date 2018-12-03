import java.util.Scanner;

public class BinarySearch {

    public static void bSearch(int[] ar, int key){

        int li=0;
        int hi=ar.length -1;
        //System.out.println(hi);
        int mi;
        int bool=0;

        while (li <= hi)
        {
            mi = (li + hi ) / 2;
          //  System.out.println(mi);

            if (key > ar[mi])
            {
                li = mi + 1;
            }
            else if (key < ar[mi])
            {
                hi = mi - 1;
            }
            else if (key == ar[mi])
            {
                System.out.print("Number Found at Index: " + mi);
                bool=1;
                break;

            }
        }

        if (bool ==0 ){
            System.out.print("Number Not Found");
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main (String[] args){

        String [] arItems = scan.nextLine().split(" ");
        int [] input = new int [arItems.length];

        int sKey = Integer.parseInt(scan.nextLine().trim());

        //System.out.println(sKey);

        for (int i=0; i< arItems.length; i++)
        {
            input[i] = Integer.parseInt(arItems[i]);
            //System.out.println(input[i]);
            //System.out.println(arItems[i]);
        }

        bSearch(input,sKey);
    }
}
