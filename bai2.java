// viết một chương trình nhập vào số n và in ra bảng nhân của số đó
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao so n: ");
        int n = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            int ketQua = n * i;
            System.out.println("n" + "*" + i + "=" + ketQua);
        }

        scanner.close();
    }
    
}
