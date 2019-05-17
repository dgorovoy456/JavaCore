//  Number by 3
public class Task7 {
    public static void main(String[] args) {
        int[] arr = {2,12,20,15,-5,6,-5,12,-6};

        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0 && arr[i]%3==0) {

                System.out.println(arr[i]);
            }

        }


    }
}
