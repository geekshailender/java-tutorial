public class SumEvenDigits {

    public static int sumOfEvenDigits(int number) {
        int sum = 0;
        System.out.println("digits: " + number);
        while (number > 0) {
            int digit = number % 10;
            System.out.println("digit: " + digit);
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
            System.out.println("sum: " + sum);
            System.out.println("digits number: " + number);
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 123456;
        int evenSum = sumOfEvenDigits(num);
        System.out.println("Sum of even digits in " + num + " is: " + evenSum); // Output: 12
    }
}