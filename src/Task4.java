// The arithmetic mean of positive
public class Task4 {
    public static void main(String[] args) {

        int sum=0;

        int arr[] = {5,5,6,8,6,4,810,10,23};

        for (int j = 0; j < arr.length ; j++) {

            sum = sum + arr[j];

        }
        System.out.println( "Arithmetic mean" + " " + sum/arr.length );
    }

    }
