package com.jeevith.accounts.utility;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomerId implements IdentifierGenerator {


    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        String prefix = "CUST";
        int randomNumber = (int) (Math.random() * 10000);
        return prefix + randomNumber;
    }
}
