// java语言程序设计入门 MOOC Kai Weng 
//3 1-1 第一个程序
类的名字 第一个字母 一般是 大写的

public static void main(String[] args)

System.out.println("Hello World");

//4 1-2 读输入

import java.util.Scanner;
Scanner in = new Scanner(System.in);
System.out.println(in.nextLine());

in.nextLine(); // 读输入

System.out.println("echo: "+in.nextLine());

System.out.println("2+3="+5);

System.out.println("2+3="+(2+3));

OUTPUT:
2+3=5

System.out.println(2+3+"2+3="+(2+3));
OUTPUT:  5=2+3=5


// 5 1-2 变量
Scanner in = new Scanner(System.in);
System.out.println("100-23="+(100-in.nextInt()));

System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));

输入： 
33
33
100-33=67

int price;
price = in.nextInt();

System.out.println("100-"+price+"="+(100-price));


// 6 1-2 赋值-3 

= 赋值

int price ;
System.out.println(price);
出现错误， 因为 price 没有被初始化

Scanner in = new Scanner(System.in);
int price = in.nextInt(); // 输入 price=23.5
System.out.println(price);

结果出现异常：
Exception in thread "main" java.util.InputMismatchException


Scanner in= new Scanner (System.in);
int price=in.nextInt();
int amount=100;
System.out.println(amount+"-"+price"="+(amount-price));
System.out.println(amount+"-"+price+"="+(amount-price));

12
100-12=88

常量：
final int amount=100;
amount=50; // 不可以这么做

// 
Scanner in = new Scanner (System.in);
System.out.print("请输入票面");
int amount= in.nextInt();
System.out.print("请输入金额");
int price = in.nextInt();
System.out.println(amount+"-"+price+"="+(amount-price));


file： switch workspace other


Scanner in = new Scanner(System.in);
System.out.println("echo:"+in.nextLine());
in.close();



package hello;
import java.util.Scanner;

public class Hello{
	public static void main(String[],args)
	{
		Scanner in = new Scanner(Sysetem.in);
		System.out.printlin("echo:"+in.nextLine());
	}
}


Scanner in = new Scanner(System.in);
Sysetem.out.printlin("100-23="+(100-in.nextInt());


Scanner in=new Scanner(Sysetem.in);
Sysetem.out.printlin("100-23="+(100-in.nextInt());

System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));


Scanner in=new Scanner(System.in);
int price;
price = in.nextInt();
Sysetem.out.printlin("100-"+price"="+(100-price));


Scanner in = new Scanner(System.in);
int price , amount;
price = in.nextInt();
amount= in.nextInt();
Sysetem.out.print(amount+"-"+price+"="+(amount-price));


//7 class  浮点数
(英尺+英寸/12）*0.3048 = 米

int price , amount;
Scanner in = new Scanner (System.in);
price = in.nextInt();
amount = in.nextInt();

Sysetem.out.println(amount-price);


(英尺+英寸/12）*0.3048 = 米

import java.util.Scanner;

Scanner in= new Scanner(System.in);
int foot=in.nextInt();
int inch=in.nextInt();

System.out.println((1.0*foot+1.0*inch/12)*0.3048);

5 7 
1.7018

System.out.println((foot+inch/12.0)*0.3048);


double : 

double foot=in.nextInt();
double inch=in.nextInt();
System.out.println("foot="+foot+", inch= "+inch);

System.out.println((foot+inch/12)*0.3048);

OUTPUT:
5 7 
foot=5.0, inch= 7.0
1.7018


import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner in= new Scanner(System.in);
		int foot=in.nextInt();
		double inch=in.nextDouble();
		System.out.println("foot="+foot+", inch= "+inch);

		System.out.println((foot+inch/12)*0.3048);
	}

}

OUTPUT:
5 7 
foot=5, inch= 7.0
1.7018


浮点运算的精度：
	浮点计算是有误差的：
	System.out.println(1.2-1.1);
	
OUTPUT:
	0.09999999999999987



// 8  优先级 

单目运算符：
int a=10;
int b=-20;
System.out.printlin(a*-b); // a*(-b)

结合关系：
赋值运算 从右往左


// 9 1-2 类型转换 -6
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int foot=in.nextInt();
		double inch=in.nextDouble();
		System.out.println((int)((foot+inch/12)*0.3048*100));
	} // 加了两个括号
}
OUTPUT:
5 7 
170

强制类型转换：
如果想把一个浮点数的小数部分去掉，编程整数：
	(类型)值
	只是从那个变量计算出了一个新的类型的值，它并不改变那个变量，
	无论是值 还是 类型 都不改变；  

int foot=30/3.0; // Type mismatch 
解决方法： int foot= (int) (30/3.0);


// 10 如何交作业， 与我无关 不看


// 11 2-1 比较-1

Scanner in= new Scanner(System.in);
int amount=in.nextInt();
System.out.println(amount);
System.out.println(amount>=10);  // true / false 



//12 2-1 比较-2   关系运算
计算两个值之间的关系， 叫 关系运算：
运算符     意义
 ==
 !=
 >
 >=
 <
 <=
 
优先级：
所有的关系运算符的优先级比算术运算的低，但是比赋值运算 要高
6>1
5==5
7>=3+4  // true 

判断是否相等的 == 和 != 的优先级比其他的低，
而连续的关系运算是从左往右进行的

5>3 == 6>4 //true == true 
6>5>4 // wrong 从左往右 （6>5）is true true 和 >4 不能做换算
a==b==true // a==b is true or false 再和后面的true 做比较
a==b==6 //wrong 
a==b>false //先做 b>false 假设 b 是true or false  也是不能比较大小关系的
(a==b)>false // wrong 

int VS double ?

int a=5;
double b=5.0
System.out.println(a==b);
OUTPUT:
true

double x=1.0;
double y=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
System.out.println(x==y);
System.out.println("x="+x+" y="+y);
System.out.println(Math.abs(a-b)<1e-6);
// a和b 的差的绝对值 是否小于 1e-6

OUTPUT:
false
x=1.0 y=0.9999999999999999
true


//13 2-2 判断-1 
调试 跟踪 运行 Debug F6 : step over 



Scanner in= new Scanner (System.in);
int amount= in.nextInt();

if(amount>=10){
	...
}

if 语句：

	

System.out.println(7>=4+3)  true ;
System.out.println(5=5.0)  true ;
double a=1.0;
double b=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
Sysetem.out.println(Math.abs(a-b)<1e-6);

final int MINOR = 35;
		System.out.print("输入你的年龄");
		Scanner in=new Scanner (System.in);
		int age =in.nextInt();
		System.out.println("你的年纪是："+age);
		
		if(age<MINOR)
		{
			System.out.println("年轻是美好的");
		}
		
		System.out.println("好好珍惜吧！");
		
		
// 14 2-2 判断-2 
final double RATE=8.25;
final int STANDARD=40;

double pay=0.0;
Scanner in= new Scanner(System.in);
System.out.print("Enter the number of hours worked: ");
int hours = in.nextInt();
System.out.println();

	if(hours>STANDARD){
	pay=STANDARD*RATE+(hours-STANDARD)*(RATE*1.5);
	}
	else {
		pay=hours*RATE;
	}
	
	System.out.println("Gross earning: "+pay);
	

// 15 2-2 判断-3  嵌套和级联的判断

		int x;
		int y;
		int z;
		System.out.println("input 3 numbers:");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		int max=0;
		if(x>y)
		{
			if(x>z)
			{
				max=x;
			}
			else {
				max=z;
			}
		}
		else //(x<y)
		{
			if(y<z)
			{
				max=z;
			}
			else {
				max=y;
			}
		}
		System.out.println(max);
		
		}
	}

	
	int x=10; 
		int f;
		if(x>0)
			f=2*x;
		else if(x==0)
			f=0;
		else 
			f=-1;
		
		System.out.println(f);
		
		
		import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int f;
		if(x>0)
			f=2*x;
		else if(x==0)
			f=x;
		else
			f=-1;
		
		System.out.println(f);

	}
}


// 16 2-2 判断-4  判断语句常见问题
1. 忘了大括号
2. if 后面+ ;
3. 使用== or =
4. 代码风格

		// 22 判断5  多路分支
		
		Scanner in=new Scanner (System.in);
		int type=in.nextInt();
		switch(type)
		{
			case 1:
			case 2:
				System.out.println("你好");
				break;
			case 3:
				System.out.println("晚上好！");
				break;
			case 4: 
				System.out.println("bye");
				break;
			default:
				System.out.println("what?");
				break;
		}
		
		
// 3 1 
Scanner in=new Scanner (System.in);
		int balance =0;
		while (true)
		{
			int amount = in.nextInt();
			balance = amount+balance;
			if(balance >=10)
			{
				System.out.println(balance-10);
				balance=0;
			}
		}
		
// 3 2 
Scanner in=new Scanner (System.in);
		int number = in.nextInt();
		int cnt=0;
		while(number>0)
		{
		number=number/10;
		cnt++;
		System.out.println("number="+number+";cnt="+cnt); 
		}
		System.out.println(cnt);
		in.close();
		
		
// 23 3 2 
Scanner in=new Scanner (System.in);
		int number =in.nextInt();
		int cnt=0;
		int sum=0;
		while(number!=-1)
		{
			sum=sum+number;
			cnt++;
			number=in.nextInt();
		}
		if(cnt>0)
		{
		System.out.println("average="+(double)(sum/cnt));
		}
		

// 24 3 -2 猜数字游戏
		
Scanner in=new Scanner (System.in);
		int number =(int) (Math.random()*100+1);// [0-1)-->[1,100]
		int cnt=0;
		int a;
		do
		{
			a=in.nextInt();
			if(a>number)
			{
				System.out.println("bigger");
			}
			else if(a<number)
			{
				System.out.println("smaller");
			}
			cnt++;
		}while(number!=a);
		System.out.println("猜对了，"+cnt+"次");
	}
	
	
	// 25 3-2 循环计算-4  整数分解
	Scanner in=new Scanner (System.in);
		int number =in.nextInt();
		int result=0;
		int cnt=0;
		do {
			int digit =number %10;
			result=result*10+digit;
			number=number/10;
			cnt++;
		}while(number>0);
		System.out.println("猜对了，"+cnt+"次");
		System.out.println("the result="+result);
		
		
		
//  26 4-1 for 循环 
Scanner in=new Scanner (System.in);
int n=in.nextInt();
int factor;
int i;
for(i=1;i<=n;i++)
{
	factor*=i;
}
}

//27 复合赋值
a=a+6  a+=6;
a=b+6; 
a=a-6; a-=6;
a=a*6; a*=6;

a*=b+6; a=a*(b+6);

i=i+1; i++;

i++ i=i+1;

++i  i=i+1
a=6;
a=i++;  // a=6, i=7

a=++i;  //a=7， i=7
 

// 28 4 2  循环控制： 素数 prime 
prime： 定义： 只能被 1 和 自己整除的数， 不包括 1
prime： 2 3 5 7 11 13 17 19 

Scanner in=new Scanner (System.in);
		int n =in.nextInt();
		int isPrime=1;
		int i;
		
		for(i=2;i<n;i++) {
			if(n%i==0)
			{
				isPrime=0;
				break;
			}
		}
		if(isPrime==1)
			System.out.println("n is a prime");
		else 
			System.out.println("n is not a prime");
		
// 29 4 2 -2  多重循环
// 100以内的素数
int n;
		int i;
		for(n=2;n<100;n++)
		{
			int isPrime=1;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=0;
				}
			}
			if(isPrime==1)
				System.out.print(n+"  ");
		}
		
		
int n=2;
		int i;
		int cnt=0;
		while(cnt<=50)
		{
			int isPrime=1;
			for(i=2;i<n;i++)
			{
				if(n%i==0)
					isPrime=0;
			}
			if(isPrime==1) {
				System.out.print(n+" ");
			cnt++;
			}
			n++;
		}	
		
		
Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
					}
				}
			}
		}
		

		Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
						break;
					}
					break;
				}
				break;
			}
		}
		
Scanner in=new Scanner(System.in);
		int amount=in.nextInt();
		int a,b,c;
		int isExit=0;
		OUT: // important 标号
		for(a=0;a<=amount;a++)
		{
			for(b=0;b<=amount/5;b++)
			{
				for(c=0;c<=amount/10;c++)
				{
					if(a+5*b+10*c==amount)
					{
						System.out.println(a+"*1 + "+b+"*5 +"+c+"*10 ="+amount);
						break OUT; // break OUT 的 target
					}
					
				}
			
			}
		}
		
break & continue;
在循环前可以放一个 标号来 标示循环：
	label
用带标号的 break 和 continue 对那个循环起作用

// 30 4-2 循环控制-3 逻辑类型

boolean isPrime = true;
boolean isPrime = false;

逻辑类型：
关系运算的结果是一个逻辑值， true 或者 false ， 
这个值 可以保存在一个对应的逻辑类型的变量中， 这个变量类型是 boolean
!
&& 
||

优先级：
! >  && > ||
!done && (count>MAX)
(!done) && (count>MAX)
   1     3      2  // 优先级关系

优先级：   运算符               结合性
  1       ()                  ->
  2     !+- ++ --             <- (单目的+&-) 
  3      * / %                ->
  4      +   -                ->
  5     < <=  > >=            ->
  6      ==  !=               ->
  7        &&                 ->
  8        ||                 ->
  9     =,+=,-=,*=, /=, %=    <-

  
  
a>b && a>c 
(a>b) && (a>c)

!age>20   (!age)>20



// 31 4-3 循环计算-1  求和 
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
			sum+=1.0/i;
		}
		System.out.println(sum);
		System.out.printf("%.2f",sum); // important 
		
OUTPUT:
100
5.187377517639621
5.19
		
	
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int sign=1;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
			sum+=sign*1.0/i;
			sign=-1*sign;
		}
		System.out.printf("%.2f",sum);
		
		
Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int sign=1;
		double sum=0.0;
		for(i=1;i<=n;i++)
		{
	//		sum+=sign*1.0/i;
	//		sign=-1*sign;
			if(i%2==1)
			{
				sum+=1.0/i;
			}
			else {
				sum+=-1.0/i;
			}
		}
		System.out.printf("%.2f",sum);
		
		
//32 4-3 循环计算-2 最大公约数	
		
Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int gcd=1;
		int i;
		for(i=2;i<=a && i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("a and b max gcd is "+gcd);
		
		
Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int t;
		while(b!=0)
		{
			t=a%b;
			a=b;
			b=t;
		}
		System.out.println("a and b the gcd is "+a);
		

		
// 33 5 1 array
Scanner in = new Scanner(System.in);
int [] numbers = new int[100];
double sum=0;
int cnt=0;
int x=in.nextInt();
while(x!=-1){
	numbers[cnt]=x;
	sum+=x;
	cnt++;
	x=in.nextLint();
}

if(cnt>0){
	double average = sum/cnt;
	System.out.println(average);
	
	for(int i=0;i<cnt;i++)
	{
		if(numbers[i]>average)
		{
			System.out.println(numbers[i]);
		}
	}
}


// 以前的笔记：
Scanner in=new Scanner (System.in);
		int x;
		int [] numbers=new int[100];
		x=in.nextInt();
		int cnt=0;
		double sum=0;
		while(x!=-1)
		{
			numbers[cnt]=x;
			sum+=x;
			cnt++;
			x=in.nextInt();
		}
		if(cnt>0)
		{
			double average=1.0*sum/cnt;
			for(int i=0;i<cnt;i++)
			{
				if(numbers[i]>average)
				{
					System.out.println(numbers[i]);
				}
			}
			System.out.println(sum/cnt);
		}
		
		
// 34 5 1 数组（2） 创建数组
数组：
特点：
其中所有的元素具有相同的数据类型
一旦创建， 不能改变大小

定义数组变量：
<类型> [] <名字> = new <类型>[]
int[] grades= new int[100];
double [] avaerages = new double[20];

元素个数必须是整数；
元素个数必须给出
元素个数可以是变量


// 35 5 1 数组的元素 （3）
for(i=0;i<grade.length;++i)
	sum+=grade[i];

Scanner in = new Scanner(System.in);
int cnt=in.nextInt();
double sum=0;

if(cnt>0){
	int [] numbers = new int[cnt];
	for(int i=0;i<cnt;i++)
	{
		numbers[i]=in.nextInt();
		sum+=numbers[i];
	}
	
	double average= sum/cnt;
	System.out.println(average);
	
	for(i=0;i<cnt;i++)
	{
		if(numbers[i]>average)
		{
			System.out.println(numbers[i]);
		}
	}
	
	

complete code :
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cnt=in.nextInt();
		double sum=0;

		if(cnt>0){
			int [] numbers = new int[cnt];
			for(int i=0;i<cnt;i++)
			{
				numbers[i]=in.nextInt();
				sum+=numbers[i];
			}
			
			double average= sum/cnt;
			System.out.println("average="+average);
			
			for(int j=0;j<cnt;j++)
			{
				if(numbers[j]>average)
				{
					System.out.println(numbers[j]);
				}
			}
		}
	}
}
	

length  // 固有成员
每个数组有一个内部成员 length 告诉元素的数量

更好的形式：
for(int i=0;i<grade.length;i++)
	sum+=grade[i];

grade 是对象， length在 数组里

遍历数组 ： i<grade.length 可扩展性的代码



// 36 5 1 数组 (4)  投票统计
Scanner in=new Scanner(System.in);
		int x;
		int [] numbers =new int [10];
		for(int i=0;i<10;i++)
		{
			numbers[i]=0;
			System.out.print(numbers[i]);
		}
		x=in.nextInt();
		while(x!=-1)
		{
			if(x>=0 &&x<=9)
			{
				numbers[x]++;
			}
			x=in.nextInt();
		}
		
		for(int j=0;j<=numbers.length;++j) // numbers.length 
		{
			System.out.println(j+": "+numbers[j]);
		}
		
		
		
		
import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int x=in.nextInt();
		int a[]= new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=0;
		
		while(x!=-1)
		{
			if(x<=9 && x>=0) {
				a[x]++;
				
			}
			x=in.nextInt();
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		}
		
	}
}


		
// 37 5-2 数组计算-1  数组变量
直接初始化数组：
new 创建的数组会得到默认的值
int[] scores= {87,98,69,54};
System.out.println(scores.length);

数组变量赋值：
int[] a= new int[10];
a[0]=5;
int[] b=a;
b[0]=16;
System.out.println(a[0]);

OUTPUT: 16



Scanner in=new Scanner(System.in);
		int [] scores= {87,98,69,54,65,76,87,99,100,103};
		System.out.println(scores.length);
		int i;
		for(i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
		
		
		Scanner in=new Scanner(System.in);
		int [] a=new int [10];
		a[0]=5;
		int []b=a;
		System.out.println(a[0]);
		b[0]=16;
		System.out.println(b[0]);
		System.out.println(a[0]);
		
OUTPUT: 
5
16
16

int[] a= new int[10];
a 是那个数组的管理者 所以a里面没有数据
普通变量 c=1, c 是所有者 c 拥有这个数据

int[] b=a;
b 是另外一个管理者： 赋值 int[] b=a;是让b去管理a管理的数组
意思是 让两个管理者去 管理同一个数组

		
int []a1= {1,2,3,4,5};
		int []a2=a1;
		int i;
		for(i=0;i<a2.length;i++)
		{
			a2[i]++;
		}
		
		for(i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
OUTPUT: 2 3 4 5 6 		

数组变量：
1）。 数组变量是数组的管理者 而非 数组本身
2）。 数组必须创建出来 然后交给数组变量来管理
3）。 数组变量之间的赋值是 管理权限的赋予
4）。 数组变量之间的比较是判断是否管理同一个数组 ///？？？

int [] a={1,2,3,4,5};
int [] b=a;
System.out.println(a==b);
OUTOUT: true 

int [] a={1,2,3,4,5};
int [] b={2，3，4，5，6};
System.out.println(a==b);
OUTOUT: false
	

int [] a={1,2,3,4,5};
int [] b={1，2,3,4,5};
System.out.println(a==b);
OUTOUT: false
// a 和 b 管理的是 两个不同的数组， 所以 a和b 是不同的 
	
	
复制数组： 遍历的方法

int []a= {1,2,3,4,5};
		int []b=new int[a.length];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

		
int []a= {1,2,3,4,5};
		int []b=new int[a.length];
		int i;
		boolean isEqu=true;
		for(i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<b.length;i++) {
			if(b[i]!=a[i])
				{
				isEqu=false;
				break;
				}
			System.out.println(b[i]);
		}
		System.out.println(isEqu);
		
		
//38 5-2 数组计算 (2) 遍历数组
搜索
Scanner in=new Scanner(System.in);
		int []data= {3,2,5,7,4,9,11,34,12,28};
		int x=in.nextInt();
		int loc=-1;
		int i;
		boolean found =false;
		for(i=0;i<data.length;i++)
		{
			if(x==data[i])
			{
				loc=i;
				break;
			}
		}
		
		for(int j:data)
		{
			System.out.print(j+" ");
		}
		
		for(int k:data)
		{
			if(k==x)
			{
				found=true;
			}
		}
		
		
		if(loc>-1)
		{
			System.out.println(x+":"+loc);
		}
		
只是看 在还是不在 可以这样做：
int[] data= {3,2,5,7,4,9,11,34,12,28};
boolean found = false;

for(int k:data) // 对于data这个数组当中的每一个元素，
				//循环的每一轮将元素拿出作为k 
{
	if(k==x) // 不知道 k 是中的几个
	{        // for-each 循环 不能用来做 赋值
		found =true;
	}
}
k=data[0];
k=data[1];
.
.
.

FOR-EACH 循环
for(<类型> <变量> : <数组>)
		
//39 5-2 数组计算(3) 素数
// 这个重点看 important

改进版本：
去掉偶数后，从3到x-1，每次+2

if(x==1 || x%2==0 && x!=2)
{
	isPrime=false;
}
else {
	for(int i=3;i<x;i+=2)
	{
		if(x%i==0)
		{
			isPrime=false;
			break;
		}
	}
}


// 还有更快的方法：
for(int i=3;i<Math.sqrt(x);i+=2)
{
	if(x%i==0)
	{
		isPrime=false;
		break;
	}
}


// 构造素数表
	Scanner in=new Scanner(System.in);
		int []primes=new int[50];
		primes[0]=2;
		int cnt=1;
		MAINLOOP:
		for(int x=3;cnt<50;x++)
		{
			for(int i=0;i<cnt;i++)
			{
				if(x%primes[i]==0)
				{
					continue MAINLOOP;
				}
			}
			primes[cnt++]=x;
		}
		
		for(int k :primes)
		{
			System.out.print(k+" ");
		}
		

Scanner in = new Scanner(System.in);
boolean[] isPrime =new boolean[100];
for(int i=0;i<isPrime.length;i++)
		isPrime[i]=true;
	
for(int i=2; i<isPrime.length;i++)
{
	if(isPrime[i])
	{
		for(int k=2; i*k<isPrime.length;k++)
		{
			isPrime[i*k]=false;
		}
	}
}

for(int i=2; i<isPrime.length;i++)
{
	if(isPrime[i])
	{
		System.out.println(i);
	}
}




import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// create a prime table with 50 numbers 
		Scanner in = new Scanner(System.in);
		boolean[] isPrime =new boolean[100];
		for(int i=0;i<isPrime.length;i++)
				isPrime[i]=true;
			
		for(int i=2; i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				for(int k=2; i*k<isPrime.length;k++)
				{
					isPrime[i*k]=false;
				}
			}
		}

		for(int i=2; i<isPrime.length;i++)
		{
			if(isPrime[i])
			{
				System.out.print(i+" ");
			}
		}
		
	}
}

OUTPUT:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 


	
		
		

// 我自己写了一个C的
// 50 prime numbers;
#include <stdio.h>
int main()
{
	int i,j;
	int n=50;
	int a[n];
	int cnt=0;
	for(i=2;cnt<n;i++)
	{
		int isPrime=1;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				isPrime=0;
			}
		}
		
		if(isPrime==1)
		{
			a[cnt]=i;
			cnt++;
		}
	}
	
	for(i=0;i<n;i++)
	{
		printf("a[%d] =%d \n",i,a[i]);
	}
	return 0;
 } 
 
39 的剩余部分没有看 不想看

40 也不想看
补充：
二维数组的遍历：

for(i=0;i<3;i++)
{
	for(j=0;j<5;j++)
	{
		a[i][j]=i*j;
	}
}
a[i][j] 是一个 int 
表示 第i行第j列的单元
a[i,j] 不存在


int[][]a={
	{1,2,3,4},
	{1,2,3},
}
2行4列
井字棋 不想看


// 41-42 6-1 使用对象 字符类型 
字符类型：
单个的字符是一种特殊的类型： char
	用单引号表示的字符字面量： ‘a’，‘1’
	
Scanner in=new Scanner(System.in);
		char c='A';
		char d=(char)(c+'a'-'A');
		System.out.println(d);
		System.out.println('A'>'a');
OUTPUT:
a
false

字符计算：
char c='A';
c++;
System.out.println(c);

int i='Z'-'A';
System.out.println(i);

OUTPUT:
B
25

大小写转换
char c='A';
char d=(char)(c+'a'-'A');
char e=(char)(d+'A'-'a');
System.out.println(d);
System.out.println(e);
OUTPUT:
a
A

字符大小：
字符是可以比较大小的， 依据的是 在 Unicode表中的编号
'0'->'9'
'A'->'Z'
'a'->'z'
'Z'<'a'

System.out.println('A'>'B'); // false 
System.out.println('a'>'A');  // true 


逃逸字符
用来表达无法打印出来的控制字符 或者 特殊字符， 
它由一个反斜杠 “\” 后面跟上另外一个字符，
这两个字符组合起来，组成一个字符

\b: 
\n:
\r:



// 43 6-1 使用对象 字符类型 （3）
4种基础类型的数据： 对应 4 种 包裹类型

System.out.println(Integer.MAX_VALUE);


4个字节=32 bite 
-2^31 - 0 - 2^31

包裹类型：
	基础类型       包裹类型：
	boolean:     Boolean
	char         Character 
	int 		 Integer 
	double 		 Double 

	包裹类型和基础类型都是类型 都可以定义变量
	可以有， 也可以有：
	
	int i=10;
	Integer k=10;
	k=i; // 这样也是可以的
	
	
Integer.MAX_VALUE ; //important 这是包裹类型的作用

包裹类型的用处：
	获得该类型的最大值 和 最小值：
	Integer.MIN_VALUE;
	Integer.MAX_VALUE;
	
.运算符：
当需要让一个类 或者 对象做事情的时候， 用运算符：
a.length;
Integer.MAX_VALUE;

System.out.println(Character.isLowerCase('I'));
System.out.println(Character.toLowerCase('I')); // 转成小写


Charater 
static boolean isDigit(char ch)
判断这个字符是不是数字

static boolean isLetter(char ch)

static boolean isLetterOrDigit(char ch)

static boolean isLowerCase(char ch)

static boolean isUpperCase(char ch)

static boolean isWhitespace(char ch)
判断这个字符是不是空格

static boolean toLowerCase(char ch)
把这个字符转成小写

static boolean toUpperCase (char ch)
把这个字符转成大写

char ch='1';
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isDigit('a'));
		
	
// 44 6-2 使用对象 字符串 （1）
字符串变量：
String s;
String 是一个类， String的变量是对象的管理者而非所有者；
	就像数组变量是数组的管理者 而非 所有者一样
	
	new = 创建 String 对象
String s= new String("a string");

初始化字符串变量：
String a="hello";

	
String s=new String ("a string");
		String a=new String("hello");
		System.out.println(s+" "+a);
		
字符串连接：
用 + 号 可以连接两个字符串：
"hello" +"world" ->"helloworld"		

当+ 号的一边是字符串 另外一边不是字符串的时候：
会将另一边表达为字符串然后做连接：
"I am"+18 -> "I am 18"
1+2+"age" ->"3age"
"age" +1+2 -> "age12"

		
String s=new String("hello");
		System.out.println(s+12+24);
		
Output： 
hello1224

输入字符串：
in.next(); 读入一个单词， 单词的标志是空格；
空格 including space， tab enter 
in.nextLine(); 读入一整行

Scanner in=new Scanner(System.in);
		String s;
		s=in.nextLine();// in.nextLine
		System.out.println(s);
		
		String a=in.next();
		System.out.println(a);
		

对象变量的赋值：
String a;
String b=a;
			
		
比较两个string
if(input=="bye")
{
	
}

if(input.equals("bye"))
{
	
}

Scanner in= new Scanner(System.in);
String s=in.next();
System.out.println(s=="bye");

OUTPUT:
bye
false

Scanner in=new Scanner (System.in);
		String s=in.nextLine();
		System.out.println(s);
		System.out.println(s.equals("bye")); //important 

要想比较两个字符串的内容是否相等：
不能用== 要用 .equals("...");
用== 是说 s1 和 s2 是不是同一个东西；
.equals() 是比较 s1 和 s2 的内容是不是一样的

		
// 45 6-2 适用对象 字符串-(2)
字符串操作：
1）。 字符串是对象， 对它的所有的操作都是通过 . 这个运算符来进行的
	字符串.操作
2）。 它表示对 . 左边的这个字符串做右边的那个操作
3）。 这里的字符串可以是变量也可以是常量

Strings 大小的比较：
s1.compareTo(s2);
s1>s2 : 负值
s1==s2: 0 
s1>s2: 正值
compareToIgnoreCase(): 可以不区分大小写来比较大小

Scanner in = new Scanner(System.in);
		String s1="abc";
		String s2="abb";  // 因为 c> b
		System.out.println(s1.compareTo(s2)); //important
		
Output:1 

		
String s1="abc";
		String s2="abcd";
		System.out.println(s1.compareTo(s2));
	
Output:-1 


String s2="abcd"; // 常量比较
		System.out.println("abcd".compareTo(s2));
		
Output：0；

获得 String 的长度
用 length()函数：
String name="Hellola", //7
str1="one",  // 3
str2="", // 0
str3; // error

访问String里的字符：
s.charAt(index); // 位置从 0 开始 计数的
返回index上的单个字符；
index的范围是： 0到length()-1;
第一个字符的index是0，和数组一样
不能用for-each 循环来遍历字符串

String s1="abc";
for(int i=0; i<s1.length(); i++)
	System.out.print(s1.charAt(i)+" ");
OUTPUT:  a b c 
// 后半部分 不想看了


Integer K；
int []data=new int [20];
for(int k: data) 遍历一个数组


Scanner in=new Scanner (System.in);
		String s1="abc";
		System.out.println(s1.charAt(1));
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+" ");
		}
		
得到子串：
s.substring(n)
	得到从n 号位置到末尾的全部内容；
	
s.substring(b,e)
	得到从b号位置到e号位置之间的内容
	
Scanner in=new Scanner(System.in);
		String s1="0123456789";
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 4));
OUTPUT： 23456789
        23
		
寻找字符：
s.indexOf(c);
	得到c字符所在的位置，-1表示不存在；
	
s.indexOf(c,n)
	从n号开始寻找c字符；
	
s.indexOf(t);
	找到字符串t所在的位置；
	
从右边开始找：
s.lastIndexOf(c);

s.lastIndexOf(c,n);

s.lastIndexOf(t);

其他String操作：
s.startsWith(t) // 是不是以另外一个子字符串开头的；

s.endsWith(t) //是不是以另外一个子字符串结尾的；

s.trim() //把字符串两端的空格删掉；

s.replace(c1,c2) // 把字符串中所有的 c1 全部换成 c2

s.toLowerCase() //把字符串中所有的字符换成大写字符

s.toUpperCase() //

这些操作都不会改变字符串自己
Scanner in=new Scanner(System.in);
		String s1="0123A4567893"; // double 3 
		int loc=s1.indexOf('3');
		System.out.println(s1.indexOf('3',loc));
		System.out.println(s1.indexOf('3',loc+1));
		System.out.println(s1.indexOf('4'));
		System.out.println(s1.indexOf('A'));
		System.out.println(s1.indexOf('C'));
		System.out.println(s1.indexOf("A456"));
		
		
		
Scanner in=new Scanner (System.in);
		String s1="abcd";
		s1.toUpperCase();
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);

Output: 
abcd
ABCD

在switch-case 中使用字符串：

switch (s)
{
	case "this": ....break;
	case "that":....break;
}

// 46 6 2 (3)
Math :
abs //绝对值
pow // pow(a,b) a的b次方 = a^b;
random // 随机数： 0-1 
round //四舍五入

Scanner in=new Scanner (System.in);
		System.out.println(Math.abs(-12)); // 12
		System.out.println(Math.round(10.345));  // 10
		System.out.println(Math.round(10.745));  // 11
		System.out.println(Math.random()); // 随机数
		System.out.println(Math.random()*100);
		System.out.println(Math.pow(2, 3.2));
		
		
// 47 7 1 (1)
// 函数的定义和调用
对象的操作： .
String s="hello";
int i=s.length();
System.out.println(s+" bye");
这些都是对象在执行函数



求素数：
public static boolean isPrime(int i)
{
	boolean isPrime = true;
		
		for(int k=2;k<i;k++)
		{
			if(i%k==0)
			{
				isPrime=false;
				break;	
			}				
		}
		return isPrime;
}

public static void main(String[]args){
	
Scanner in=new Scanner(System.in);
int m=in.nextInt();
int n=in.nextInt();

	if(m==1) 
		m=2;
	
	int cnt=0;
	int sum=0;
	for(int i=m;i<=n;i++)
	{
		
		if(isPrime(i)){
			cnt++;
			sum+=i;
		}
	}
	System.out.println(cnt);
}

// compete code :
// get the prime numbers between n & m;
import java.util.Scanner;

public class Hello {
	
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
			
			for(int k=2;k<i;k++)
			{
				if(i%k==0)
				{
					isPrime=false;
					break;	
				}				
			}
			return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();

			if(m==1) 
				m=2;
			
			int cnt=0;
			int sum=0;
			for(int i=m;i<=n;i++)
			{
				
				if(isPrime(i)){
					cnt++;
					sum+=i;
					System.out.println(i);
				}
			}
			System.out.println(cnt);
	}
}

// 求 1 -10 20-30 35-45 的和
// done by myself 
import java.util.Scanner;

public class obtainSum {
	
	public static int sumNumber(int m, int n){
		int i;
		int sum=0;
		for(i=m;i<=n;i++)
			sum+=i;
		
		return sum;
	}
	
	public static void main(String[] args){

		int sum1;
		sum1=sumNUmber(1,10);
		System.out.println(sum1);
		
		int sum2=sumNUmber(20,30);
		System.out.println(sum2);
		
		int sum3=sumNUmber(35,45);
		System.out.println(sum3);
	}
}

		
// standard 
import java.util.Scanner;

public class Main(){
	
	public static void sum(int a, int b){
		int i, s=0;
		for(i=a;i<=b;i++)
			s+=i;
		
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Scanner in=new Scanner (System.in);
		int i;
		int sum;
		sum(1,10);
		sum(10,20);
		sum(35,45);
	}
}

		
// 48 调用函数 7 1 （2）
（ ）： 圆括号 起到了 表示函数调用的作用
没有参数也需要（ ）；
如果有参数： 需要给出正确的数量和顺序

从函数中 返回值：

public static int max(int a, int b)
{
	int ret;
	if(a>b)
		ret=a;
	else 
		ret=b;
	
	return ret;
}
多个出口 ， 是不好的设计 
单一出口比较好

传过去的是什么？

import java.util.Scanner;

public class Repeat {
	
	public static void swap(int a, int b)
	{
		int t;
		t=a;
		a=b;
		b=t;
	}

	public static void main(String[] args) {
		 int a=5;
		 int b=6;
		 swap(a,b);
		 System.out.println("a="+a+" , b="+b);
		
	}
}
OUTPUT：
a=5 , b=6

Java语言在调用函数的时候， 永远只能传值给函数

传值：
每个函数都有自己的变量空间， 参数也位于这个独立的空间中，
和其他的函数没有关系

当参数的类型是数组或者 字符串  或者 对象的时候？？？？

public static void main(String[] args)
{
	int a=5;
	int b=6;
	int c;
	c=max(10,12);
	c=max(a,b);
	c=max(a,23);
	c=max(c,23);
	
	c=max(max(c,a),max(5,b));
	System.out.println(max(a,b));
	max(12,23);
}

	
// 49 7 2 （1） 参数传递
调用函数：
传递数量正确  ， 类型正确的值

类型不匹配：
当函数期望的参数类型比 调用函数给的值的类型宽的时候，
编译器能悄悄替你把类型转换好
char-> int->double    // 这样是可以的
但是 把 double 给 char  是不行的
boolean 和 int  是不能相互转化的

char  int  double  


	
import java.util.Scanner;
public class Swap{

public static void swap(int a, int b)
{
	int t;
	t=a;
	a=b;
	b=t;
}

public static void main(String[] args)
{
	int a=5;
	int b=6;
	swap(a,b);
	System.out.println(a+" "+b);
}
}
OUTPUT:
a=5, b=6

		
// 50 7 2 (2) 本地变量
函数的每次运行， 就产生一个独立的变量空间，在这个空间中的变量， 
是函数的这次运行所独有的， 称为本地变量

定义在函数内部的变量 就是本地变量

参数也是本地变量
import java.util.Scanner;

public class Repeat {
	
	public static void sum(int a, int b)
	{
		int i;
		int sum=0;
		for(i=a;i<=b;i++)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);
	}

	public static int factor(int i)
	{
		if(i==1)
			return i;
		return i*factor(i-1);
	}
	
	public static void main(String[] args) {
		int k=factor(3);
		System.out.println(k);
		
	}
}

for(int i;...;...) 
for(int i;...;...) // 这样是可以的 


变量的生存期和作用域： 大括号内
 
public static int factor (int i)
{
	if(i==1)
		return i;
	else 
		return i*factor(i-1);
}

public class Main(){
	
	public static int factor(int i)
	{
		if(i==1)
			return i;
		else 
			return i*factor(i-1);
	}
	
	public static void main(String[] args)
	{
		int k=factor(3);
		System.out.println(k);
	}
}

本地变量的规则：
本地变量是定义在块内的
	它可以是定义在函数的块内
	它也可以是定义在语句的块内
	甚至可以遂安拉一对大括号来定义变量
	
程序运行进入这个块以前，其中的变量不存在
离开这个块，其中的变量就消失了



		






















