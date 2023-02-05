package encapsulation;

import java.math.BigDecimal;

public class Account {
    private BigDecimal balance = new BigDecimal(1000);

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance(){
        return balance;
    }


}
