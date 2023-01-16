public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[8][8];
        for(int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; j++){
                arr[i][j] = i ;
            }
        }
        int answ = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answ += arr[i][j];
            }
        }
        System.out.print(answ);
    }
}