class OperateDemo
{
	public static void main(String[] args){
		//System.out.println(Integer.toBinaryString(60));
		int num = 60;
		//��ȡ60�������λ��ͨ��&15��
		int n1 = num & 15 ;
		System.out.println(n1>9?(char)(n1-10+'A'):n1);

		//int temp = 60 >> 4;
		int temp = 60 >>> 4;
		//�������ں�������������������ںź��������ں�����ν����������Ǹ����������ں�ǰ��һֱ��1��Զ�Ʋ��ꡣ
		//��temp��ֵ���������λ�Ļ�ȡ
		int n2 = temp & 15;

		System.out.println(n2>9?(char)(n2-10+'A'):n2);
		/*
		0-9 'A' 'B' 'C' 'D' 'E' 'F'
			65	66	67
			10	11	12	13	14	15

			12 - 10 = 2 + 'A' = (char) 67;
			���ȼ��㳬��10�ĸ���
			֮��'A'���ϳ����ĸ�������˳�ӵ�16���ƶ�Ӧ��ֵ 
			���ֵǿת���ַ�

		*/

		int x = 3,y;
		y = (x>1)?100:200;
		System.out.println(y);

	}
}