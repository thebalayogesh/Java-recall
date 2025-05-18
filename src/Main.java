import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ur name: ");
        String name = sc.nextLine();
        System.out.println("Hello, "+ name);
    }
    static int sum(int a, int b){
        return a + b;
    }
}

