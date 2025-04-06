package net.javaguides.banking.service;

import net.javaguides.banking.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double balance);

    AccountDto withDraw(Long id, double balance);

    List<AccountDto>getAllAccounts();

    void deleteAccount(Long id);
}
