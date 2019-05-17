//  Shift the elements to the right
public class Task9 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,88,67,45};
        int sum =0;

        int temp= arr[arr.length -1];
        arr[arr.length -1]= arr[0];
        arr[0] = temp;

        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]);
        }




    }

}
