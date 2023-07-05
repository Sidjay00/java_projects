import java.util.Scanner;

/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // String s = null;
        // System.out.println(s);
        // float f = 123.450f;
        // char ch = '{';
        // System.out.println(ch);
        
        // boolean f true ^ false;
        // var i = 123;    //неявная типизация
        
        // int a = 8;
        // // 1000
        // // a = a << 1;
        // System.out.println(a << 1);

        // одномерные массивы
        // int[] arr = new int[10];
        // arr[3] = 13;
        // System.out.println(arr[3]);

        //многомерные массивы
        // int[][] arr = new int[3][5];

        //получение данных из терминала
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);
        iScanner.close();

        

    }
    
}