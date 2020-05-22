package ch05;


public class Euclidean {
    public static int euclid(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }
        if (x % y == 0) {
            return y;

        } else {
            return euclid(y, x % y);
        }
    }
    public static void main(String[] args) {
        System.out.println("result: " + euclid(45, 32));
        System.out.println("result: " + euclid(12678, 9836));
    }
}

