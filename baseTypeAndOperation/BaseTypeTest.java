public class BaseTypeTest{
	public static void main(String[] args){
		testUnderscore();
		testFloat();
		testCharAndString();
		testString();
	}
	//为了便于查看，可以在数字间加下划线:w_
	public static void testUnderscore(){
		 int binaryVal = 0B100_0000_0000_0000_0000_0000_0000_0011;
		 double pi = 3.14_159_265_3589;
		 System.out.println(binaryVal);
		 System.out.println(pi);
	}

	public static void testFloat(){
		float aFloat = 5.2345556f;
		System.out.println(aFloat);
		double a = 0.0;
		double b = 3.14E5;//3.14*10^5
		System.out.println(b);

		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		//两个类型的负无穷是相等的
		System.out.println(c == d);//true
		System.out.println(a / a);//NaN
		//两个类型的非数（NaN）却不同
		System.out.println(a / a == Float.NaN);//false
		//正无穷相等
		System.out.println(6.0f / 0 == 555.0 / 0);//true
		System.out.println(-8 / a);//-Infinity
		System.out.println(0.0 / 0.0);//NaN
		//抛出异常
		System.out.println(0 / 0);//Exception by /zero
	}

	public static void testCharAndString(){
		char aChar = 'a';
		char bChar = '\r';
		char cChar = '\u9999';
		char dChar = '中';
		int charValue = dChar;
		System.out.println(aChar);
		System.out.println(bChar);
		System.out.println(dChar);//中
		System.out.println(charValue);//int
		//"+" 只能在String上起拼接作用，
		//对char使用就会被当作int加法处理
		System.out.println(aChar + bChar + cChar);//39431
		//这里输出"Hello!a7"
		//计算"Hello!" + aChar 时左边是String,"+"于是作拼接操作，
		//返回"Hello!a"字符串
		//之后的+7就一样，仍然是String + int
		System.out.println("Hello!" + aChar + 7);
		//这里第一次是 int + char,char 被转成int,
		//作加法运作
		//第二次int + String 作字符串拼接
		System.out.println(7 + aChar + "Hello!");
	}

	public static void testString(){
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "He" + "llo";
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
	}
}
	
