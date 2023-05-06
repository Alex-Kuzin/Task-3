public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double payment1 = service.calculate(1_000_000, 12);
        System.out.println("Ежемесячный платеж:" + payment1);

        double payment2 = service.calculate(1_000_000, 24);
        System.out.println("Ежемесячный платеж:" + payment2);

        double payment3 = service.calculate(1_000_000, 36);
        System.out.println("Ежемесячный платеж:" + payment3);
    }
}