//  Negative elements
public class Task8 {
    public static void main(String[] args) {

        double[] arr = {10.1,-2.1,26.,-2.9,10};
        double sum = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]<0) {
                sum= sum +arr [i];


            }


        }

        System.out.println(sum);
    }




}
