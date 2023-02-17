package com.example.service;

import com.example.model.Transaction;
import com.example.repository.Transactionrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    @Autowired private Transactionrepository transactionrepository;

    public Transaction saveTransaction(Transaction transaction) {
        return transactionrepository.save(transaction);
    }
}
