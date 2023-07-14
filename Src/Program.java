import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(200) +10;
        SimpleNumber simpleNumber = getSimpleNumber(num);
        System.out.println(simpleNumber);
    }

    public static SimpleNumber getSimpleNumber(int number) {
        SimpleNumber simpleNumber = new SimpleNumber(0, number);
        int counter = 0;
        while (true) {
            for (int i = number; i > 0; i--) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter <= 2) {
                simpleNumber.setSimpleNumber(number);
                return simpleNumber;
            }
            counter = 0;
            number --;
        }
    }
}
