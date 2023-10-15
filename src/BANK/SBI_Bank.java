package BANK;

public class SBI_Bank implements RBI{
    int balance = 0  ;
    final  String password ;
    int accNum ;

    public SBI_Bank(String password,int accNum){
        this.accNum = accNum ;
        this.password = password ;
        System.out.println("Thank your choosing SBI Bank but this is lunch break please come later") ;
    }
    @Override
    public void checkBalance(String password) {
        if(password.equals(this.password)){
            System.out.println( "current balance is " +balance) ;
        }
        else  System.out.println( "wrong password");
    }

    @Override
    public void addMoney(int accNum, String password, int amt) {
        if(password.equals(this.password)) {
            balance+=amt;
            System.out.println( "Amount has been added you can check balance now" );
        }
        else System.out.println( "Wrong Password");
    }

    @Override
    public void withdraw(int accNum, String password, int amt) {

         if(password.equals(this.password)) {
                 if(balance-amt<0) {
                     System.out.println( "insufficient balance" ) ;
                     return;
                 }
            balance-=amt;
             System.out.println( "Amount of RS "+amt+" withdrawl success remaining balance is "+balance );
        }else System.out.println( "Wrong Password");
    }


}
