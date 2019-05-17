public class Task3 {
    public static void main(String[] args) {

        int[] arr = {12,6,18,22,4,9,18};

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i]%6==0) {

                System.out.println(arr[i]/6);

            }

        }
    }
}
