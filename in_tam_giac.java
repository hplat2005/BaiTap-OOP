public class in_tam_giac {
    public static void main(String[] args) {
        int rows = 9;

        for (int i = 1; i <= rows; i++) {
            // In khoảng trắng để dịch chuyển tam giác sang phải
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // In các ký tự '*' tạo thành tam giác
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
           
        }
    }

    
}