package com.calculator;

//除的操作
public class Operation_divide extends Operation {

	@Override
	public double getResult() {
		double result=0;
		// 加入异常判断，防止除数出现0的情况
		try {
			result = getA()/getB();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
