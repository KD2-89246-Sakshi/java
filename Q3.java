package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Q3 {

	public static void main(String[] args) {

		IntStream strm = IntStream.of(1, 2, 3, 4, 5, 6, 7);

		int res = strm.sum();

		System.out.println("Sum : " + res);

		IntStream strm2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);

		IntSummaryStatistics stats = strm2.summaryStatistics();

		System.out.println("Count : " + stats.getCount());
		System.out.println("Avg : " + stats.getAverage());
		System.out.println("Max : " + stats.getMax());
		System.out.println("Min : " + stats.getMin());
		System.out.println("Sum  : " + stats.getSum());

	}

}
