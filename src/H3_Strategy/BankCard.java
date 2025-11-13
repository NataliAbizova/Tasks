package H3_Strategy;

class BankCard implements PayStrategy {

    public boolean pay(int summ){
        System.out.println("BankCard");
        return false;
    }
}
