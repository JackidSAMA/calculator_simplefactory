package com.calculator;
//���Ĳ���
public class Operation_subtract extends Operation{
	@Override
	public double getResult() {
		double result=getA()-getB();
		return result;
	}
}
