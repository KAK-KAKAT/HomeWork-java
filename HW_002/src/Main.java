public class Main {
    public static void main(String[] args){
        int[] Task;
        Task = new int[10];
        System.out.print("Answer: ");
        for (int i = 0; i < 10; i++){
            Task[i] = (int) Math.pow(i , 2);
            int answ = Task[i];
            System.out.print(answ + " ");
        }
    }
}