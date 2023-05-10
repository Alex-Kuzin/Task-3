import java.math.BigInteger;

public class CreditPaymentService {
    public double calculate(int b, int a) {
        float interestRate = (float) 9.99 / 100 / 12; // Ставка в месяц
        float calculation = (float) Math.pow(1 + interestRate, a);
        float calculation2 = calculation * interestRate;
        float calculation3 = calculation - 1;
        float calculation4 = calculation2 / calculation3;
        float annuityPayment = Math.round(b * calculation4);
        return annuityPayment;
        }
    }
