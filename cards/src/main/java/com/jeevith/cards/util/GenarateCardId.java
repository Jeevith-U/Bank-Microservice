package com.jeevith.cards.util;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.util.Random;

public class GenarateCardId implements IdentifierGenerator {
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        String prefix = "CARD";
        String suffix = String.valueOf(System.currentTimeMillis());
        int num = (int)(Math.random() * 10000);
        return prefix + suffix;
    }
}
