package com.mastercard.trainees.lambdas;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		execFunction(str -> str.toUpperCase());
	}

	public static void execFunction(Function<String, String> fun) {
		System.out.println(fun.apply("oi?"));
	}
	
}
