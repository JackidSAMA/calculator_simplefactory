package com.calculator;

public class Client {
public static void main(String[] args) {
	//�Ӳ���
	Operation operation_add;
	operation_add=Factory.operate("+");
	operation_add.setA(7);
	operation_add.setB(5);
	System.out.println("�Ӳ����Ľ��Ϊ��"+operation_add.getResult());
	
	//������
	Operation operation_subtract;
	operation_subtract=Factory.operate("-");
	operation_subtract.setA(7);
	operation_subtract.setB(5);
	System.out.println("�������Ľ��Ϊ��"+operation_subtract.getResult());
	
	
	//�˲���
	Operation operation_multiply;
	operation_multiply=Factory.operate("*");
	operation_multiply.setA(7);
	operation_multiply.setB(5);
	System.out.println("�˲����Ľ��Ϊ��"+operation_multiply.getResult());
	
	//������
	Operation operation_divide;
	operation_divide=Factory.operate("/");
	operation_divide.setA(7);
	operation_divide.setB(5);
	System.out.println("�������Ľ��Ϊ��"+operation_divide.getResult());
	
	//������
	Operation operation_divide2;
	operation_divide2=Factory.operate("/");
	operation_divide2.setA(7);
	operation_divide2.setB(0);
	System.out.println("�������г���Ϊ0ʱ�Ľ��Ϊ��"+operation_divide2.getResult());
}
}
