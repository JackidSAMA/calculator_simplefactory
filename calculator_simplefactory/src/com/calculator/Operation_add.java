package com.calculator;
//�ӵĲ���
public class Operation_add extends Operation{
	@Override
	public double getResult() {
		double result=getA()+getB();
		return result;
	}
}
