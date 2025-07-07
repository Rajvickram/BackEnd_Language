import java.util.Scanner;

class BiggerOrSmaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Value : ");
        int a = sc.nextInt();

        System.out.println("Enter B Value : ");
        int b = sc.nextInt();

        System.out.println("Enter C Value : ");
        int c = sc.nextInt();

        if (a > b) {
            System.out.println("A is Bigger");
        }
        else if (b > c) {
            System.out.println("B is Bigger");
        }
        else {
            System.out.println("C is Bigger");
        }
    }
}