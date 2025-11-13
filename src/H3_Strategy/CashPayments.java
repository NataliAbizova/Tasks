package H3_Strategy;

class CashPayments implements PayStrategy {

    public boolean pay(int summ){
        System.out.println("CashPayments");
        return false;
    }
}
