//viết chương trình tính giai thừa chủa số n
import java.util.Scanner;

public class tinh_giai_thua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao so nguyen duong: ");
        int n_input_user = scanner.nextInt();

        long giai_thua = calculate_giai_thua(n_input_user);

        System.out.println("giai thua cua " + n_input_user + " la: " + giai_thua);
     
        scanner.close();
    }

    public static long calculate_giai_thua (int n_input_user) {
        if (n_input_user == 0 || n_input_user == 1) {
            return 1;
        } else {
            long giai_thua = 1;
            for (int i = 2; i <= n_input_user; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}