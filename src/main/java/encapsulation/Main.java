package encapsulation;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        AccountBadApproach account = new AccountBadApproach();
        account.balance = new BigDecimal(9);
        System.out.println(account.balance);
//        Account account = new Account();
//        System.out.println(account.getBalance());
    }
}
