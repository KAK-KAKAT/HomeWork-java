import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = new int[3][3][3];
        System.out.print("Enter number:");
        int addtoarr = scanner.nextInt();
        for(int i = 0; i < arr.length ; i++){
            for(int j = 0; j < arr[i].length ; j++){
                for(int k = 0; k < arr[i][j].length ; k++) {
                    arr[i][j][k] = i + addtoarr + 1;
                }
            }
        }
        for(int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for(int k = 0; k < arr[i][j].length ; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}