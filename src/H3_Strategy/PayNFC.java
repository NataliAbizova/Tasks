package H3_Strategy;

 class PayNFC implements PayStrategy {

    public boolean pay(int summ) {
        System.out.println("PayNFC");
        return false;
    }
}
