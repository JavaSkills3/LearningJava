import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a number: ");
        int number =sc.nextInt();

        for(int i =1;i<=number;i++){
            if(i==3)
                continue;
            if(i==8)
                break;
            System.out.println(i);
        }
    }
}
