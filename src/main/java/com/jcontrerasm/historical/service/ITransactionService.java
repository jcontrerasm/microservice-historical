package com.jcontrerasm.historical.service;

import com.jcontrerasm.historical.model.entity.Transaction;

public interface ITransactionService {
	public Transaction save(Transaction transaction);
	public Iterable <Transaction> findByBorrowId(Integer borrowId);
	public Iterable <Transaction> findAll();
}
