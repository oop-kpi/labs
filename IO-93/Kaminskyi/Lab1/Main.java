import java.util.Scanner;
/**
 C2 = 9314 % 2zz = 0 ( + );
 C3 = 9314 % 3 = 2 ( 2 );
 C5 = 9314 % 5 = 4 ( - );
 C7 = 9314 % 7 = 4 ( char );
 **/
public class Main {

    public static double func(char i, char j){
        return (double)(i-j)/(j+2);
    }
    public static void main(String[] args) {
        double result = 0;
        Scanner scan = new Scanner(System.in);
        char a;
        char b;
        int n;
        int m;
        System.out.println("Enter \"i\", \"j\", \"n\" and \"m\" values:");
        a = scan.next().charAt(0);
        b = scan.next().charAt(0);
        n = scan.next().charAt(0);
        m = scan.next().charAt(0);
        for (char i = a; i <= n; i++) {
            for (char j = b; j <= m; j++) {
                result += func(a, b);
            }
        }
        System.out.println(result);
        }
}
