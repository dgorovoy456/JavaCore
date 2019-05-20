import java.util.ArrayList;
import java.util.List;

public class Tasks7_ArrayProcessing {

    public static void main(String[] args) {


        int[] array1 = {1,2,3,4,2,5};
        int[] array2 = {7,2,62,56,3};
      //task1
        //  System.out.println(task1(array));
      //task2
        //  System.out.println(task2(array1,array2));
      //task3
        //  System.out.println(task3(array1,array2));
      //task4
        //  task4(array1);

    }


        static List<Integer> task1 ( int[] array1){
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < array1.length; i++) {

                if (!list.contains(array1[i])) {
                    list.add(array1[i]);
                }
            }
            return list;
        }

        static List<Integer> task2 (int[] array1, int [] array2 ) {
        List<Integer> list1 = new ArrayList<>();
            for (int i = 0; i < array1.length; i++) {
                if (!list1.contains(array1[i])) {
                    list1.add(array1[i]);
                }
                for (int j = 0; j < array2.length; j++) {
                    if (!list1.contains(array2[j])) {
                        list1.add(array2[j]);
                    }
                }
            }
            return list1;
        }

        static List<Integer> task3 (int[] array1, int [] array2) {
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
            for (int i = 0; i < array1.length ; i++) {
                list2.add(array1[i]);
            }
                for (int j = 0; j < array2.length; j++) {
                    if (list2.contains(array2[j])) {
                    list3.add(array2[j]);
                }
                }
                return list3;
        }

        public static void task4 (int[] array1) {
            for (int i = array1.length-1; i >=0 ; i--) {

                System.out.println(array1[i]);


            }
        }

    }


