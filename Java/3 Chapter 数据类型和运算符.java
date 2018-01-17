3 Chapter 数据类型和运算符：

Page 53 

3.1 注释
	单行注释 //
	多行注释 /*  
				*/
	文档注释 /** 
			*/
		中间内容会被提取到 API文档中
	
应用程序接口： API 

3.2 标识符和关键字
	3.2.1 分隔符：
	; {} [] ()  .

3.3 数据类型分类
java 所有的变量必须显示声明类型
JAva 支持的类型分为2类： Primitive type & Reference Type  引用类型
基本类型：Boolean　＋　数值类型：
引用类型：　类，　接口，　数组类型
　　　

3.4 基本数据类型
3.4.3 字符型：


public class CharTest{
	public static void main(String[] args){
		char zhong='疯';
		int  zhongValue=zhong;
		System.out.println(zhongValue);
		char c=97;
		System.out.println(c); //a
	}
}
OUTPUT:
30127
a




3.4.4 浮点型： 
浮点数有两种表示形式：
1）。 十进制 一定要有小数点
2）。 科学记数法 5.12e2 5.12E2
Java默认是 double 类型， 如当作float类型， 应该在数值后面 + F 或者f

3种特殊的浮点数值： 正无穷大， 负无穷大， 非数
正无穷大： Double or  Float 的 POSITIVE_INFINITY 
负无穷大： Double or Float 的 NEGATIVE_INFINITY 
非数： Double Float 的 NaN表示

public class FloatTest{
	public static void main(String[] args){
		float af=5.2345556f; //5.2345557
		System.out.println(af);
		
		double c= Double.NEGATIVE_INFINITY;
		float d= Float.NEGATIVE_INFINITY;
		System.out.println(c==d); //true
		
		double a=0.0;
		System.out.println(a/a==Float.NaN);  //false 
		
		System.out.println(6.0/0==555.0/0); //true 
		
		System.out.println(-8/a); //-Infinity
		
		System.out.println(0/0); //java.lang.ArithmeticException: / by zero
	// 只有浮点数 除以0 才能得到无穷大，
	//如果一个证书除以0 ， 得到一个异常
	}
}

OUTPUT:
5.2345557
true
false
true
-Infinity
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FloatTest.main(FloatTest.java:17)
		
		

3.4.6 布尔型
其他基本数据类型的值 必能转换成 boolean 类型

String str=true+"";  // 这样是可行的
System.out.println(str);
OUTPUT: true



3.6 直接量：
基本类型 字符类型 null类型
String s0="hello";
String s1="hello";
String s2="he"+"llo";
System.out.println(s0==s1);
System.out.println(s0==s2);
System.out.println(s1==s2);

OUTPUT:
true
true
true 


Page 73

3.7 运算符

3.7.1 算数运算符
如果除法运算符的两个操作数有一个是浮点数， 或者两个都是浮点数， 则计算的寄过也是浮点数，
此时允许除数是0， 或者0.0 得到无穷大
如：
System.out.println(-5/0)； // 抛出异常


% 求余运算符 
public class ModTest{
	public static void main(String[] args){
		double a=5.2;
		double b=3.1;
		double mod=a%b;
		System.out.println(mod); //2.1
		
		System.out.println(5%0.0); //NaN
		System.out.println(-5.0%0); //NaN
		
		System.out.println(0%5.0); //0.0
		System.out.println(0%0.0); //NaN
		
		System.out.println(5%0); // 异常
	}
}
OUT:

2.1
NaN
NaN
0.0
NaN
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at FloatTest.main(FloatTest.java:14)
		

Page 75 
开方， 乘方 运算： 借助于 java.lang.Math; 类的工具：

public class MathTest{
	public static void main(String[] args){
		
		double a=3.2;
		double b=Math.pow(a,5);
		System.out.println(b);
		
		double c=Math.sqrt(a);
		System.out.println(c);
		
		double d=Math.random();
		System.out.println(d);
		
		double e=Math.sin(1.57);
		System.out.println(e);
	}
}
OUTPUT:
335.5443200000001
1.7888543819998317
0.6618401323644173
0.9999996829318346
		











