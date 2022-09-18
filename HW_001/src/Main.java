import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        double input1 = inp.nextDouble();
        System.out.print("Enter Number 2:");
        double input2 = inp.nextDouble();
        System.out.print("Enter Number 3:");
        double input3 = inp.nextDouble();
        if (input1 % 5 > 0 ){
            input1 = 0;
        }
        if (input2 % 5 > 0){
            input2 = 0;
        }
        if (input3 % 5 > 0){
            input3 = 0;
        }
        double ans = input1 + input2 + input3;
        if (ans == 0){
            System.out.print("\nErr:01");
        }else{
            System.out.print("\nAnswer:" + ans);
        }
    }
}
