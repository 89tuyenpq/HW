package org.t2303e;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            String filePath = "D:/Bank account.txt";
            List<AccountInfo> accounts = AccountReader.readAccounts(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
