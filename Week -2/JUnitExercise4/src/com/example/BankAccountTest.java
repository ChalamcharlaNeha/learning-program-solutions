package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(); 
        account.deposit(100);        
    }

    @After
    public void tearDown() {
        account.reset(); 
    }

    @Test
    public void testDeposit() {
        account.deposit(50);

        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        account.withdraw(40);

        assertEquals(60, account.getBalance());
    }

    @Test
    public void testOverdraw() {
        account.withdraw(200);  
        assertEquals(100, account.getBalance());
    }
}
