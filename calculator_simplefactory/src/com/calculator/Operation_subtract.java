package com.calculator;
//¼õµÄ²Ù×÷
public class Operation_subtract extends Operation{
	@Override
	public double getResult() {
		double result=getA()-getB();
		return result;
	}
}
