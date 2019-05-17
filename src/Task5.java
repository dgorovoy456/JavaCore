// Maximum of absolute values
public class Task5 {
    public static void main(String[] args) {

        double[] arr = {12.0,20.0,21.2,54.5,86.9,2.6};
        double max=arr[0];

        for (int i = 0; i <arr.length ; i++) {

            if (max<arr[i]){

                max=arr[i];
            }


        }
        System.out.println(max);

    }
    }

