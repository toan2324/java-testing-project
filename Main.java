public class Main {

    public static int tinhTongChan(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {   
            if (i % 2 == 0) {           
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(tinhTongChan(5));
    }
}