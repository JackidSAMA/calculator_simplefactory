package com.calculator;

//���Ĳ���
public class Operation_divide extends Operation {

	@Override
	public double getResult() {
		double result=0;
		// �����쳣�жϣ���ֹ��������0�����
		try {
			result = getA()/getB();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
