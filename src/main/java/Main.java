public class Main {
    public static void main(String[] args) {

        Calculator twoDigits = new Calculator(16.0d, 4.0d);
        System.out.println(twoDigits.Add());
        System.out.println(twoDigits.Subtract());
        System.out.println(twoDigits.Multiply());
        System.out.println(twoDigits.Divide());
        System.out.println(twoDigits.Exponent());
        System.out.println(twoDigits.Square());
        System.out.println(twoDigits.SquareRoot());

    }
}
