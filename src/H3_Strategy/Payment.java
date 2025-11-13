package H3_Strategy;

class Payment {
    private PayStrategy payStrategy;

    public Payment(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean pay(int summ) {
     return payStrategy.pay(summ);
    }

}
