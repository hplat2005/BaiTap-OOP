public class in_tam_giac_rong {
    public static void main(String[] args) {
        int rows = 8;

        for (int i = 1; i <= rows; i++) {
            // In khoảng trắng để căn chỉnh tam giác
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // In các ký tự '*' tạo thành tam giác rỗng
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == rows || k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}