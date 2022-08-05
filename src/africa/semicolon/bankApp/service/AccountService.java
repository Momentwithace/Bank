package africa.semicolon.bankApp.service;

import africa.semicolon.bankApp.data.models.Account;

public interface AccountService {
    Account addAccount(Account account);
    int getNumberOfAccounts();
    void removeAccount(Account account);
    int count();
}
