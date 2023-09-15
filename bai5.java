// viết chương trình nhập n , từ đó in ra 1/1 + 1/2 + 1/n
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap n: ");
        int n_input_user = scanner.nextInt();

        double tong = 0.0;
        for (int i = 1; i <= n_input_user; i++) {
            tong += 1.0 / i;
        }

        System.out.println("tong cua chuoi la: " + tong);
    scanner.close();    
    }

}