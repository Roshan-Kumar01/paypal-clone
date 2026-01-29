package com.paypal.transaction_service.service;

import java.util.List;

import com.paypal.transaction_service.entity.Transaction;

public interface TransactionService {
    Transaction createTransaction(Transaction transaction);
    public Transaction getTransactionById(Long id);
    public List<Transaction> getTransactionsByUser(Long userId);
    public List<Transaction> getAllTransactions();
}
