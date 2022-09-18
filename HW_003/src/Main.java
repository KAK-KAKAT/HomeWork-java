public class Main {
    public static void main(String[] args) {
        int[] Task;
        Task = new int[10];
        int a;
        a = 0;
        System.out.print("Answer: ");
        for (int i = 0; i < 10; i++) {
            Task[i] = i;
            if (i % 2 == 0) {
                a += i;
            }
            System.out.print(a + " ");
        }
    }
}