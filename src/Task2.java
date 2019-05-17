//  The first is not greater for 2,5
public class Task2 {
    public static void main(String[] args) {

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

}
