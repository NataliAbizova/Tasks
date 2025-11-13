package H3_Strategy;

public class Strategy {
    public static void main(String[] args) {
        Payment payment;
        switch (args[0]) {
            case "0":
                payment = new Payment(new BankCard());
                payment.pay(1000);
                break;
            case "1":
                payment = new Payment(new PayNFC());
                payment.pay(1000);
                break;
            case "2":
                payment = new Payment(new CashPayments());
                payment.pay(1000);
                break;
        }
    }
}
