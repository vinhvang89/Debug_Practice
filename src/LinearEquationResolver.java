import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a :");
        double a = scanner.nextDouble();
        System.out.println("Enter b :");
        double b = scanner.nextDouble();
        System.out.println("Enter c :");
        double c = scanner.nextDouble();
        if( a == 0 && b != c)
            System.out.println("No solution");
        else if( a == 0 && b == c)
            System.out.println("The solution is all");
        else if( a != 0 && b != 0 && c!= 0)
            System.out.println("There is a solution : " + (c-b)/a);
    }
}
