package io.sachinsadasivan.java.functionalprogramming.examples.examples.streams;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.List;
import static java.util.stream.Collectors.*;

public class TradingInfo {

	public static void main(String[] args) {
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);
		
		// Find all transactions in 2011 and sort by value (small to high)
		List<Transaction> ts2011 = transactions.stream()
				.filter(transaction -> transaction.getYear() == 2011)
				.sorted(comparing(Transaction::getValue))
				.collect(toList());
	
		ts2011.stream().forEach(System.out::println);

	}

}
