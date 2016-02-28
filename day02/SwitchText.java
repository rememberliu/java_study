class SwitchText
{
	public static void main(String[] args){
		//季节
		int x = 4;
		switch(x){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("error");
		}

		//if和switch语句比较像
		/*
		如果判断的具体数值不多，而是符合short int byte char这四种类型，建议使用switch。
		switch比if更高效。
		jdk7.0d对于swtich可以判断字符串。

		其他情况，布尔、区间判断等情况。更建议使用if。if的使用范围更广。
		*/
	}
}