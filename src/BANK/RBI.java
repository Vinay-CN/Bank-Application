package BANK;

public interface RBI {
    public void checkBalance(String passwrod);
    public void addMoney(int accNum , String password , int amt);

    public void withdraw(int accNum ,String password , int amt);

}
