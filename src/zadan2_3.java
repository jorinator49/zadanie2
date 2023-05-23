import java.util.Scanner;

public class zadan2_3 {
    public static Scanner sc;
    public static int[] arr;

    public static void fillArr(int i){
        if(i < arr.length){
            System.out.println("Введите " + (i+1) + " элемент");
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }

    public static void printArr(int i){
        if(i < arr.length){
            System.out.println(arr[i]);
            printArr(++i);
        }
    }

    public static void main(String[] args){
        sc = new Scanner(System.in);
        arr = new int[5];
        fillArr(0);
        printArr(0);
    }
}