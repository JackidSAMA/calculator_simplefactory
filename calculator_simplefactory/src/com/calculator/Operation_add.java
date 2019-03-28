package com.calculator;
//¼ÓµÄ²Ù×÷
public class Operation_add extends Operation{
	@Override
	public double getResult() {
		double result=getA()+getB();
		return result;
	}
}
