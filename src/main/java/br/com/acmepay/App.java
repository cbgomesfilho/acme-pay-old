package br.com.acmepay;

import br.com.acmepay.domain.Account;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Account account = new Account();
        account.setId(1L);
        account.setCreated_at(LocalDateTime.now());
        account.setUpdated_at(null);
        account.setClose(false);
        account.setAgency(1010);
        account.setNumber(203040);
        account.setBalance(BigDecimal.ZERO);

        System.out.println(account.getAgency());
    }
}
