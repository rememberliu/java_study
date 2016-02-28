class OperateDemo
{
	public static void main(String[] args){
		//System.out.println(Integer.toBinaryString(60));
		int num = 60;
		//获取60的最低四位，通过&15；
		int n1 = num & 15 ;
		System.out.println(n1>9?(char)(n1-10+'A'):n1);

		//int temp = 60 >> 4;
		int temp = 60 >>> 4;
		//三个大于号如果是整数则两个大于号和三个大于号无所谓，但是如果是负数两个大于号前面一直补1永远移不完。
		//对temp的值进行最低四位的获取
		int n2 = temp & 15;

		System.out.println(n2>9?(char)(n2-10+'A'):n2);
		/*
		0-9 'A' 'B' 'C' 'D' 'E' 'F'
			65	66	67
			10	11	12	13	14	15

			12 - 10 = 2 + 'A' = (char) 67;
			首先计算超过10的个数
			之后'A'加上超过的个数就是顺延到16进制对应的值 
			最后将值强转回字符

		*/

		int x = 3,y;
		y = (x>1)?100:200;
		System.out.println(y);

	}
}