//  Increase by 2
public class Task1 {
    public static void main(String[] args) {

        int[] arr = {-2,3,-10,6,8,-5};

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] >0) {
                arr[i]=arr[i]+2;
            }

            System.out.println(arr[i]);
        }


    }
}
