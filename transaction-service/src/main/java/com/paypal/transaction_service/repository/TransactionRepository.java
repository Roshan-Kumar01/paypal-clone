package com.paypal.transaction_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paypal.transaction_service.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

     List<Transaction> findBySenderIdOrReceiverId(Long senderId, Long receiverId);
} 
