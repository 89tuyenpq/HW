package org.t2303e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountInfoUtils {
    public static AccountInfo createAccount(String[] values) throws IllegalArgumentException {
        if (values == null || values.length != 8) {
            throw new IllegalArgumentException("Invalid input values for creating AccountInfo.");
        }

        int transId;
        String cardType = values[1];
        String name = values[2];
        String cardNo = values[3];
        String idCard = values[4];
        String msisdn = values[5];
        String address = values[6];
        Date dateOfBirth;

        try {
            transId = Integer.parseInt(values[0]);

            // Validate card type
            if (!CardTypeValidator.isValidCardType(cardType)) {
                throw new IllegalArgumentException("Invalid card type.");
            }

            // Kiểm tra chuyển đổi ngày sinh
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateOfBirth = dateFormat.parse(values[7]);
        } catch (NumberFormatException | ParseException e) {
            throw new IllegalArgumentException("Invalid input values. " + e.getMessage());
        }

        return new AccountInfo(transId, cardType, name, cardNo, idCard, msisdn, address, dateOfBirth);
    }
}
