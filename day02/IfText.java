class IfText
{
	public static void main(String[] args){
		//����1�������û��������ֵ��ͬ����ӡ��Ӧ������Ӣ��
		//��һ�� if ... else if ... else...
		/*
		int num = 2;
		if (num == 1)
		{
			System.out.println("monday");
		}else if ( num == 2)
		{
			System.out.println("tuesday");
		}else{
			System.out.println("...");
		}
		*/

		//����2�������û�ָ�����·ݣ���ӡ���·������ļ���
		//3,4,5�������� 6,7,8�����ļ��� 9,10,11���＾�� 12,1,2��������
		int x = 4;
		if ( x == 3 || x == 4 || x == 5)
		{
			System.out.println(x+":����");
		}else if ( x == 6 || x == 7 || x ==8)
		{
			System.out.println(x+":�ļ�");
		}else if ( x == 9 || x ==10 || x ==11)
		{
			System.out.println(x+":�＾");
		}else if ( x == 12 || x == 1 || x == 2)
		{
			System.out.println(x+":����");
		}else{
			System.out.println("�·ݲ�����");
		}
		/*
		//�ڶ��ַ�ʽ
		int x = 4;
		if ( x >= 3 && x <= 5)
		{
			System.out.println(x+":����");
		}else if ( x >= 6 && x <=8)
		{
			System.out.println(x+":�ļ�");
		}else if ( x >= 9 && x <=11)
		{
			System.out.println(x+":�＾");
		}else if ( x == 12 || x == 1 || x == 2)
		{
			System.out.println(x+":����");
		}else{
			System.out.println("�·ݲ�����");
		}
		*/

		/*
		//�����ַ�ʽ
		int x = 4;
		if ( x > 12 && x < 1)
		{
			System.out.println("�·ݲ�����");
		}else if ( x >= 3 && x <=5)
		{
			System.out.println(x+":����");
		}else if ( x >= 6 && x <=8)
		{
			System.out.println(x+":�ļ�");
		}else if ( x >= 9 && x <=11)
		{
			System.out.println(x+":�＾");
		}else{
			System.out.println(x+":����");
		}
		*/

		System.out.println("Hello World");
	}
}