//viết chương trình tìm số amstrong
public class so_amstrong_la_gi{
    public static void main(String[] args) {
        for (int number = 1; number <= 500; number++) {
            if (chinh_la_amstrong(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean chinh_la_amstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
     
    }
}