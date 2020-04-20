package com.jcontrerasm.historical.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jcontrerasm.historical.model.entity.Transaction;
import com.jcontrerasm.historical.service.ITransactionService;

@RestController
public class HistoricalController {

	@Autowired
	private ITransactionService transactionService;

	@GetMapping("/v1/transaction/{borrowId}")
	public ResponseEntity<?> getTransactions(@PathVariable Integer borrowId) {
		Iterable<Transaction> iterableTransaction = transactionService.findByBorrowId(borrowId);
		return ResponseEntity.ok(iterableTransaction);
	}

	@GetMapping("/v1/transaction")
	public List<Transaction> list() {
		return (List<Transaction>) transactionService.findAll();
	}
}
