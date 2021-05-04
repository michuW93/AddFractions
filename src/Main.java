public class Main {
    public static int num1=1, den1=5, num2=3, den2=15;

    public static void main(String[] args){
        int commonDen = lcm(den1, den2);

        int firstFactor = commonDen/den1;
        int secondFactor = commonDen/den2;

        num1 = num1 * firstFactor;
        num2 = num2 * secondFactor;

        int num3 = num1 + num2;
        System.out.println(num3 + "/" + commonDen);
    }

    public static int gcd(int a, int b){
        while (a != b){
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int lcm(int a, int b){
        return a*b / (gcd(a,b));
    }
}
