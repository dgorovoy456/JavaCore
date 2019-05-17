//  The sum of the largest and the smallest
import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {


        int arr1[] = {12,52,6,46,82,56,40,82,64,25};

        int min = Arrays.stream(arr1).min().getAsInt();
        int max = Arrays.stream(arr1).max().getAsInt();

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


    }
}
