class SwitchText
{
	public static void main(String[] args){
		//����
		int x = 4;
		switch(x){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("error");
		}

		//if��switch���Ƚ���
		/*
		����жϵľ�����ֵ���࣬���Ƿ���short int byte char���������ͣ�����ʹ��switch��
		switch��if����Ч��
		jdk7.0d����swtich�����ж��ַ�����

		��������������������жϵ������������ʹ��if��if��ʹ�÷�Χ���㡣
		*/
	}
}