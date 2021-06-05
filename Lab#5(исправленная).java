public class Main
{
    public static void main(String[] args) {
        int a = 80;
        int b = 43;
        int c = 24;
        int result = a ^ b ^ c;
        System.out.println(a + "^" + b + "^" + c);
        System.out.println("Result =" + result);
        System.out.println("Result in binary string =" + Integer.toBinaryString(result));
    }
}