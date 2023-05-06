import java.math.BigInteger;

public class CreditPaymentService {
    public double calculate(int b, int a) {
        float r = (float)15 / 100 / 12; // Ставка в месяц
        double m = b * ((r * Math.pow((1 + r), 12 * a)) / (Math.pow((1 + r), 12 * a) - 1));
        double s = 12 * a * m;
        System.out.println("Платеж: " + m);
        System.out.println("Сумма: " + s);


         return m;


        }
    }
