package com.jcontrerasm.historical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcontrerasm.historical.model.entity.Transaction;
import com.jcontrerasm.historical.model.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaction save(Transaction transaction) {
		return transactionRepository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByBorrowId(Integer borrowId) {
		return transactionRepository.findByBorrowId(borrowId);
	}

	@Override
	public Iterable<Transaction> findAll() {
		return transactionRepository.findAll();
	}
}
