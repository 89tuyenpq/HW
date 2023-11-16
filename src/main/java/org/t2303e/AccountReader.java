package org.t2303e;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccountReader {
    public static List<AccountInfo> readAccounts(String filePath) throws IOException {
        List<AccountInfo> accounts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\|");
                if (values.length == 8) {
                    AccountInfo account = createAccount(values);
                    if (account != null) {
                        accounts.add(account);
                    }
                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }
        }

        return accounts;
    }

    private static AccountInfo createAccount(String[] values) {
        return null; // return khi data lỗi
    }
}
