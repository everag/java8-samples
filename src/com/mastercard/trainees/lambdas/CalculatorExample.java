package com.mastercard.trainees.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CalculatorExample {

	public static Map<Character, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
	
	static {
		operations.put('+', (x, y) -> x + y);
		operations.put('-', (x, y) -> x - y);
		operations.put('/', (x, y) -> x / y);
		operations.put('*', (x, y) -> x * y);
	}
	
	public static void main(String[] args) {
		System.out.println(operations.get('+').apply(10, 5));
		System.out.println(operations.get('-').apply(5, 4));
		System.out.println(operations.get('*').apply(11, 2));
		System.out.println(operations.get('/').apply(20, 2));
	}
}
