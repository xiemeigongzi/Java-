4 Chapter 流程控制与数组

Page 86 
4.1 顺序结构：

4.2 分支结构：

Page 89 
情形1：
public class IfcorrectTest{
	public static void main(String[] args)
	{
		int age=45;
		if(age>60){
			System.out.println("old");
		}
		else if(age>40){
			System.out.println("mid");
		}
		else {
			System.out.println("young");
		}
	}
}
OUT: mid 

情形2：
public class IfcorrectTest{
	public static void main(String[] args)
	{
		int age=45;
		if(age>60){
			System.out.println("old");
		}
		else if(age>40 && !(age>60)){
			System.out.println("mid");
		}
		else if(age>20 && !(age>60) && !(age>40 && !(age>60))){
			System.out.println("young");
		}
	}
}
OUT: mid 



4.2.2 switch statement 
public class SwitchTest{
	public static void main(String[] args)
	{
		char score='C';
		switch(score)
		{
			case 'A':
				System.out.println("excellent");
				break;
				
			case 'B':
				System.out.println("fine");
				break;
				
			case 'C':
				System.out.println("middle");
				break;
				
			case 'D':
				System.out.println("pass");
				break;
				
			case 'F':
				System.out.println("not pass");
				break;
				
			default:
				System.out.println("mistake");
		}
	}
}
OUT:
middle 

Page 92 
Note:
两个值得注意的地方：
1）。 switch 后面的expression表达式的数据只能是：
	byte, short, char, int , 4个整数型，和 枚举型 
2）。 不能省略 case 后代码块的 break；



Page 92 
4.3 循环结构：

4.3.1  while 循环语句
4.3.2	do while
4.3.3   for
	
4.3.3 嵌套循环：

	
4.4 控制循环结构
4.4.1 break

如何结束外层循环：
在 break 后面紧跟一个标签，这个标签用于标识一个外层循环
标签是： “：” 作为标识符， 并且放在循环语句之前才能有用：

public class BreakTest2{
	public static void main(String[] args){
		OUTER:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(i+j);
				if(j==i)
				{
					break OUTER;
				}
			}
		}
	}
}
	

Page 99  
4.4.2 使用continue结束本次循环
public class BreakTest2{
	public static void main(String[] args){
		OUTER:
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("i="+i+" j="+j);
				if(j==i)
				{
					continue OUTER;
				}
			}
		}
	}
}

OUTPUT:
i=0 +j=0
i=1 +j=0
i=1 +j=1
i=2 +j=0
i=2 +j=1
i=2 +j=2
i=3 +j=0
i=3 +j=1
i=3 +j=2
i=4 +j=0
i=4 +j=1
i=4 +j=2


4.4.3 使用return结束方法
return 的功能是结束一个方法

public class ReturnTest{
	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("i="+i);
			if(i==1)
			{
				return;
			}
			System.out.println("continue");
		}
	}
}

OUTPUT:
i=0
continue
i=1


4.5 数组类型：
一旦数组初始化完成， 数组在内存种所占的空间被固定下来，
数组的长度将不会发生变化
即使是把某个数组的数据清空， 数组所占的空间依然被保存， 数组的长度依然不变

所有的数组元素具有相同的类型

4.5.3 数组的初始化：
为数组的数组元素分配内存空间
静态初始化
type[] arrayName = new type[]{element1, element2, ....};
int[] intArr=new int[]{5,6,7};

简化方式：
arrayName = {element1， element2,...}；
 
动态初始化:
动态初始化只能制定数组的长度： 
arrayName= new type[length];

不要同时使用静态初始化 和 动态初始化 
即： 不要再进行数组初始化时， 既指定数组的长度，也为每个数组元素分配初始值


Page 103 

4.5.4 使用数组

4.5.5 for-each 循环结构：

Page 106 
4.6 深入数组
public class ArrayInRam{
	public static void main(String[] args)
	{
		int[] a={5,7,20};
		int[] b=new int[4];
		
		System.out.println("the length of b: "+b.length);
		
		for(int i=0,len=a.length;i<len;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0, len=b.length;i<len;i++)
		{
			System.out.println(b[i]);
		}
		
		b=a;
		System.out.println("the length of b:"+b.length);
	}
}

OUTPUT:
the length of b: 4
5
7
20
0
0
0
0
the length of b:3


Page 110 
4.6.3 引用类型数组的初始化：

class Person{
	public int age;
	public double height;
	
	public void info(){
		System.out.println("my age is: "+age);
		System.out.println("my height is:"+height);
	}
}

public class ReferenceArrayTest{
	
	public static void main(String[] args)
	{
		Person[] students= new Person[2];
		
		Person zhang= new Person();
		zhang.age=15;
		zhang.height=158;
		
		Person lee=new Person();
		lee.age=16;
		lee.height=161;
		
		students[0]=zhang;
		students[1]=lee;
		
		lee.info();
		students[1].info();
	}
}

OUTPUT:
my age is: 16
my height is:161.0
my age is: 16
my height is:161.0

4.6.5 操作数组的工具类：
String toString( type[] a)
经一个数组转换成字符串

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] a= new int[]{3,4,5,6};
		int[] a2= new int[]{3,4,5,6};
		
		System.out.println("a[] equals a2[] ? "+Arrays.equals(a,a2)); //true 
		
		int[] b=Arrays.copyOf(a,6); // 3,4,5,6,0,0 
		System.out.println("do a equals b array ? "+Arrays.equals(a,b)); // false
		System.out.println("b[] element: "+Arrays.toString(b)); //3,4,5,6,0,0 
		Arrays.fill(b,2,4,1); // 原来 b[]={3,4,5,6,0,0} 在 b[2] - b[3] 全部补充 1 -> 3,4,1,1,0,0
		System.out.println("b[] elements are: "+Arrays.toString(b));  // arrays.fill()
		Arrays.sort(b);
		System.out.println("b[] elements are: "+Arrays.toString(b)); // sort: 0,0,1,1,3,4 
	}
}

OUTPUT:
a[] equals a2[] ? true
do a equals b array ? false
b[] element: [3, 4, 5, 6, 0, 0]
b[] elements are: [3, 4, 1, 1, 0, 0]
b[] elements are: [0, 0, 1, 1, 3, 4]

// 我认为数组这部分还是很重要的， 我补充一些内容：

https://introcs.cs.princeton.edu/java/14array/

ArrayExamples:
https://introcs.cs.princeton.edu/java/14array/ArrayExamples.java.html

import java.lang.Object;
public class ArrayExamples{
	public static void main(String[] args)
	{
		int n=6;
		//System.out.println(n);
		
		double[] a= new double [n];
		for(int i=0;i<n;i++)
		{
			a[i]=Math.random();
		}
		System.out.println("a[]");
		System.out.println("--------------------------");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("a= "+a); //important 
		// a= [D@7852e922
		System.out.println();
		
		double max=Double.NEGATIVE_INFINITY;
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("max="+max);
		
		double sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println("average="+(sum/n));

		double b[]= new double[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		
		
		//reverse the order 
		for(int i=0;i<n/2;i++)
		{
			double temp=b[i];
			b[i]=b[n-i-1];
			b[n-1-i]=temp;
		}
		
		System.out.println();
        System.out.println("b[]");
        System.out.println("-------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
        System.out.println();

		
		double dotProduct = 0.0;
        for (int i = 0; i < n; i++) {
            dotProduct += a[i] * b[i];
        }
        System.out.println("dot product of a[] and b[] = " + dotProduct);
    }
}
		
OUTPUT：
a[]
--------------------------
0.2666006865128192
0.00829034933923567
0.8029378012318854
0.20721727616061292
0.020819010791984116
0.9357708764724861

a= [D@7852e922

max=0.9357708764724861
average=0.3736060000848373

b[]
-------------------
0.9357708764724861
0.020819010791984116
0.20721727616061292
0.8029378012318854
0.00829034933923567
0.2666006865128192

dot product of a[] and b[] = 0.8320646781125862
			
/*1. int是java的基本数据类型，"int n"表示定义了一个int 型的变量n;
2. int n = Integer.parseInt(args[0]) 表示给定义的变量n 赋予一个初值为"Integer.parseInt(args[0])";
3. Integer.parseInt(args[0])中，Integer是java中的一个内置类，parseInt()是这个类的一个静态方法，这个方法的作用
是把括号里面的参数（args[0])转为int型的值，比如定义一个String a="123",这时"a"是一个字符串，不能进行数值计算，
如果你要让"a"能进行数值计算，你就可以用Integer.parseInt(a)这个函数把"a"转为int型再来进行数值计算。
	*/
	
Setting array values at compile time. When we have a small number of literal values （文字值）that
 we want to keep in array, we can initialize it by listing the values between curly braces（花括号）
 separated by a comma. 逗号
 For example, we might use the following code in a program that processes playing cards. 	
	
	
	String[] suits={"Clubs","Diamonds","Hearts","Spaces"};
	
	String[] Ranks={"2","3","...","Jack","Acs"};
	
After creating the two arrays, we might use them to print a random card name such as Queen of Clubs, as follows. 

int i=(int) (Math.random()*Ranks.length);
int j=(int) (Math.random()*suits.length);


Setting array values at run time. A more typical situation is when we wish to compute the values to be stored in an array 
For example, we might use the following code to initialize an array of length 52 that represents a deck of playing cards,
 using the arrays RANKS[] and SUITS[] just defined. 


String[] deck= new String[Ranks.length*suits.length];
for(int i=0; i<Ranks.length;i++)
{
	for(int j=0;j<suits.length;j++)
	{
		deck[suits.length*i+j]=Ranks[i]+" of "+suits[j];
	}
}

Shuffling. The following code shuffles our deck of cards: 

int n=deck.length;
for(int i=0;i<n;i++)
{
	int r=i+(int)(Math.random()*(n-i));
	String temp=deck[r];
	deck[r]=deck[i];
	deck[i]=temp;
}

https://introcs.cs.princeton.edu/java/14array/Deck.java.html

public class Deck{
	public static void main(String[] args)
	{
		String[] suits={"Clubs","Diamonds","Hearts","Spades"};
		
		String[] ranks={"2","3","4","5","6","7","8","9","10",
		"Jack","Queen","King","Ace"};
		
		int n=suits.length*ranks.length;
		
		String[] deck= new String[n];
		for(int i=0; i<ranks.length;i++)
		{
			for(int j=0;j<suits.length;j++)
			{
				deck[suits.length*i+j]=ranks[i]+" of "+suits[j];
			}
		}
		
		// shuffle 
		for(int i=0;i<n;i++)
		{
			int r=i+(int)(Math.random()*(n-i));
			String temp=deck[r];
			deck[r]=deck[i];
			deck[i]=temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(deck[i]);
		}
	}
}

OUTPUT:
7 of Diamonds
Queen of Clubs
3 of Spades
Jack of Spades
King of Clubs
4 of Spades
4 of Hearts
Ace of Hearts
7 of Spades
2 of Diamonds
Jack of Clubs
3 of Hearts
3 of Diamonds
5 of Clubs
King of Hearts
8 of Diamonds
6 of Clubs
9 of Hearts
8 of Spades
7 of Clubs
Jack of Hearts
Ace of Clubs
2 of Spades
Queen of Hearts
8 of Hearts
5 of Diamonds
Queen of Diamonds
2 of Clubs
7 of Hearts
3 of Clubs
Jack of Diamonds
Ace of Spades
6 of Hearts
2 of Hearts
10 of Clubs
King of Spades
Ace of Diamonds
9 of Spades
Queen of Spades
5 of Spades
8 of Clubs
4 of Diamonds
9 of Clubs
4 of Clubs
10 of Hearts
6 of Diamonds
10 of Diamonds
10 of Spades
King of Diamonds
9 of Diamonds
6 of Spades
5 of Hearts
		

	
https://www.geeksforgeeks.org/arrays-in-java/

GeekforGeek:

// Array Literal
int[] intArray= new int[]{1,2,3,4,5,6,7,8,9,10};

// LOOP：
不想看

// Array of Objects

class Student 
{
	public int roll;
	public String name;
	
	// 构造函数：
	Student(int roll_no, String name)
	{
		this.roll=roll_no;
		this.name=name;
	}
}

public class GFG
{
	public static void main(String[] args)
	{
		Student[] a=new Student[5];
		
		a[0]= new Student(1,"aman");
		a[1]=new Student(2,"vaibhav");
		a[2]=new Student(3,"shi");
		a[3]=new Student(4,"djsi");
		a[4]=new Student(5,"moh");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element at"+i+": "+a[i].roll+" "+a[i].name);
		}
	}
}
OUTPUT:
Element at 0:1 aman
Element at 1:2 vaibhav
Element at 2:3 shi
Element at 3:4 djsi
Element at 4:5 moh


//Multidimensional Arrays

class MultiDimensional 
{
	public static void main(String[] args)
	{
	int a[][]={{2,7,9},{3,6,1},{7,4,2}};
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
			System.out.print(a[i][j]+" "); //print
			
			System.out.println();
	}
	}
}
	
OUTPUT:
2 7 9 
3 6 1 
7 4 2

// Passing Arrays to Methods 
class Test {
	public static void main(String[] args)
	{
		int a[]={3,1,2,5,4};
		sum(a);
	}
	
	public static void sum(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		
		System.out.println("sum of array values: "+sum);
	}
}
OUTPUT:
sum of array values: 15

//Returning Arrays from Methods

class Test
{
	public static void main(String args[])
	{
		int a[]=m1();

		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	
	public static int[] m1()
	{
		int[] a=new int[]{1,2,3}; // important 
		return a;
		// 和直接 return new int[] {1,2,3};
	}
}

OUTPUT:
1 2 3 


//Class Objects for Arrays

class Test
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		byte b[]= new byte[3];
		short s[]= new short[3];
		
		String[] c=new String[3];
		
		System.out.println(a.getClass());
		System.out.println(a.getClass().getSuperclass());
		System.out.println(b.getClass());
		System.out.println(s.getClass());
		System.out.println(c.getClass());
	}
}

OUTPUT：
class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;

The string "[I" is the run-time type signature for the class object "array with component type int".
The only direct superclass of any array type is java.lang.Object.
The string "[B" is the run-time type signature for the class object "array with component type byte".
The string "[S" is the run-time type signature for the class object "array with component type short".
The string "[L" is the run-time type signature for the class object "array with component type of a Class". 
    The Class name is then followed.


//Cloning of arrays
class Test{
	public static void main(String[] args)
	{
		int a[]={1,2,3};
		int ca[]=a.clone();
		
		System.out.println(a==ca);
		
		for(int i=0;i<ca.length;i++)
		{
			System.out.print(ca[i]+" ");
		}
	}
}

OUTPUT:
false
1 2 3 


class Test{
	public static void main(String[] args)
	{
		int a[][]={{1,2,3},{4,5}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

OUT:
1 2 3 
4 5 

A clone of a multidimensional array (like Object[][]) is
 a "shallow copy" however, which is to say that it creates 
 only a single new array with each element array a reference 
 to an original element array but subarrays are shared.
 
class Test
{
	public static void main(String[] args)
	{
		int a[][]={{1,2,3},{4,5}};
		int ca[][]=a.clone();
		
		System.out.println(a==ca);
		
		System.out.println(a[0]==ca[0]);
		System.out.println(a[1]==ca[1]);
	}
}
OUT:
false
true
true

https://www.geeksforgeeks.org/default-array-values-in-java/

//Default array values in Java
boolean : false
int : 0
double : 0.0
String : null
User Defined Type : null //??? important 

class ArrayDemo 
{
	public static void main(String[] args)
	{
		System.out.println(" String array default values: ");
		String s[]= new String[5];
		for(String str: s)
			System.out.print(str+" ");
		System.out.println();
		
		System.out.println(" Integer array default values: ");
		int n[]= new int[5];
		for(int a: n)
			System.out.print(a+" ");
		System.out.println();
		
		System.out.println(" Double array default values: ");
		double b[]= new double[5];
		for(double d: b)
			System.out.print(d+" ");
		System.out.println();
		
		System.out.println(" Boolean array default values: ");
		boolean bnum[]= new boolean[5];
		for(boolean val: bnum)
			System.out.print(val+" ");
		System.out.println();
		
		System.out.println(" Reference array default values: ");
		ArrayDemo demo[]= new ArrayDemo[5];
		for(ArrayDemo val: demo)
			System.out.print(val+" ");
	}
}
		
OUTPUT:
String array default values: 
null null null null null 

Integer array default values: 
0 0 0 0 0 

Double array default values: 
0.0 0.0 0.0 0.0 0.0 

Boolean array default values: 
false false false false false 

Reference array default values: 
null null null null null 	
		
		
		
//How to compare two arrays in Java?
https://www.geeksforgeeks.org/compare-two-arrays-java/

class Test
{
	public static void main(String[] args)
	{
		int a1[]={1,2,3};
		int a2[]={1,2,3};
		
		if(a1==a2)
			System.out.println("same");
		else 
			System.out.println("Not same");
	}
}
OUTPUT:
Not same


// How to compare array contents?

import java.util.Arrays;

class Test
{
	public static void main(String[] args)
	{
		int a1[]={1,2,3};
		int a2[]={1,2,3};
		
		if(Arrays.equals(a1,a2))
			System.out.println("same");
		else 
			System.out.println("Not same");
	}
}
OUTPUT:
same


// How to Deep compare array contents?
what if the arrays contain arrays inside them or some other 
references which refer to different object but have same 
values. For example,see the following program.

import java.util.Arrays;

class Test
{
	public static void main(String[] args)
	{
		int a1[]={1,2,3};
		int a2[]={1,2,3};
		
		Object[] oa1={a1};
		Object[] oa2={a2};
		
		if(Arrays.equals(oa1,oa2))
			System.out.println("same");
		else 
			System.out.println("Not same");
	}
}
OUTPUT:
Not same

//So Arrays.equals() is not able to do deep comparison. 
//Java provides another method for this Arrays.deepEquals() 
//which does deep comparison.

import java.util.Arrays;

class Test
{
	public static void main(String[] args)
	{
		int a1[]={1,2,3};
		int a2[]={1,2,3};
		
		Object[] oa1={a1};
		Object[] oa2={a2};
		
		if(Arrays.deepEquals(oa1,oa2))
			System.out.println("same");
		else 
			System.out.println("Not same");
	}
}
OUTPUT:
same 

//How does Arrays.deepEquals() work?
import java.util.Arrays;

class Test
{
	public static void main(String[] args)
	{
		int a1[]={1,2,3};
		int a2[]={1,2,3};
		
		Object[] oa1={a1};
		Object[] oa2={a2};
		
		Object[] ta1={oa1};
		Object[] ta2={oa2};
		
		if(Arrays.deepEquals(ta1,ta2))
			System.out.println("same");
		else 
			System.out.println("Not same");
	}
}
OUT:
same



//Final arrays in Java 2.2 
https://www.geeksforgeeks.org/final-arrays-in-java/

Arrays are objects and object variables are always references in Java. 
So, when we declare an object variable as final, it means that
 the variable cannot be changed to refer to anything else.
 For example, the following program 1 
compiles without any error and program fails in compilation.

class Test
{
	public static void main(String[] args)
	{
		final int a[]={1,2,3,4,5}; // important 
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i]*10;
			System.out.println(a[i]);
		}
	}
}
OUTPUT:

10
20
30
40
50

// 1 
class Test{
	int p=2;
	
	public static void main(String[] args)
	{
		final Test t= new Test();
		t.p=30; // t 是对象 
		System.out.println(t.p);
	}
}

OUT: 30 

//2 
class Test{
	int p=2;
	
	public static void main(String[] args)
	{
		final Test t1= new Test();
		Test t2=new Test();
		t1=t2;
		System.out.println(t1.p);
	}
}
OUT:
error: cannot assign a value to final variable t1
//So a final array means that the array variable which is actually a reference to an object, cannot be changed to refer to anything else, 
//but the members of array can be modified.
最后一个数组意味着数组变量实际上是对一个对象的引用，
它不能被修改为引用其他任何东西，
但是数组的成员可以被修改


class  Test{
	public static void main(String[] args)
	{
		final int a1={1,2,3,4,5}; // illegal initializer for int
		int a2={10,20,30,40,50};
		a2=a1;
		a1=a2; // final 的 a1 时不允许其他的对象重写的
		
		
		for(int i=0;i<a2.length;i++)
			System.out.println(a2[i]);
	}
}

final 的意思是： 因为是对象， 所以只能自己对自己重写， 
其他的对象不能对自己重写
数组也是对象


		 
//Jagged Array in Java -1.9  不规则数组
https://www.geeksforgeeks.org/jagged-array-in-java/

class Test 
{
	public static void main(String[] args)
	{
		int a[][]=new int[2][];
		a[0]= new int[3];
		a[1]= new int [2];
		
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=cnt++;
			}
		}
		
		System.out.println("contents of 2D Jagged Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
OUTPUT:
contents of 2D Jagged Array
0 1 2 
3 4 

// Following is another example where i’th row has i columns, i.e., first row has 1 element, second row has two elements and so on.

class Test
{
	public static void main(String[] args)
	{
		
	int r=5;
	int a[][]= new int[r][];
	
	for(int i=0;i<a.length;i++)
		a[i]= new int[i+1]; // 这里不能是 new int[i++]
	// 一定是 new int[i+1];
	
	int cnt=0;
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=cnt++;
			}
		}
		
		System.out.println("contents of 2D Jagged Array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

OUTPUT:
contents of 2D Jagged Array
0 
1 2 
3 4 5 
6 7 8 9 
10 11 12 13 14 

	
//Understanding Array IndexOutofbounds Exception in Java
https://www.geeksforgeeks.org/understanding-array-indexoutofbounds-exception-in-java/

import java.util.ArrayList;
public class NewClass2
{
	public static void main(String[] args)
	{
		ArrayList<String> list= new ArrayList<String>();
		list.add("My");
		list.add(" name");
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}


// Array vs ArrayList in Java
https://www.geeksforgeeks.org/array-vs-arraylist-in-java/

int a[]= new int[10];

ArrayList<Type> a= new ArrayList<Type>();


Differences between Array and ArrayList	:

import java.util.ArrayList;
import java.util.Arrays;

class Test
{
	public static void main(String[] args)
	{
		int[] a=new int[3];
		a[0]=1;
		a[1]=2;
		System.out.println(a[0]);
		
		
		ArrayList<Integer> aL= new ArrayList<Integer>(2);
		aL.add(1);
		aL.add(2);
		System.out.println(aL.get(0));
	}
}

OUTPUT:
1 
1

Array is a fixed size data structure while ArrayList is not. 
One need not to mention the size of Arraylist while creating its object. 
Even if we specify some initial capacity,
we can add more elements.


import java.util.ArrayList;
import java.util.Arrays;
class Test
{
	public static void main(String[] args)
	{
		int a[]= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		
		// Need not to specify size
		ArrayList<Integer> aL= new ArrayList<Integer>();
		aL.add(4);
		aL.add(5);
		aL.add(6);
		aL.add(8);
		
		System.out.println(aL);
		
		System.out.println(Arrays.toString(a)); //important 
	}
}
OUTPUT:
[4, 5, 6, 8]
[1, 2, 3]
		
		
Array can contain both primitive data types as well as 
objects of a class depending on the definition of the array.
 However, ArrayList only supports object entries, not the primitive data types.
Note: When we do arraylist.add(1); : it converts 
the primitive int data type into an Integer object. 
Sample Code:


import java.util.ArrayList;
class Test
{
	public static void main(String[] args)
	{
		int[] a= new int[3];
		
		Test[] a1 = new Test[3];
		
		// allowed in the following 
		ArrayList<Integer> aL1= new ArrayList<>();
		ArrayList<String> aL2= new ArrayList<>();
		ArrayList<Test> aL3= new ArrayList<>();
	}
}

	
ArrayList to Array Conversion in Java : toArray() Methods
https://www.geeksforgeeks.org/arraylist-array-conversion-java-toarray-methods/


Method 1: Using Object[] toArray() method

import java.io.*;
import java.util.List;
import java.util.ArrayList;

class GFG
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
	
		Object[] objects=a.toArray();
		
		for(Object obj: objects)
			System.out.println(obj+" ");
		
	}
}
OUTPUT:
10 20 30 40 

Note: toArray() method returns an array of type 
Object(Object[]). We need to typecast it to 
Integer before using as Integer objects. 
If we do not typecast, we get compilation error.
Consider the following example:

import java.io.*;
import java.util.List;
import java.util.ArrayList;

class GFG
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
	
		Integer[] objects=a.toArray();
		// error: incompatible types: Object[] 
		//cannot be converted to Integer[]
		
		for(Object obj: objects)
			System.out.println(obj+" ");
		
	}
}

Method 2: Using T[] toArray(T[] a)
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class GFG
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
	
		Integer[] b= new Integer[a.size()];
		b=a.toArray(b);
		
		for(Integer x: b)
			System.out.println(x+" ");
		
	}
}
OUTPUT:
10 20 30 40 



Method 3: Manual method to covert ArrayList using get() method
	
import java.io.*;
import java.util.List;
import java.util.ArrayList;

class GFG
{
	public static void main(String[] args)
	{
		List<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Integer[] b=new Integer[a.size()];
		
		for(int i=0;i<a.size();i++)
			b[i]=a.get(i);
		
		for(Integer s:b)
			System.out.print(s+" ");
	}
}
OUTPUT:
10 20 30 40 


Custom ArrayList in Java
https://www.geeksforgeeks.org/custom-arraylist-java/
这个例子 用到了内部类

// Java program to illustrate customArraylist in Java
import java.util.ArrayList;
 
class CustomArrayList
{
    // custom class which has data type
    // class has defined the type of data ArrayList
    // size of input 4
    int n=4;
 
    // the custom datatype class
    class Data
    {
        // global variables of the class
        int roll;
        String name;
        int marks;
        long phone;
 
        // constructor has type of data that is required
        Data(int roll, String name, int marks, long phone)
        {
            // initialize the input variable from main
            // function to the global variable of the class
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }
 
    public static void main(String args[])
    {
        // suppose the custom input data
        int roll[] = {1, 2, 3, 4};
        String name[] = {"Shubham", "Atul", "Ayush", "Rupesh"};
        int marks[] = {100, 99, 93, 94};
        long phone[] = {8762357381L, 8762357382L, 8762357383L,
                        8762357384L
                       };
 
        // Create an object of the class
        CustomArrayList custom = new CustomArrayList();
 
        // and call the function to add the values to the arraylist
        custom.addValues(roll, name, marks, phone);
    }
 
    public void addValues(int roll[], String name[], int marks[],
                          long phone[])
    {
        // local custom arraylist of data type
        // Data having (int, String, int, long) type
        // from the class
        ArrayList<Data> list=new ArrayList<>();
 
        for (int i = 0; i < n; i++)
        {
            // create an object and send values to the
            // constructor to be saved in the Data class
            list.add(new Data(roll[i], name[i], marks[i],
                                              phone[i]));
        }
 
        // after adding values printing the values to test
        // the custom arraylist
        printValues(list);
    }
 
    public void printValues(ArrayList<Data> list)
    {
        // list- the custom arraylist is sent from
        // previous function
 
        for (int i = 0; i < n; i++)
        {
            // the data received from arraylist is of Data type
            // which is custom (int, String, int, long)
            // based on class Data
 
            Data data = list.get(i);
 
            // data variable of type Data has four primitive datatypes
            // roll -int
            // name- String
            // marks- int
            // phone- long
            System.out.println(data.roll+" "+data.name+" "
                               +data.marks+" "+data.phone);
        }
    }
}
	
	













	


