import java.util.Arrays;


public class Task3 {
    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();

    }
    //  Increase by 2
    public static void task1 () {
        int[] arr = {-2, 3, -10, 6, 8, -5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = arr[i] + 2;
            }
            System.out.println(arr[i]);
        }
    }
    //  The first is not greater for 2,5
    public static void task2 () {
        double[] arr = {26.6,2.6,3.0,45.5};
        String temp =" ";
        int i = 0;

        for (i = 0; i < arr.length ; i++) {
            if (arr[i]<2.5) {
                temp = String.valueOf(arr[i]);
                break;
            }else {
                temp = "Not found";
            }
        }
        System.out.println(temp);
    }

    public static void task3 () {
        int[] arr = {12,6,18,22,4,9,18};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]%6==0) {
                System.out.println(arr[i]/6);
            }
        }
    }

    // The arithmetic mean of positive
    public static void task4 () {
        int sum=0;
        int arr[] = {5,5,6,8,6,4,810,10,23};

        for (int j = 0; j < arr.length ; j++) {
            sum = sum + arr[j];
        }
        System.out.println( "Arithmetic mean" + " " + sum/arr.length );
    }

    // Maximum of absolute values
    public static void task5 () {
        double[] arr = {12.0,20.0,21.2,54.5,86.9,2.6};
        double max=arr[0];

        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    // Twice the minimum
    public static void task6 () {
        int[] arr = {12,20,21,54,86,2};
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min+min);
    }
    //  Number by 3
    public static void task7 () {
        int[] arr = {2,12,20,15,-5,6,-5,12,-6};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0 && arr[i]%3==0) {
                System.out.println(arr[i]);
            }
        }
    }
    //  Negative elements
    public static void task8 () {
        double[] arr = {10.1,-2.1,26.,-2.9,10};
        double sum = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]<0) {
                sum= sum +arr [i];
            }
        }
        System.out.println(sum);
    }
    //  Shift the elements to the right
    public static void task9 () {
        int[] arr = {1,2,3,4,88,67,45};
        int sum =0;
        int temp= arr[arr.length -1];
        arr[arr.length -1]= arr[0];
        arr[0] = temp;

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    //  The sum of the largest and the smallest
    public static void task10 () {
        int arr1[] = {12,52,6,46,82,56,40,82,64,25};
        int min = Arrays.stream(arr1).min().getAsInt();
        int max = Arrays.stream(arr1).max().getAsInt();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

    }


}
