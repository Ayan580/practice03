import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 4, -5, 25, 60, 81, 30};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        numbers[2] = 30;
        System.out.println(numbers[3]);

        int[][] arr = {{2, 40}, {6, 8}, {9, -7}};
        System.out.println(arr[0][1]);


        for (int i = 2; i <= 6; i = i + 3) {
            System.out.println(i);
        }
        for (int i = 1; i <= 9; i++) {// i=i+1;
            System.out.println(i + "x8=" + (i * 7));

        }

        String str = "1";
        while (str.length() <= 10) {
            str = str + "3";
            System.out.println(str);
            System.out.println("Размер слова = " + str.length());
        }

        String[] names = {"anni", "john", "joni",};

        for (int i = 0; i < names.length; i++) {
            switch (i) {

                case 0:
                    System.out.println(names[i] + " Доброго утра");
                    break;

                case 1:
                    System.out.println(names[i] + " Доброго дня");
                    break;

                case 2:
                    System.out.println(names[i] + " Доброго вечера");
                    break;


            }
        }
    }
}