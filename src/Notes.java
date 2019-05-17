public class Notes {
    public static void main(String[] args) {

    // Note1

//        int[] arr = {-3,-15,2,64,23};
//        int prev=0;
//        int min=arr[0];
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            if (arr[i]<min) {
//                if(arr[i]<prev){
//                    prev=arr[i];
//                }else {
//                    min = arr[i];
//                }
//            }
//
//
//        }
//        System.out.println(min+prev);
//

    // Note2

//        int[] arr = {12,54,21,3,22,5,48,21,23,22};
//
//        for (int i = arr.length -1; i >0 ; i--) {
//
//            System.out.println(arr[i]);
//
//        }

    // Note3


      int[] arr = {3,2,1,10,9,8,4,5,6,7};

      int temp = 0;

        for (int i = 0; i <arr.length ; i++) {



            for (int j = i; j > 0; j--) {

                if (arr[j]<arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }


                }





            }
        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i]);

        }
            }







        }







