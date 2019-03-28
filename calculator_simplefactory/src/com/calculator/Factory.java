package com.calculator;

public class Factory {



	public static Operation operate(String type) {
		Operation operation = null;

		switch (type) {
		case "+":
			operation = new Operation_add();
			break;
		case "-":
			operation = new Operation_subtract();
			break;
		case "*":
			operation = new Operation_multiply();
			break;
		case "/":
			operation = new Operation_divide();
			break;

		}

		return operation;

	}

}
