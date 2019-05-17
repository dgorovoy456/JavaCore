import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tasks4 {
    public static void main(String[] args) throws IOException {

        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();

    }

    public static void task1() {
        String name = "Denys";
        String pupil1 = "elementary";
        String pupil2 = "average";
        String pupil3 = "suffcient";
        String pupil4 = "high";
        Random random = new Random();
        int grade = random.nextInt(12);
        System.out.println(grade);

        if (grade <= 3) {
            System.out.println(name + "-" + pupil1);
        }
        if (grade >= 4 && grade <= 6) {
            System.out.println(name + "-" + pupil2);
        }
        if (grade >= 7 && grade <= 9) {
            System.out.println(name + "-" + pupil3);
        }
        if (grade >= 10) {
            System.out.println(name + "-" + pupil4);
        }

    }

    public static void task2() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        System.out.print("Enter number of month:");
        while ((line = reader.readLine()) != null) {
            int number = 0;
            try {
                number = Integer.parseInt(line);
            } catch (NumberFormatException e) {

            }
            if (line.equals("q")) {
                System.out.println("Exit");
                System.exit(0);
            } else if (number >= 1 && number <= 3) {
                System.out.println("Winter");
            } else if (number == 12) {
                System.out.println("Winter");
            } else if (number >= 3 && number <= 5) {
                System.out.println("Sprint");
            } else if (number >= 6 && number <= 8) {
                System.out.println("Summer");
            } else if (number >= 9 && number <= 11) {
                System.out.println("Autumn");
            } else {
                System.out.println("Not in calendar");
            }

            System.out.println(line);
        }
    }

    public static void task3() {

        Random random = new Random();
        int discs = random.nextInt(1000);
        System.out.println("Discs need " + discs);
        int minSum = 0;

        if (discs > 100 ) {
            minSum = minSum + discs / 100 * 100;
            discs =  discs % 100;
        }  if (discs > 20) {
            minSum = minSum + discs / 20 * 30;
            discs = discs % 20;
        }  if (discs > 0) {
            minSum = minSum + discs * 2;
        }

        System.out.println("Sum " + minSum);
    }

    public static void task4 () throws IOException {

        BufferedReader day = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader month = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String line1;
        int number = 0;
        int number1 = 0;
        System.out.println("Enter the day");
        while ((line = day.readLine()) !=null) {
            try {
                number=Integer.parseInt(line);
            } catch (NumberFormatException e) {
            }
            if (number>0 && number<=31){
                System.out.println("Day - " + number);
                break;
            }
            else   {
                System.out.println("Incorrect number of day");
                System.out.println("Please try again");
            }
        }
        System.out.println("Enter the month");
        while ((line1 =month.readLine()) !=null) {
            try {
                number1=Integer.parseInt(line1);
            } catch (NumberFormatException e) {
            }
            if (number1>=1 && number1<=12) {
                System.out.println("Month - " + number1);
                break;
            }
            else {
                System.out.println("Incorrect number of month");
                System.out.println("Please try again");
            }
        }
        if (number1>=1 && number1<=3) {
            System.out.println("Quarter -" + "1");
        } else if (number >=4 && number1<=6) {
            System.out.println("Quarter -" + "2");
        } else if (number1 >= 7 && number1 <= 9) {
            System.out.println("Quarter -" + "3");
        } else if (number1 >= 10 && number1 <= 12) {
            System.out.println("Quarter -" + "4");
        }
    }

    public static void task5 () {

        int number;
        int number1;
        int largestDigit=0;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please enter the number");
        number = scaner.nextInt();

        while (number > 0) {

            number1 = number%10;

            if (largestDigit < number1) {
                largestDigit=number1;

                number = number/10;
            }
            System.out.println("The LargestDigit is - " + largestDigit);
            break;
        }

    }

    public static void task6 () {

        int a = 10;
        int b = 12;
        int c = 23;

        int median= a+b/2;

        System.out.println(median);

    }

    public static void task7 () throws IOException {

        Scanner h1= new Scanner(System.in);
        Scanner m1= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        Scanner h2= new Scanner(System.in);
        Scanner m2= new Scanner(System.in);
        Scanner s2= new Scanner(System.in);
        int hs,ms,ss,hf,mf,sf;
        int hd=0,md=0,sd=0;


        System.out.println("Please Enter the start time");
        System.out.println("hours");
        hs=h1.nextInt();
        System.out.println("minutes");
        ms=m1.nextInt();
        System.out.println("seconds");
        ss=s1.nextInt();

        System.out.println("Please Enter the finish time");
        System.out.println("hours");
        hf=h2.nextInt();
        System.out.println("minutes");
        mf=m2.nextInt();
        System.out.println("seconds");
        sf=s2.nextInt();
        if (sf>ss || sf==ss) {
            sd = sf-ss;
        }
        else {
            sd = (sf+60)-ss;
        }
        if (mf>ms || mf==ms) {
            md=md +(mf-ms);
        }
        else {
            md = md+(mf+ms-60);
        }
        if (hf>hs || hf==hs) {
            hd = hd +(hf-hs);
        }
        else {
            hd = hd + (hf+24-hs);
        }
        System.out.println("Start time - "+hs+":"+ms+":"+ss);
        System.out.println("Finish time -"+hf+":"+mf+":"+sf);
        System.out.println("Duration Olimpiad - "+hd +":" + md +":" + sd);
    }
    public static void task8 () {
        int p = 2;
        int q = 4;
        int n = 16;
        int apartment;
        int floor=0;
        int section=0;
        int apOnTheFloor = (n/p)/q;
        int apOnTheSections = n/p;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the apartment number");
        apartment= scanner.nextInt();
        if (apartment%2!=0) {
            apartment = apartment+1;
        }
        if (apartment<=n/p) {
            section = p/2;
        }
        else {
            section = p;
        }
        if (section<2) {
            floor = (apartment)/apOnTheFloor;
        }
        else {
            floor = (apartment-apOnTheSections)/apOnTheFloor;
        }
        System.out.println("Section - " + section);
        System.out.println("Floor - " +  floor);






    }

    public static void task9 () {
        int sum=1;
        int [] arr = new int[3];
        Random random = new Random();
        int numbers = random.nextInt(10);

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=random.nextInt(10);
            sum= sum* arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println( "Product of digits is - " +sum);
    }




}





