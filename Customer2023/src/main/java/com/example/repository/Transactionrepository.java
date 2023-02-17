package com.example.repository;

import com.example.model.Customer;
import com.example.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Transactionrepository extends JpaRepository<Customer,Integer> {
   public Transaction save(Transaction transaction);
}
