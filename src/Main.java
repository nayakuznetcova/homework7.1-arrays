import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(Arrays.toString(number));

        double[] numberD = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(numberD));

        int[] numberP = {37, 49, 53};
        System.out.println(Arrays.toString(numberP));
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < number.length; i++) {
            if (i != number.length - 1) {
                System.out.print(number[i] + ",");
            } else {
                System.out.print(number[i] + " ");
            }
        }
        System.out.println(" ");
        double[] numberD = {1.57, 7.654, 9.986};
        for (int i = 0; i < numberD.length; i++) {
            if (i != numberD.length-1) {
                System.out.print(numberD[i] + ",");
            } else {
                System.out.print(numberD[i] + " ");
            }

        }
        System.out.println(" ");
        int[] numberP = {37, 49, 53};
        for (int i = 0; i < numberP.length; i++) {
            if (i != numberP.length-1) {
                System.out.print(numberP[i] + ",");
            } else {
                System.out.print(numberP[i] + " ");
            }

        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");

    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));

    }
}