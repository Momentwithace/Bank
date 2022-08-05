package africa.semicolon.bankApp.service;

import africa.semicolon.bankApp.data.models.Bank;
import java.util.List;

public interface BankService {
    Bank addBank(Bank bank);
    int getNumberOfBanks();
    void deleteBank(Bank bank);
    List<Bank> findByBankName();
    List<Bank> findAccount();
    int count();

}
