package org.t2303e;
public class CardTypeValidator {
    public static boolean isValidCardType(String cardType) {
        return cardType != null && !cardType.isEmpty();
    }
}

