class VarDemo{
	public static void main(String[] args){

		//定义变量的格式
		//数据类型 变量名 = 初始化值；
		//定义一个int类型的变量，取值为4
		int x = 4;
		System.out.println(x);
		x = 10;
		System.out.println(x);

		//演示其他数据类型
		byte b = 2;//-128~127
		//byte b1 = 128
		short s = 2000;//-32768~32767
		long l = 4l;
		float f = 2.3f;
		double d = 32.45;

		char ch = '4';//
		char ch1 = 'a';
		char ch2 = '+';
		char ch3 = ' ';

		//同一区间不能定义同一个名字的变量
		Boolean bo = true;

		/*
		什么时候定义变量？
		当数据不确定的时候，需要对数据进行存储时，就需要定义一个变量来完成存储动作。
		*/

		int a = 5;
		a = a + 6;

		//类型转换
		//byte bb = 3;
		//bb = bb + 2;
		//System.out.println(bb);

		//System.out.println('a');
		//System.out.println((char)('a'+1));





	}
}