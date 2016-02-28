class IfDemo
{
	public static void main(String[] args){
		/*
		int x = 3;
		if(x>1){
			System.out.println("hello world");
		}
		//只有一条语句
		if(x>1)
			System.out.println("hello world");
		System.out.println("over");
		*/

		/*
		int a = 3;
		if(a>1){
			System.out.println(a);
		}else{
			System.out.println(-a);
		}
		*/

		//if...else...类似于三元运算符，但是二者有区别。

		/*
		if else 结构 简写格式：变量=(条件表达式)？表达式1：表达式2；
		
		三元运算符：
			好处：可以简化if else代码
			弊端：因为是一个运算符，所以运算完必须要有一个结果。
		
		*/



		int a = 9,b;

		b = (a>1)?100:200;
		
		//b = (a>1) ? System.out.println("haha"):200;

		if (a>1)
		{
			b = 100;
		}else{
			b = 200;
		}
		//上述二者等价

		/*

		*/

		int n = 3;
		if (n>1)
		{
			System.out.println("a");
		}else if (n>2)
		{
			System.out.println("b");
		}else{
			System.out.println("c");
		}

	}
}