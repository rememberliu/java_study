class IfDemo
{
	public static void main(String[] args){
		/*
		int x = 3;
		if(x>1){
			System.out.println("hello world");
		}
		//ֻ��һ�����
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

		//if...else...��������Ԫ����������Ƕ���������

		/*
		if else �ṹ ��д��ʽ������=(�������ʽ)�����ʽ1�����ʽ2��
		
		��Ԫ�������
			�ô������Լ�if else����
			�׶ˣ���Ϊ��һ����������������������Ҫ��һ�������
		
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
		//�������ߵȼ�

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