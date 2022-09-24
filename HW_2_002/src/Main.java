public class Main {
    public static void main(String[] args) {
        String[][] Arr = new String[8][8];
        for(int i = 0; i < Arr.length ; i++){
            for(int j = 0 ; j < Arr.length ; j++){
                if( i % 2 == 0 && j % 2 == 0 ){
                    Arr[i][j] = "W";
                } else if(i % 2 == 1 && j % 2 == 1) {
                    Arr[i][j] = "W";
                } else  {
                    Arr[i][j] = "B";
                }
            }
        }
        for(int i = 0; i < Arr.length ; i++) {
            for (int j = 0; j < Arr.length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}