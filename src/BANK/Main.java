package BANK;
import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter your account number");
        int accNum = sc.nextInt();

        System.out.println("Enter your password");
        String password = sc.next();
        SBI_Bank bank = new SBI_Bank(password,accNum);

        System.out.println("enter your password to check balance") ;
        String pass = sc.next();
        bank.checkBalance(pass);

        System.out.println("enter your account number , password and amount you want to add") ;
        int ac = sc.nextInt();
        pass = sc.next();
        int amount = sc.nextInt();
        bank.addMoney(ac,pass,amount);


        System.out.println("enter your password to check balance") ;
         pass = sc.next();
        bank.checkBalance(pass);

        System.out.println("enter your account number , password and amount you want to withdraw") ;
         ac = sc.nextInt();
        pass = sc.next();
        amount = sc.nextInt();
        bank.withdraw(ac , pass,amount);
    }
}
