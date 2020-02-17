/**
 C2 (9313 mod 2) = 1 (O1 - "-");
 C3 (9313 mod 3) = 1 (C = 1);
 C5 (9313 mod 5) = 3 (O2 - "+");
 C7 (9313 mod 7) = 3 (i, j - long);
 **/
public class Main {
    public static void main(String[] args) {
        double S = 0;
        int a = 1, b = 1;
        int m = 2, n = 2;
        int C = 1;
        if ((a <= n) && (b <= m)) {
            for (long i = a; i <= n; i++)
                if (i - C == 0) {
                    System.out.println("Division by zero");
                    return;

                } else {
                    for (long j = b; j <= b; j++)
                        S += (double) (i + j) / (i - C);
                }
            System.out.println("s = " + S);

        } else System.out.println("error");
    }
}
