package com.calculator;

public class Client {
public static void main(String[] args) {
	//加操作
	Operation operation_add;
	operation_add=Factory.operate("+");
	operation_add.setA(7);
	operation_add.setB(5);
	System.out.println("加操作的结果为："+operation_add.getResult());
	
	//减操作
	Operation operation_subtract;
	operation_subtract=Factory.operate("-");
	operation_subtract.setA(7);
	operation_subtract.setB(5);
	System.out.println("减操作的结果为："+operation_subtract.getResult());
	
	
	//乘操作
	Operation operation_multiply;
	operation_multiply=Factory.operate("*");
	operation_multiply.setA(7);
	operation_multiply.setB(5);
	System.out.println("乘操作的结果为："+operation_multiply.getResult());
	
	//除操作
	Operation operation_divide;
	operation_divide=Factory.operate("/");
	operation_divide.setA(7);
	operation_divide.setB(5);
	System.out.println("除操作的结果为："+operation_divide.getResult());
	
	//除操作
	Operation operation_divide2;
	operation_divide2=Factory.operate("/");
	operation_divide2.setA(7);
	operation_divide2.setB(0);
	System.out.println("除操作中除数为0时的结果为："+operation_divide2.getResult());
}
}
