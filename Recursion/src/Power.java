public class Power {
    public static int pow(int x, int y) {
        if (y > 1)
            return x * pow(x, y - 1);
        else if (y == 1)
            return x;
        else if (y == 0)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println("3 in degree 3 = " + Integer.toString(pow(3, 3)));
    }
}