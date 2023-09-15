
/*chương trình tính tổng n các số tự nhiên đầu tiên,
  khi n được nhập từ bàn phím
 */
import java.util.Scanner;

public class tinh_tong_n_so_tu_nhien {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("nhap vao so n: ");
    int n = scanner.nextInt();

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println("Tong cac so tu nhien dau tien cho den n la :" + sum);

    scanner.close();
  }

}
