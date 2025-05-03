package com.jeevith.Loans.util;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class GenarateLoansId implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {

        String prefix = "LOAN";
        String suffix = String.valueOf(System.currentTimeMillis());
        long randomNumber = (long) (Math.random() * 10000);
        String loanId = prefix + randomNumber + suffix;
        return loanId;
    }
}
