public class zad3 {
    public static void main(String[] args) {
        int t = 2022;
        int p = t-200;
        int f = t+100;
        for (int i = p;i <= f;i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
