// Twice the minimum
public class Task6 {
    public static void main(String[] args) {

        int[] arr = {12,20,21,54,86,2};
    int min=arr[0];

        for (int i = 0; i <arr.length ; i++) {

        if (min>arr[i]){

            min=arr[i];
        }


    }
        System.out.println(min+min);

}
}
