6 Chapter 面向对象（下）

Page 178 

6.1 Java7 增强的包装类：
Java 包含8种 基本数据类型， 但是这8种基本数据类型不支持面向对象编程
也不具有“对象”的特性

为了解决 8 种基本数据类型的变量不能当成 Object类型变量使用的问题， 
Java提供 包装类（Wrapper Class）：
为了 基本数据类型分别定义了相应的引用类型

基本数据类型    包装类     基本数据类型    包装类 
byte         Byte     char         Character 
short        Short    float        Float
int          Integer  double       Double
long         Long     boolean      Boolean 


如何把基本类型转换成对应的包装类型， 把一个字符串包装成  包装类对象

public class Primitive2Wrapper 
{
	public static void main(String[] args)
	{
		boolean bl=true;
		Boolean blObj= new Boolean(bl);
		
		int it=5;
		Integer itObj= new Integer(it);
		
		Float fl=new Float("4.56"); //向包装类的构造器里传入一个字符串参数
		
		Boolean bObj= new Boolean("false"); //向包装类的构造器里传入一个字符串参数
		
		Long lObj= new Long("ddd"); //error ：把ddd 字符串转换成 Long类型变量
	}
}


如果要获得包装类对象中 包装的基本类型变量： 则可以使用包装类提供的 xxxValue() 方法

下面的代码可以拆出包装类对象里的基本数据类型

public class Primitive2Wrapper 
{
	public static void main(String[] args)
	{
		boolean bl=true;
		Boolean blObj= new Boolean(bl);
		
		int it=5;
		Integer itObj= new Integer(it);
		int i=itObj.intValue();
		
		Float fl=new Float("4.56"); //向包装类的构造器里传入一个字符串参数
		float f=fl.floatValue();
		
		Boolean bObj= new Boolean("false"); //向包装类的构造器里传入一个字符串参数
		boolean bb= bObj.booleanValue(); //important 
		
		
		Long lObj= new Long("ddd"); //error ：把ddd 字符串转换成 Long类型变量
	}
}


Page 179 
如果希望获得包装类对象中的 包装的基本类型变量：
则可以使用 包装类提供的 xxxValue() 的实例方法， 如：

public class Primitive2Wrapper 
{
	public static void main(String[] args)
	{
		boolean bl=true;
		Boolean blObj= new Boolean(bl);
		
		
		int it=5;
		Integer itObj= new Integer(it);
		int i=itObj.intValue();
		System.out.println("int i=itObj.intValue() : "+i);
		
		Float fl=new Float("4.56"); //向包装类的构造器里传入一个字符串参数
		float f=fl.floatValue();
		System.out.println("float f=fl.floatValue(): "+f);
		
		Boolean bObj= new Boolean("false"); //向包装类的构造器里传入一个字符串参数
		boolean b=bObj.booleanValue(); 
		System.out.println("Boolean bObj= new Boolean("false"): "+b); //important 
		
		
	//	Long lObj= new Long("ddd"); //error ：把ddd 字符串转换成 Long类型变量
	
	}
}

OUT:
int i=itObj.intValue() : 5
float f=fl.floatValue(): 4.56
boolean b=bObj.booleanValue(): false







自动装箱 Auto Boxing
自动拆箱 Auto Unbox ing
自动装箱 和 自动拆箱 必须要注意 类型匹配

public class AutoBoxingUnboxing 
{
	public static void main(String[] args)
	{
		Integer inObj=5;
		System.out.println(inObj);
		Object boolObj=true;
		
		int it=inObj;
		
		if(boolObj instanceof Boolean)
		{
			boolean b=(Boolean)boolObj; // 小 -- 大 
			System.out.println(b);
		}
	}
}
OUT：
5
true


Page 180 -243

包装类还可以实现 基本类型变量 和 字符串之间的转换
把字符串类型的值 转换为基本类型的值；
两种方式：
1）。 利用包装类 提供的 parseXXX(String s)静态方法（除了Character之外所有的包装类都提供这个方法）
2）。 利用包装类提供的 XXX(String s)构造器

String 类提供了多个重载 valueOf()方法， 用于将基本类型变量转换成字符串

public class Primitive2String
{
	public static void main(String[] args)
	{
		String intStr="123";
		int it1=Integer.parseInt(intStr);
		int it2= new Integer(intStr);
		System.out.println(it2);
		
		String floatStr="4.56";
		float ft1= Float.parseFloat(floatStr);
		float ft2= new Float(floatStr);
		System.out.println(ft2);
		
		String ftStr=String.valueOf(2.345f);
		System.out.println(ftStr);
		
		String dbStr= String.valueOf(3.344);
		System.out.println(dbStr);

		String boolStr= String.valueOf(true);
		System.out.println(boolStr.toUpperCase());
	}
}
OUT:
123
4.56
2.345
3.344
TRUE

把基本类型变量转换成字符串，还有一种方法：
将基本类型变量和 "" 进行连接，系统会自动把基本类型变量转换成字符串
String intStr=5+"";

Integer a= new Integer(6);
System.out.println("6>(5.0): "+(a>5.0));

OUT:
6>(5.0): true


System.out.println("比较两个包装类的实例变量是否相等： "
+(new Interger(2) == new Integer(2)));

OUT:
false 

Integer inta=2;
Integer intb=2;
System.out.println((inta==intb)); //true 

Integer biga=128;
Integer bigb=128;
System.out.println((biga==bigb)); //false over than 127 so error occurs 


Page 182

6.2 处理对象
 
class Person
{
	private String name;
	public Person(String name)
	{
		this.name=name;
	}
	
	public void info()
	{
		System.out.println("the name is: "+name);
	}
}

public class PrintObject
{
	public static void main(String[] args)
	{
		Person p= new Person("Lana Del Rey");
		System.out.println(p); //important 
		System.out.println(p.toString());  //impportant 
	}
}

OUT:
Person@6d06d69c
Person@6d06d69c

也就是说， p 和 p.toString() 的输出结果是一样的

toString() 方法是 Object 类里的一个实例方法，
因此所有的 Java 对象都有 toString() 方法 //

并且， Java 对象都可以和字符串进行连接运算  //importantn 
// 注意： 这里是 对象 和 字符串 的连接 
当 Java 对象和字符串进行连接运算时，
系统自动调用 Java 对象 toString() 方法的返回值和
字符串进行连接运算，

String pStr=p+"";
String pStr=p.toString()+"";

class Person
{
	private String name;
	public Person(String name)
	{
		this.name=name;
	}
	
	public void info()
	{
		System.out.println("the name is: "+name);
	}
}

public class PrintObject
{
	public static void main(String[] args)
	{
		Person p= new Person("Lana Del Rey");
		//System.out.println(p); //important 
		//System.out.println(p.toString());  //impportant 
		String pStr=p+"";
		String pStr1=p.toString()+"";
		System.out.println(pStr);
		System.out.println(pStr1);
	}
}

OUT:
Person@6d06d69c
Person@6d06d69c

Object 类 提供的 toString() 方法总是返回对象实现类 “类名+ @ + hashCode”
如果需要定义类能实现 “自我描述”的功能， 就必须重写 Object 类的 toString 方法


Object 类提供的 toString() 方法总是返回该对象实现类的 “类名+@+hashCode”
要想实现 “自我描述”的功能，必须要重写 Object类的 toString() 方法

Page 183 
class Apple
{
	private String color;
	private double weight;
	
	public Apple(String color, double weight)
	{
		this.color=color;
		this.weight=weight;
	}
	
	public String toString()
	{
		return ("Color: "+color+", weight: "+weight);
		// String toString() 
		// 返回的是： 成员变量的值
		// 但是  System.out.println(对象)； 这里返回的是 自定义的值 
	}
}

public class ToStringTest
{
	public static void main(String[] args)
	{
		Apple a= new Apple("red",5.68);
		System.out.println(a);
	}
}	

OUT:
Color: red, weight: 5.68


class Apple
{
	private String color;
	private double weight;
	
	public Apple()
	{
	}
	
	public Apple(String color, double weight)
	{
		this.color=color;
		this.weight=weight;
	}
	
	public String toString()
	{
		return ("Color: "+color+", weight: "+weight); 
		// String toString() 函数
	}
}

public class ToStringTest
{
	public static void main(String[] args)
	{
		Apple an=new Apple("red",5.68);
		System.out.println(an); // 这里是直接的 对象
	}
}
// 也就是 String toString() 这个方法 自动就能输出 成员变量的 值：

	


public String toString() 
{
	return ...
}



// 补充进阶课程的内容

class Value{
	private int i;
	public void set(int i)
	{
		this.i=i;
	}
	
	public int get(){
		return i;
	}

	public String toString(){
		return ""+i;
	}
	// 任何一个Java类，只要实现了一个 
	// public String toString()  必须完全一样的函数
	就可以直接输出： System.out.println(v); 输出这个v对象
	会 主动调用这个 String toString();
	用toString函数 产生的String ， 直接输出 出来
}

public class A{
	
public static void main(String[] args)
{
	Value v= new Value();
	System.out.println(v); // 
	
	ArrayList<String> a= new ArrayList<String>();
	a.add("first");
	a.add("second");
	a.add("third");
	
		System.out.println(a);
	
	System.out.println("*************");
	
	HashSet<String> s= new HashSet<String>();
	
	s.add("first");
	s.add("second");
	s.add("first");
		
	System.out.println(s);
	}
}

OUTPUT:
[first, second, third]
*************
[first, second]


// again: 

class Value 
{
    private int i;
    
    public Value(int i)
    {
        this.i=i;
    }
	
    public void set(int i)
    {
        this.i=i;
    }
    
    public int get()
    {
        return i;
    }
    
    public String toString()
    {
         return i+" Dala Da Ray" ;
    }
}

public class A
{
    public static void main(String[] args)
    {
        Value a= new Value(6);
        System.out.println(a);
        
    }
}
OUT： 6 Dala Da Ray




Page 183 
6.2.2 == 和 equals() 方法

如果两个变量是基本类型，且都是数值类型（不一定要求数据类型严格相同），
只要两个变量的值相等，就返回 true

两个引用类型的变量，必须指向同一个对象， // 指向同一个对象
== 才返回 true
== 不可以用于比较类型上没有父子关系的两个对象  //??? 


public class EqualTest
{
	public static void main(String[] args)
	{
		int it=65;
		float fl=65.0f;
		System.out.println("it == fl??"+(it==fl));  // true  65==65.0 
		 
		char ch='A';
		System.out.println("it==ch??"+(it==ch)); // true  65='A' : true   
		
		String str1= new String("hello");
		String str2= new String("hello");
		System.out.println("str1==str2??"+(str1==str2)); //false 
		// s1 和 s2 都是引用类型变量，它们分别指向两个通过 new 关键字 创建的 String duixiang 
		System.out.println("str1 equals str2?"+str1.equals(str2)); //true 
		
		System.out.println("hello"==new EqualTest()); //error 
	}
}

OUT:
it == fl??true
it==ch??true
str1==str2??false
str1 equals str2?true	
	    
	

public class EqualTest
{
	public static void main(String[] args)
	{
		int it=65;
		float fl=65.0f;
		
		System.out.println("65==65.0??"+(it==fl));
		
		char ch='A';
		System.out.println("A==65??"+(it==ch));
		
		String s1=new String("hello");
		String s2=new String("hello");
		System.out.println("s1==s2??"+(s1==s2));
		System.out.println("s1 equals s2 ??"+s1.equals(s2));
		
		System.out.println("hello"==new EqualTest()); //error 
	}
}
		
OUT:
65==65.0??true
A==65??true
s1==s2??false
s1 equals s2 ??true

https://www.zhihu.com/question/26872848
值类型（int,char,long,boolean等）都是用==判断相等性。对象引用的话，==判断引用所指的对象是否是同一个。equals是Object的成员函数，有些类会覆盖（override）这个方法，用于判断对象的等价性。例如String类，两个引用所指向的String都是"abc"，但可能出现他们实际对应的对象并不是同一个（和jvm实现方式有关），因此用==判断他们可能不相等，但用equals判断一定是相等的。另一个类似的例子是BigInteger。总体来说要搞清楚，还是需要先理解清楚对象实体和引用之间的关系。



Page 184 
JVM 使用常量池 管理字符串直接量：


public class StringCompareTest
{
	public static void main(String[] args)
	{
		// s1 直接引用常量池中的“CrazyJava”
		String s1="CrazyJava";
		String s2="Crazy";
		String s3="Java";
		
		//s4后面的字符串值可以在编译期就确定下来
		//s4 直接引用常量池中的“CrazyJava”
		String s4="Crazy"+"Java";
		String s5="Cra"+"zy"+"Java";
		
		//s6 后面的字符串值不能在 编译期就确定下来
		//不能引用常量池中的字符串
		String s6=s2+s3;
		
		//使用 new 调用构造器将会创建一个新的 String 对象
		// s7 引用堆内存中 新创建的 String 对象
		String s7=new String("CrazyJava");
		
		System.out.println(s1==s4); // true 
		System.out.println(s1==s5); // true 
		
		System.out.println(s1==s6);  // false 
		
		//
		System.out.println(s1==s7);  //false 
	}
}
// 注意： 这里的单词要连起来， 要不然结果全是 false 
OUT:
true
true
false
false




http://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html
Java中equals和==的区别

java中的数据类型，可分为两类： 
1.基本数据类型，也称原始数据类型。byte,short,char,int,long,float,double,boolean 
  他们之间的比较，应用双等号（==）,比较的是他们的值。
  
2.复合数据类型(类) 
  当他们用（==）进行比较的时候，比较的是他们在内存中的存放地址，
  所以，除非是同一个new出来的对象，他们的比较后的结果为true，
  否则比较后结果为false。
  
 JAVA当中所有的类都是继承于Object这个基类的，在Object中的基类中定义了一个equals的方法，
 这个方法的初始行为是比较对象的内存地 址，
 但在一些类库当中这个方法被覆盖掉了，
 如String,Integer,Date在这些类当中equals有其自身的实现， // 重写 覆盖 
 // String  Integer Data 
 而不再是比较类在堆内存中的存放地址了。
  
  对于复合数据类型之间进行equals比较，在没有覆写equals方法的情况下 // important 
  ，他们之间的比较还是基于他们在内存中的存放位置的地址值的，
  因为Object的equals方法也是用双等号（==）进行比较的，所以比较后的结果跟双等号（==）的结果相同。

  public class TestString {
  public static void main(String[] args) {
 String s1 = "Monday";
 String s2 = "Monday";
 if (s1 == s2)
 {
 System.out.println("s1 == s2");}  // true   
 else{
 System.out.println("s1 != s2");}
}
 }
 
OUT： s1 == s2


public class TestString {
public static void main(String[] args) {
String s1 = "Monday";
String s2 = new String("Monday"); // 包？？
if (s1 == s2)
{System.out.println("s1 == s2");}
else
{System.out.println("s1 != s2");}
if (s1.equals(s2)) {System.out.println("s1 equals s2");}
else{
System.out.println("s1 not equals s2");}
}
}
OUT：
s1 != s2
s1 equals s2
//解释说明：

我们将s2用new操作符创建
程序输出：
s1 != s2
s1 equals s2
说明：s1 s2分别引用了两个"Monday"String对象
//详细解释说明 在以下的网址， 我最后一部分没有看 
http://www.cnblogs.com/zhxhdean/archive/2011/03/25/1995431.html

也就是说， 在String 中， 覆盖了 equals() 的方法， 变成只看内容


书上的解释： 
equals() 方法是 Object类提供的一个实例方法， 因此所有的引用变量都可以调用该方法判断是否
与其他引用变量相等。 
但是这个方法判断两个对象相等的标准与 使用 == 运算符没有区别，
同样要求两个引用变量指向同一个对象才返回 true //important ： 指向同一个对象 == 
因此 Object 类提供的 equals() 方法没有太大的实际意义
所以需要重写 equals() 方法 

重写 equals() 方法 产生 Person 对象和 Dog 对象相等的情形

重写 equals() 方法：

class Person 
{
	public boolean equals(Object obj)
	{
		return true;
	}
}

class Dog{}

public class OverrideEqualsError
{
	public static void main(String[] args)
	{
		Person p= new Person();
		
		System.out.println(p.equals(new Dog()));
		
		System.out.println(p.equals(new String("Hello")));
	}
}
OUT:
true
true
// 重写的 Person类 和 Dog 类 equals() 方法没有任何判断，
无条件返回 true
 

class Person 
{
	public boolean equals(Object obj)
	//在后面往 Object obj 里面放进去 ： p.equals(new Dog());
	// p.equals(new String("Hello"));
	{
		// 不加判断， 总是返回 true ;
		return true;
	}
}

class Dog{}

public class OverrideEqualsError
{
	public static void main(String[] args)
	{
		Person p= new Person();
		System.out.println("Person 对象是否 equals Dog 对象？ "+p.equals(new Dog()));
		
		System.out.println("Person 对象是否 equals Dog 对象？ "+p.equals(new String("Hello")));
	}
}
OUT:
Person 对象是否 equals Dog 对象？ true
Person 对象是否 equals Dog 对象？ true
// 这是 因为 重写 Person 类的 equals() 方法没有任何判断，无条件返回 true



	
Page 186 
重新 重写 equals() 方法：

class Person
{
	private String name;
	private String idStr;
	
	public Person()
	{
	}
	
	public Person(String name, String idStr)
	{
		this.name=name;
		this.idStr=idStr;
	}
	
	//重写 equals() 方法， 提供自定义的相等标准
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		
		if(obj!=null && obj.get)
			
		.
		.
		.
	
实际上， 还是希望两个类型相同的对象才能相等， 必须关键的 field 相等才能相等
以下更加符合实际情况

class Person
{
	private String name;
	private String idStr;
	
	public Person()
	{
	}
	
	public Person(String name, String idStr)
	{
		this.name=name;
		this.idStr=idStr;
	}
	
	// 重写 equals() 方法， 提供自定义相等的标准
	public boolean equals(Object obj)
	{
		// 两个对象 指向同一个对象
		if(this==obj)
			return true;
		
		//obj 不为 null ， 且 它是 Person 类的实例的时候
		if(obj!=null && obj.getClass() ==Person.class)
		{
			Person personObj=(Person)obj;
			
			if(this.getIdStr().)
			
//其余的不想看了 
记住 String 是 有  覆盖的

	
		
		
		
Page 187 
6.3 类成员
 
static 关键字不能修饰构造器， static 修饰的 类成员属于整个类，不属于单个对象
// 是不是 因为使用 构造器的时候， 
static 修饰的方法里， 不能有 this super 出现
// 我记得  this () && super() 出现在 构造器中  
static 函数 只能调用 static 函数 


6.3.1 理解类成员
Java类里只有5种成员：
1）。 Field
2）。 方法
3）。 构造器
4）。 初始化块
5）。 内部类（包括 接口， 枚举）
除了 构造器 ， static 其余的4个都能修饰
static 修饰的成员就是 类成员， 
类成员属于整个类， 而不是单个对象 所以 不能用 static  修饰构造器 constructor

当系统创建 类的对象的时候， 系统不会为 类的Field 再分配内存， // important 
// 也就是说， 类里面 的 static 只有一个地址 只有一个内存地址空间
也不会再次对 类Field 进行初始化， 对象根本不拥有对应类的 类Field

也就是说，
对象实际上 并不拥有 类Field , 类 Field 由该类持有
从结果上看， 同一类的所有实例 Field 共享同一块内存区域

当对象访问类成员的时候， 实际上依然是 委托给该类来访问类成员，
因此即使是某个实例为 null, 它也可以访问它所属于的类的类成员

public class NullAccessStatic
{
	private static void test() // static  
	{
		System.out.println("static 修饰的类方法");
	}
	
	public static void main(String[] args)
	{
		NullAccessStatic nas= null;//  static  
		// important :
		nas.test();
		test(); // 同样是 static 修饰的方法， 可以不经过对象， 直接调用
	}
}

OUT:
static 修饰的类方法
static 修饰的类方法
		

public class NullAccessStatic
{
	private static void test()
	{
		System.out.println("static 修饰的类方法");
	}
	
	public static void main(String[] args)
	{
		NullAccessStatic nas=null; // important 
		// 尽管 nas 指向 null， 但是 nas 作为一个对象 还是可以调用 static 函数的
		nas.test();
	}
}

OUT:
static 修饰的类方法

如果一个 null 对象访问 实例成员（包括 field 和 方法），
将会引发 NullPointerException 异常
因为 null 表明该实例 根本不存在，
既然实例不存在， 它的 field 和 方法也不存在

也就是说，  nas= null;  
nas 这个对象指向 null 这个地址， 这个地址上 不能有任何 的成员变量
nas.test() ： 是这个类的成员函数，只不过 任何一个对象都可以调用。  

还是要注意下， static 不能修饰构造器
// static  不能修饰 构造器 

Page 188 

6.3.2 单例(singleton)类

如果一个类 始终只能创建一个实例 就是 == 成员变量 ， 那么这个类被称为单例类
不允许自由创建该类的对象，只是允许为该类创建一个对象 // important 

把该类的构造器使用 private 修饰，从而把该类的所有构造器隐藏起来
创建该类的对象，需要使用 static 修饰，

根据良好的封装原则：
一旦把该类的构造器隐藏起来， 就需要提供一个 public 方法作为该类的
访问点， 用于创建该类的对象，
且该方法必须使用 static 修饰，（因为调用该方法之前还不存在对象，
因此调用该方法的不可能是对象， 只能是类）

该类还需要一个成员变量来保存曾经创建的对象， 该成员变量需要被上面的静态方法访问
所以该成员变量必须使用 static 修饰


class Singleton
{
	private static Singleton instance; // 成员变量 用 private 封装， static 确定是类变量
	
	private Singleton() {} // 构造器： private 修饰  所以构造器隐藏起来了 
	// 不能用 static 修饰  构造器 

	public static Singleton getInstance() // 用 static 修饰， 是因为不能再创建新的对象
	// 只能靠 类对象来调用， 且 static 只能 调用 static 
	{
		if(instance == null)
		{
			instance = new Singleton(); // 创建一个 Singleton 对象
		}
		return instance;
	}
}
// 上面除了构造函数不是用 static 修饰， 其他的所有 成员变量， 成员变量的访问都是 static 修饰的

public class SingletonTest3
{
	public static void main(String[] args)
	{
		// 不能创建一个新的对象了， 因为这是 单例类， 只有一个 可以靠 类名 调用的 static 成员变量 
		Singleton s1=Singleton.getInstance(); // static 修饰以后， 就是同一个地址了
		// 用 类的名字 调用方法 
		Singleton s2=Singleton.getInstance();
		// 创建 StringLeton 对象不能通过构造器， 
		// 只能通过 getInstance() 方法来得到实例 
		
		System.out.println(s1==s2); // 地址相同 
	}
}
OUT: true 

目的是：
保证 Singleton 类只能产生一个实例， （成员变量）
所以， 在 main() 方法种， 看到的两次产生的Singleton 对象实际上是同一个对象
 

		


class Singleton
{
	private static Singleton instance;
	
//	private Singleton()
//	{
//	}
	
	public static Singleton getInstance()
	{
		if(instance ==null)
		{
			instance= new Singleton();
		}
		return instance;
	}
}

public class SingletonTest
{
	public static void main(String[] args)
	{
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1==s2);
	}
}

// 再次强调： static 不能修饰  构造器 
// static 不能出现 this() super() 



Page 189 
6.4 final 修饰符

final 关键字可以用于 修饰类， 变量和方法，用于表示它修饰的类，方法和变量不可变 // final 修饰：  类 ， 变量 （全局变量， 局部变量 ），  方法 

final 修饰变量的时候， 表示一旦获得了初始值就不可以被改变
final 既可以修饰成员变量， 也可以修饰局部变量， 参数

final 变量获得初始值之后不能被重新赋值， 
      因此final 修饰 成员变量 和 修饰 局部变量 有一定的不同


6.4.1 final 成员变量
// final 的意思是不是： 保持这个数值， 不让这个变量再变了？？？？

当执行静态初始化块的时候， 可以对 类Field （ static field ） 赋初始值；
// static 不能修饰构造器 
当执行普通初始化块， 构造器的时候， 可以对 实例 Field 赋初始值；
也就是说， 
成员变量的初始值 可以再定义的时候 指定默认值， 也可以再初始化块， 构造器中， 指定初始值 

final 修饰的 不同之处： 在于 要在初始的时候 指定初始值

final 修饰的 成员变量 必须由程序员显示地指定初始值
因此：
final 修饰的 类Field 实例 Field ： //static 
// final static int a=6;



static 修饰的 类 filed ： 必须在 静态初始化块中  static {} 或者 声明该 Field 的时候指定初始值 // important： final 没有构造器 
// static 也不能修饰构造器 
实例 field： 必须在 1. 非静态初始化块， 2. 声明该 field 或者 3. 构造器 中指定初始值 // important 

static 并不能修饰构造器：

final 修饰的实例 field , 要么在定义该 1.  field 时候指定初始值， 2. 要么在普通初始化块 
	  或者  3。 构造器为 field 指定初始值
	  
	  注意： 如果 1. 普通初始化块 已经为 某个实例 field 指定了初始值， 
	  则不能再在 2. 构造器 中 为该实例 field 指定初始值；
	  // 如果在刚声明的时候就 指定了初始值， 能不能再在构造器里 再次指定 初始值
	  
final 修饰的 static 修饰的 类field ， 要么在 1. 定义该field时候指定初始值， 要么在 2. 静态初始化块中为该 field 指定了初始值，

实例field 不能在 静态初始化块中指定初始值， 
因为 静态初始化块是静态成员， 不可以访问 实例 field --- 非静态成员；

我有一个疑问： Page 190 这么写的：
类 field 不能在普通初始化块中指定初始值， 因为类field 在类初始化阶段已经被初始化了
普通初始化块 不能对其重新赋值；	  


类 field: 

public class FinalVariableTest
{
	final int a=6; // 实例  
	a=9; //error 
	final String str="hello";  // 实例 
	final int c;  // 实例
	final static double d;  // 类 static 
	//final char ch;
	
	static
	{
		d=5.6;
	}
	
	public FinalVariableTest() // 构造器 
	{
		str="java";  //error  重复 初始化  
		c=5;   // this.c=5; 也可以运行成功
	}
	
	public void changeFinal()
	{
		d=1.2; //error： 在普通方法中， 不能为 static 修饰的 类成员变量 赋值
		ch='a';
	}
	
	public static void main(String[] args)
	{
		FinalVariableTest ft= new FinalVariableTest();
		System.out.println(ft.a); //6
		System.out.println(ft.c); //？？？
		System.out.println(ft.d);  //5.6
	}
}
	
OUTPUT:
6
5
5.6


如果在构造器， 初始化模块中对 final 成员变量进行初始化，
则不要再初始化之前就访问成员变量的值： 如：

public class FinalErrorTest
{
	final int age;
	{
		System.out.println(age);
		/*
		定义了一个final成员变量， age, 系统就不会对 age 成员进行
		隐式地初始化，所以初始化块中上面的代码引起错误
		因为它试图访问一个未初始化的变量，只要把定义 age 时候
		的 final 去掉就正确了；
		*/
		age=6;
		System.out.println(age);
	}
	
	public static void main(String[] args)
	{
		new FinalErrorTest();
	}
}
OUT：
6

也就是说： new 一个 新的类， 直接输出结果？？？

		
	
Page 191 
6.4.2 final 局部变量：

系统不会对局部变量进行初始化，局部变量必须由程序员显示初始化 // important 

public class FinalLocalVariableTest
{
	public void test(final int a)
	// 形参再调用方法时，由系统传入的参数来完成初始化，
	// 因此使用final修饰的形参不能被赋值
	{
		a=5; // error： 不能对 final 修饰的形参赋值， 语句非法
	}
	
	public static void main(String[] args)
	{
		final String str="hello";
		final double d=5.6;
	}
}



Page 192 
6.4.3 final 修饰基本类型变量和引用类型变量的区别

对于引用类型变量而言，它保存的仅仅是一个引用， final只是保证这个引用类型变量所引用的
地址不会改变，即 一直引用同一个对象，但是这个对象完全可以发生变化

class Person
{
	private int age;
	public Person()
	{
	}
	
	public Person (int age)
	{
		this.age=age;
	}
	
	int getAge()
	{
		return age;
	}
	
	void setAge(int age )
	{
		this.age=age;
	}
	
}
	
public class FinalReferenceTest
{
	public static void main(String[] args)
	{
		final int[] iArr={5,6,12,9};  // final 
		System.out.println(Arrays.toString(iArr)); // [5, 6, 12, 9]
		
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		
		iArr[2]=-8;
		System.out.println(Arrays.toString(iArr));
		
		iArr=null; //error  因为对 iArr 重新赋值了 非法
		
		final Person p= new Person(45);
		p.setAge(23);
		System.out.println(p.getAge());
		
		p=null; //error 对 p 重新赋值 非法 
	}
}

OUT:
[5, 6, 12, 9]
[5, 6, 9, 12]
[5, 6, -8, 12]
23	
		

		
Page 192 

6.4.4 可执行“宏替换”的 final 变量

无论是 类field ， 实例 field 还是局部变量，都要满足下面3点：
1）。 使用 final 修饰符修饰
2）。 定义该 final 变量的时候，制定了 初始值
3）。 该初始值可以在编译的时候就被确定下来


public class FinalErrorTest
{
	public static void main(String[] args)
	{
		final int a=5; // final 局部变量
		System.out.println(a);
	}
}

/*
	其实变量 a 根本不存在， 当执行  System.out.println(a)的时候，
	实际上转换成执行 System.out.println(5);
*/




补充内容：
http://blog.csdn.net/zsmj_2011/article/details/8658279

宏定义经常出现在在C/C++代码中，以“#define **” 的形式出现。java中也有“宏变量”，不过是另一种形式。

final是java中的一个关键字，用来修饰类、成员变量、局部变量、方法，表示不可变。当final修饰一个变量时，已经为该变量指定了初始值，那么这个变量在编译时就可以确定下来，那么这个final变量实质上就是一个“宏变量”，编译器会把程序中所有用到该变量的地方替换成该变量的值。

 

如下面一段代码：

[java] view plain copy
String s1="我爱dota";  
String s2="我爱"+"dota";  
System.out.println(s1==s2);   //true
String str1="我爱";  
String str2="dota";  
String s3=str1+str2;  
System.out.println(s1==s3);  //false

第一个输出：true，第二个输出：false
因为java使用常量池来管理曾经使用过的字符串直接量，例如执行string a=“java”；语句后，系统的字符串池中就会缓存一个字符串“java”；
如果程序再次执行string b="java";后系统将会让b直接指向字符串池中的“java”字符串，因此a==b将会返回true；这就是为什么上面代码中第一个输出true。

对于s3，其值由运算得到，str1和str2只是两个普通的变量，编译器不会执行宏替换
因此编译器无法在编译时确定s3的值，也无法将s3 指向字符串池中的缓存，所以第二个输出语句输出false。

要让第二个也输出true，只需让str1和str2变量被final修饰就行了，这样程序中所有str1和str2变量都会被其值替换，在编译前就可以确定s3的值。


当定义 final 变量的时候， 就是为该变量指定了初始值， 
而且该初始值可以在编译的时候就确定下来， 
那么这个 final 变量本质上就是一个 “宏变量”，
编译器会把程序中 所有用到该变量的地方直接替换成 该变量的值；
如：


public class FinalErrorTest
{
	public static void main(String[] args)
	{
		final int a=5; // final 局部变量
		System.out.println(a);
	}
}

/*
	其实变量 a 根本不存在， 当执行  System.out.println(a)的时候，
	实际上转换成执行 System.out.println(5);
*/


Page 193 

如果被赋的 表达式只是基本的算数表达式， 或者是字符串连接运算，
没有访问普通变量， 调用方法， Java 编译器同样会将这种 final 变量当成“宏变量”处理：

public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		final int a=5+2;
		final double b=1.2/3;
		final String str="Crazy"+"Java";
		final String book="CrazyJava: "+99.0;
		
		final String book2="CrazyJava: "+String.valueOf(99.0);
		System.out.println(book=="CrazyJava: 99.0"); //true 
		System.out.println(str+": 99.0"==book); // true 
		System.out.println(book2=="CrazyJava: 99.0"); //false 
	}
}

OUT:
true
true 
false



public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		final int a=5+2;
		final double b=1.2/3;
		final String str="Crazy"+"Java";
        final String str1="CrazyJava";
		final String book="CrazyJava: "+99.0;
		
		final String book2="CrazyJava: "+String.valueOf(99.0);
		System.out.println(book=="CrazyJava: 99.0"); //true 
       	System.out.println(str==str1); 
		System.out.println(str==book);
        
		System.out.println(book2=="CrazyJava: 99.0"); //false 
	}
}

OUT:
true
true
false
false


Page 194 

public class StringJoinTest
{
	public static void main(String[] args)
	{
		String s1="CrazyJava";
		String s2="Crazy"+"Java";
		
		System.out.println(s1==s2); //true
		
		String str1="Crazy";
		String str2="Java";
		String s3=str1+str2;
		System.out.println(s1==s3); //false
	}
}
OUT:

true
false



Page 194 
6.4.5 final  方法
		
		final 修饰的方法不可以被重写， 不希望子类去重写覆盖父类的某些方法， 则使用final 方法。
		
		Java 提供的 Object 类里就有一个 final 方法， getClass(), Java 不希望任何类重写这个方法，
		所以使用final 把 getClass() 这个方法密封起来， 
		
		同时， Object 类提供了 toString() 和 equals() 的方法， 允许子类重写， 因此没有 final 修饰它们
		
		试图重写 final 方法， 将会引发编译错误：
		
		
public  class FinalMethodTest
{
	public final void test() // 在父类中， 不希望子类重写覆盖这个方法 ， 用 final 修饰这个方法 
	{
	}
}
	
class Sub extends FinalMethodTest
	{
		public void test(){}
	}


		
对于一个  private 方法， 因为它仅仅在当前类中可见， 其子类无法访问该方法，
所以子类无法重写该方法 --- 如果子类中 定义一个 与父类 private 方法有相同的方法名，
相同的形参列表，相同的返回值类型的方法， 也不是方法的重写覆盖， 只是重新定义了一个新的方法
因此， 即使 使用 final 修饰一个 private 访问权限的方法， 依然可以在其子类中定义与该方法具有相同的
方法名， 相同的形参列表， 相同的返回值的方法 

public class PrivateFinalMethodTest
{
		private final void test() // private 和 final 一起修饰， 
		// final 修饰的方法 不希望被重写 
}

class Sub extends PrivateFinalMethodTest
{
	public void test(); //  这不是重写覆盖 ，是 重新覆盖了一个新的方法 
}

		
		
	final 修饰的 方法仅仅是不能被重写， 并不是不能被重载 //  important 
	
public class FinalOverLoad
{
	public final void test() {}
	public final void test(String arg){}
}






Page  195 
6.4.7 不可变类：

immutable 不可变类： 创建该类的实例以后， 该实例的 field 是不可改变的


创建自定义的不可变类： 遵守：

1）。 使用 private 和 final 修饰符 来修饰该类的 field  // important 
2）。 提供带参数的构造器， 用于根据传入的参数来初始化类里的 field 
3）。 仅为该类的 field 提供 getter 方法， 不提供 setter 方法， 
	因为 普通的方法 不能修改 final 修饰的 field 。
	// 有问题吧， 是普通的方法 不能修饰 static 修饰的field 
4）。 如果有必要， 重写 Object 类的 hash Code 和 equals 方法。
	equals 方法以关键 field 来作为判断两个对象是否相等的标准， 
	好应该保证两个用 equals 方法判断为相等的对象的 hash Code 也相等
	
如： java.lang.String 这个类：
它是根据 String 对象里的字符序列来作为相等标准， 其 hashCode 方法，
也是根据字符序列计算得到的。
	
public class ImmutableStringTest
{
	public static void main(String[] args)
	{
		String str1= new String("Hello");
		String str2= new String("Hello");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
OUT:
false
true
69609650
69609650	


定义一个  不可变的 address 类， 程序把 address 类的 detail postCode 的
成员变量都使用 private 隐藏起来。 
并使用 final 修饰这两个成员变量， 不允许其他的方法修改这个两个 field 值：

public class Address
{
	private final String detail; // 无法修改 detail 
	private final String postCode; // 无法修改 postCode
	
	public Address()
	{
		this.detail="";
		this.postCode="";
	}
	
	public Address(String detail, String postCode)
	{
		this.detail= detail;
		this.postCode= postCode;
	}
	
	public String getDetail()
	{
		return this.detail;
	}
	
	public String getPostCode()
	{
		return this.postCode;
	}
	
	public boolean equals (Object obj)
	{
		if(this==obj)
		{
			return true;
		}
		
		if(obj!=null && obj.getClass()==Address.class)
		{
			Address ad=(Address)obj;
			
			if(this.getDetail().equals(ad.getDetail())&&
			this.getPostCode().equals(ad.getPostCode())
			{
				return true;
			}
		}
		
		return false;
	}
	
	public int hashCode()
	{
		return detail.hashCode()+postCode.hashCode()*31;
	}
}



当使用 final 修饰引用类型变量的时候， 仅仅表示这个引用类型变量不可以被重新赋值
但是引用类型变量所指向的对象依然可以改变：

下面： 一个不可变的 Person 类， 但是因为 Person 类包含 一个 引用类型的 field， 
且这个引用类是可变的， 所以导致 Person 类也是可变的



class Name 
{
	private String firstName;
	private String lastName;
	
	public Name() {}
	
	public Name(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
}

public class Person 
{
	private final Name name; // private final 修饰不可变类 
	
	public Person (Name name)
	{
		this.name=name;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public static void main(String[] args )
	{
		Name n= new Name("Abel","Batholomew");
		Person p=new Person(n);
		
		System.out.println(p.getName().getFirstName());
		
		n.setFirstName("Maomao");
		System.out.println(p.getName().getFirstName());
	}
}

	
OUT:
Abel
Maomao
	
	
	为了 保护好 Person 对象的引用类型 field ： name , 
	让程序无法访问到 Person 对象的 name field , 也就无法利用 name field 的可变性来改变 Person 对象

改为：

public class Person 
{
	private final Name name;
	
	public Person (Name name)
	{
		this.name= new Name(name.getFirstName(), name.getLastName());
	}
	
	public Name getName()
	{
		return new Name(name.getFirstName(), name.getLastName());
	}
}

	
	
	
	
	
	
	
Page 201 
6.5 抽象类：
抽象方法只有方法的签名， 没有方法实现的方法

6.5.1 抽象方法和抽象类：
抽象方法和抽象类： 必须使用 abstract 修饰符来定义
有抽象方法的类，只能被定义为抽象类， 抽象类里可以没有抽象方法

1）。 抽象类必须使用 abstract 修饰符来修饰， 抽象方法也必须使用 abstract 修饰
    抽象方法不能有方法体；
	// 什么是 方法体？
2）。 抽象类不能实例化，	无法使用 new 关键字来调用 抽象类的构造器来创建
	抽象类的实例， 
	即使是抽象类不包括抽象方法， 这个抽象类也不能创建实例
	
3）。 抽象类{} 里面可以包括有： 1. Field, 2. 方法， 3. 构造器， 4. 初始化块， 5. 内部类， 6. 枚举类
	但是 抽象类的构造器不能创建实例， 主要是用于其子类调用
	//  也就是说， 抽象类 不能创建一个对象 不能 new 
	
4）。 接口的问题。 

定义一个 Shape 的抽象类：
Shape 类里面有两个抽象方法： abstract 修饰，
所以 Shape 只能被定义成抽象类。 
Shape类 里面有初始化块， 也有构造器， 
/ 抽象类里可以 有： 1. Field 2.方法  3. 构造器， 4. 初始化块， 5. 内部类， 6， 枚举类
但是 实际上这些都不是在创建 Shape 对象时候被调用的。
而是创建其子类的实例时候被调用

注意： 
抽象类不能用于创建实例， 只能被当作父类被其他子类继承
// 抽象类 不能 new 实例， 只能被其子类调用


abstract class Shape  // 抽象类
{
	{ // 初始化块
		System.out.println("executing Shape initiation");
	}
	
	protected String color; //Field 
	
	public abstract double calPerimeter(); //抽象方法 ： 子类需要覆盖重写 
	
	public abstract String getType(); //抽象方法 ： 子类需要 覆盖重写 
	
	public Shape() {} //构造函数
	public Shape(String color) //构造函数
	{
		System.out.println("executing Shape constructor");
		this.color=color;
	}
}

 class Triangle extends Shape 
{
	private double a;
	private double b;
	private double c;
	
	public Triangle(String color, double a, double b, double c)
	{ // 构造函数
		super(color); // Shape 里的构造函数
		this.setSides(a,b,c); //调用方法
	}
	
	public void setSides(double a, double b, double c)
	{
		if(a>=(b+c)||b>=(a+c)|| c>=(a+b))
		{
			System.out.println("三角形两边之和大于第三边");
			return ;
		}
		
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double calPerimeter() // 没有 abstract 子类的覆盖重写
	{
		return a+b+c;
	}
	
	public String getType() // 没有 abstract 子类的覆盖重写
	{
		return "triangle";
	}
}


class Circle extends Shape
{
	private double radius;
	
	//构造函数
	public Circle(String color, double radius)
	{
		super(color);
		this.radius=radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double calPerimeter()  //没有 abstract 子类会覆盖重写
	{
		return 2*Math.PI*radius;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getType()  //没有 abstract 子类会覆盖重写 @Override
	{
		return getColor()+": 圆形";
	}
	
	public static void main(String[] args)
	{
		Shape s1=new Triangle("black", 3,4,5); // 父类 s1= new 子类（）；  自动执行 初始化块+ 构造函数 部分
		Shape s2= new Circle("yellow",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}
	
OUT：

executing Shape initiation
executing Shape constructor
executing Shape initiation
executing Shape constructor
triangle
12.0
yellow 圆形
18.84955592153876
	
	
	当使用 abstract 修饰类时候， 表明这个类只能被继承。 // 作为 abstract的类 只能被当作父类 
	当使用 abstract 修饰的是方法的时候，表明这个方法必须由子类提供实现，（就是重写）
	
	final 修饰的类不能被继承，final 修饰的方法不能被重写。
	所以， final 和 abstract 永远不能同时使用
	
	abstract 不能用于修饰 Field , 不能用于修饰局部变量// 目前只看到修饰 方法  类 
	// 那 abstract 能不能修饰 初始化块？？  应该不行吧  
	
	abstract 不能用于修饰构造器， 没有抽象构造器， 抽象类里面的定义的构造器
	只能是普通的构造器
	
	static  和 abstract 不能同时修饰某个方法，没有类抽象方法 
 
	static 没有 super() this();
	
	//abstract 不能修饰 构造器 不能修饰 Field，  不能修饰局部变量
	也就是说， final static 和 abstract 不能一起用  // important 
 
    总的来说， abstract 只能修饰 类 & 方法。
	并且， 有 abstract， 就不能有 final static 包括 static 不能和 this() super() 同时出现，
		因为 static 不呢个修饰构造器。
		
		
 
Page 204 
抽象类的作用：

public abstract class SpeedMeter // 抽象类 
{
	private double turnRate;
	
	public SpeedMeter() // abstract 不能修饰 构造函数 
	{ // abstract 不能修饰 Field 不能修饰 局部变量， 不能修饰构造器
	}
	
	public abstract double getRadius(); //这个需要子类去重写
	
	public void setTurnRate(double turnRate)
	{
		this.turnRate=turnRate;
	}
	
	public double getSpeed()
	{
		// 子类是可以调用父类的函数
		return java.lang.Math.PI*2*getRadius()*turnRate; 
		// 即使 getRadius() 是抽象的， 也是可以在抽象类中用的
		// 这里的 getRadius 的值依赖于 getRadius() 方法的返回值  
	}
}

public class CarSpeedMeter extends SpeedMeter
{
	public double getRadius() // 必须重写覆盖
	{
		return 0.28;
	}
	
	public static void main(String[] args)
	{
		CarSpeedMeter csm= new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}
		
OUT:
26.389378290154266

模板模式的简单规则：
1）。 抽象父类可以只定义需要使用的某些方法， 把不能实现的部分抽象成抽象方法  // important 
	留给其子类去实现；
2）。 父类中可能包含需要调用的其他系列方法的方法， 这些被调用的方法既可以由
	父类实现， 也可以由其子类实现， // important 
	父类里提供的方法只是一个通用算法， 其实现 也许并不完全由自身实现，
	必须依赖于其子类的辅助
	
	
	
	
	
	
	
Page 205 
6.6 更彻底的抽象： 接口： interface 
接口里的所有方法都是 抽象方法 ：
同时， 接口里所有的方法都要覆盖重写


接口里不能包含普通方法， 接口里的所有方法都是 抽象方法； // important 

接口定义了一种规范， 定义了额某一批类所需要i遵守的规范， 
接口不关心这些类的内部状态数据， 也不关系这些类里方法的实现细节，
它只是规定这批类里必须提供某些方法，
提供这些方法的类就可以满足实际的需要

接口是从多个相似类中抽象出来的规范， 接口不提供任何实现。


Page 206 
6.6.2 接口的定义：
定义接口不再使用 class 关键字， 而是使用 interface 关键字。 
// 用 interface 替代 class 

[修饰符] interface 接口名 extends 父接口 1， 父接口 2  ....
{
	零个到多个常量定义...
	零个到多个抽象方法定义...
}

修饰符： public 或者省略， 省略的话 默认是包权限
// 接口只能 extends 接口 但是可以 extends 多个 接口 
一个接口可以有多个直接父类接口， 但是接口只能继承接口， 不能继承类


// Field， 局部变量， 方法， 初始化块， 构造器 ， 枚举类

接口里不能包含 构造器 和 初始化块 的定义，

接口里可以包含 1. Field (只能是常量)， 2. 方法（只能是抽象实例方法）， 
3. 内部类 （包含 内部接口。枚举）定义


接口里定义的是多个类共同的公共行为规范， 因此接口里的所有成员
包括 常量， 方法， 内部类 和 枚举类 都是 public 访问权限

定义接口成员时候， 可以省略访问控制修饰符， 如果指定访问控制修饰符， 则只能用 public  


接口里 常量 Field : 系统自动为 这些 field 增加 static final 这两个修饰符

public static  final 不管你用不用， 系统总是使用这三个修饰符来修饰
接口里没有构造器和初始化块

int MAX_SIZE=50;
public static final int MAX_SIZE=50; 
// 这两行的代码的结果完全一样


接口里的方法， 只能是抽象方法， 系统会自动为 接口里的方法+ abstract 修饰符来修饰，
因为接口里的所有的方法都是抽象方法，所以不允许有静态方法，不可以用 static
// abstract 和 final ， static 不能	出现在一起
// 接口里的所有 方法， 都是 public static  修饰的
// 接口里的 Field， 都是 final static 默认修饰的
  
修饰 接口里的方法
接口里的方法总是使用 public abstract  //这是默认的， 即使没有写出来

package lee;
public interface Output
{
	int MAX_CACHE LINE =50; // 常量 Field  public static final 
	void out(); // public abstract  
	void getData(String msg); //public abstract 
}
// public static final 修饰 即使 另一个类处于不同包下，
也可以通过接口来访问 接口里的常量 Field 

package yeeku; // NOte: 包不同
public class OutputPropertyTest
{
	public static void main(String[] args)
	{
		System.out.println(lee.Output.MAX_CACHE); //直接调用接口里的常量
	}
}

注意： 
处于两个不同的包，  补充final 的内容


Page 207 
6.6.3 接口的继承：
接口完全支持多继承， 
一个接口可以有多个直接父类接口，
子接口得到父接口里 所有的 1. 抽象方法， 2. 常量 Field, 3. 内部类， 4. 枚举类定义
下面的应该是同一个包下的：

interface interfaceA 
{
	int PROP_A=5; // public final static  
	void testA(); //public abstract  
}

interface interfaceB
{
	int PROP_B=6; // public final static  
	void testB(); // public abstract 
}

// 接口C 继承了 接口 A & B 
interface interfaceC extends interfaceA, interfaceB // 接口继承接口： 
{
	int PROP_C=7;
	void testC();
}

public class INterfaceExtendsTest
{
	public static void main(String[] args)
	{
		// 没有发现， 这是直接调用吗， 连对象都没有创建
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PROP_C);
	}
}
OUT:
5
6
7


Page 208 
6.6.4 使用接口

接口不能用于创建 实例， 但是接口可以用于 声明引用类型变量， 
当使用接口来声明引用类型变量时候，这个引用类型变量必须引用到 其 实现类的对象
+ 接口的主要用途就是被实现类  实现

一个类可以实现一个 或者 多个接口， 继承使用 extends 关键字， 实现则使用 implements 关键字。

因为一个类可以实现多个接口， 这也是 Java 为了单继承灵活性不足做的补充

[修饰符] class 类名 extends 父类  implements 接口1 ， 接口2；
{ 
	类体部分
}

一个类实现了一个 或者多个 接口以后， 这个类 必须完全实现 这些接口所定义的全部抽象方法
（也就是重写这些抽象方法）
要不然， 该类将保留从父接口那里集成到的抽象方法，该类也必须定义成分抽象类

//如：


interface Output
{
	int MAX_CACHE_LINE =50; // 常量 Field  public static final 
	void out(); // public abstract  
	void getData(String msg); //public abstract 
}

interface Product 
{
	int getProduceTime(); // field: public static final 
}

public class Printer implements Output, Product
{
	// MAX_CACHE_LINE 是 interface Output 里的一个常量
	// 在这里 ， 直接调用， 连对象都没有创建
	// 但是 interface 里的所有方法都必须重写覆盖，
	//要不然本身的类 也会变成一个抽象的类 
	private String[] printData=new String[MAX_CACHE_LINE];
	
	private int dataNum=0;
	
	public void out()
	{
		while(dataNum>0)
		{
			System.out.println("Print: "+printData[0]);
			
			System.arraycopy(printData,1, printData,0,--dataNum);
		}
	}
	
	public void getData(String msg)
	{
		if(dataNum>=MAX_CACHE_LINE)
		{
			System.out.println("输出队列已满， 添加失败");
		}
		else{
			printData[dataNum++]=msg;
		}
	}
	
	public int getProduceTime()
	{
		return 45;
	}
	
	public static void main(String[] args)
	{
		Output o= new Printer();
		o.getData("Java EE");
		o.getData("CrazyJava NOte");
		o.out();
		
		o.getData("Android Note");
		o.getData("Ajax");
		o.out();
		
		// interface Product 是父接口
		Product p=new Printer();
		// 所有的接口类型的引用变量都可以直接赋给  Object 类型的引用变量
		System.out.println(p.getProduceTime());
		Object obj=p;
	}
}

// public class Printer implements Output, Product
用的是 implements , 不是 extends  
Printer 需要对 Output 和 Product 里面的抽象方法 重写覆盖
我估计 Output 和 Product 的作用就是提醒 Printer 需要写哪些方法
Printer自己去写
但是 用 Printer 类 创建的对象 好像可以直接调用 Output 和 Produce 里的方法 
其实还是调用自己的类里面的方法

// 接口里有的方法有：
// 1. out();
// 2. getData(String msg);
// 3. getProduceTime();

OUT:
Print: Java EE
Print: CrazyJava NOte
Print: Android Note
Print: Ajax
45		
			
	// important 
	
	接口不能显示的继承任何类，但是所有的接口类型的引用变量都可以直接赋给 
Object 类型的引用变量，所以上面的程序把 Product 类型变量直接赋给 Object 类型变量直接赋给
这是 利用 向上转型来实现的。






Page 209 
6.6.5  接口和抽象类：
很像： 都有以下的特征：

这里复习完这章以后再补充： Page 209-210 


Page 6.6.6 面向接口编程：


interface Output
{
	int MAX_CACHE_LINE =50; // 常量 Field  public static final 
	void out(); // public abstract  
	void getData(String msg); //public abstract 
}

public class Computer 
{
	private Output out;
	
	public Computer (Output out)
	{
		this.out=out;
	}
	
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	
	public void print()
	{
		out.out();
	}
}


这块 没有看  ：







	
	
		
Page 214 
6.7 内部类：
内部类的作用：
1）。 内部类提供了更好的封装， 可以把内部类隐藏在外部类里面，不允许同一个包中其他的类访问该类
2）。 内部类成员可以直接访问外部类的私有数据， 因为内部类被当作其外部类成员，
	同一个类的成员之间可以互相访问，但是外部类不能访问内部类的实现细节，如内部类的成员变量
3）。 匿名内部类适合于创建那些仅需要一次使用的类 

6.7.1 非静态内部类
在方法中 也可以定义内部类；
内部类都被作为 成员内部类 来定义， 而不是作为局部内部类。
成员内部类是一种与 1. Field , 2. 方法， 3. 构造器  4. 初始化块相似的类成员，

局部内部类和匿名内部类则不是类成员。

class A{}
public class B{}  
A 和 B  相互独立 

因为内部类作为其外部类的成员，所以可以使用任意访问控制符 private ， protected ， public 等修饰符

public class Cow 
{
	private double weight; // 注意权限： 内部类可以直接访问 外部内的 private 成员 
	public Cow(){}
	
	public Cow(double weight)
	{
		this.weight=weight;
	}
	
	private class CowLeg
	{
		private double length;
		private String color;
		
		public CowLeg() {}
		
		public CowLeg(double length, String color)
		{
			this.length=length;
			this.color= color;
		}
		
		public void setLength(double length)
		{
			this.length=length;
		}
		
		public double getLength()
		{
			return this.length;
		}
		
		public void setColor(String color)
		{
			this.color=color;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		public void info()
		{
			System.out.println("牛腿颜色： "+color+" 高： "+length);
			
			System.out.println("牛重： "+ weight); //// 注意权限： 内部类可以直接访问 外部内的 private 成员 
		}
		
	}
	
	public void test()
	{
		CowLeg c1= new CowLeg(1.12, "黑白相间");
		c1.info();
	}
	
	public static void main(String[] args)
	{
		Cow cow= new Cow(378.9);
		cow.test();
	}
}

OUT:
牛腿颜色： 黑白相间 高： 1.12
牛重： 378.9
		
		
public class Cow 
{
	private double weight; // 非静态类可以直接访问外部类的 private 成员
	
	public Cow()
	{
	}
	
	public Cow(double weight)
	{
		this.weight=weight;
	}
	
	private class CowLeg
	{
		private double length;
		private String color;
		
		public CowLeg()
		{
		}
		
		public CowLeg(double length, String color)
		{
			this.length=length;
			this.color=color;
		}
		
		public void setLength(double length)
		{
			this.length=length;
		}
		
		public double getLength()
		{
			return this.length;
		}
		
		public void setColor(String color)
		{
			this.color=color;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		public void info()
		{
			System.out.println("牛腿颜色： "+color+" 高： "+length);
			
			System.out.println("牛重： "+ weight);
		}
	}
	
	public void test()
	{
		CowLeg c1=new CowLeg(1.12, "黑白相间");
		c1.info();
	}
	
	public static void main(String[] args)
	{
		Cow cow= new Cow(37.8);
		cow.test();
	}
}

OUT:
牛腿颜色： 黑白相间 高： 1.12
牛重： 37.8


在 COw 类 里定义一个 CowLeg 非静态类， 并在 CowLeg 类的实例方法中直接
访问 Cow 的 private 访问权限的 实例 field （weight）

public class Cow
{
	private double weight;
	
	public Cow() {}
	
	public Cow(double weight)
	{
		this.weight=weight;
	}
	
	private class CowLeg
	{
		private double length;
		private String color;
		
		public CowLeg() {}
		
		public CowLeg(double length, String color)
		{
			this.length=length;
			this.color=color;
		}
		
		public void setLength(double length)
		{
			this.length=length;
		}
		
		public double getLength()
		{
			return this.length;
		}
		
		public void setColor(String color)
		{
			this.color=color;
		}
		
		public String getColor()
		{
			return this.color;
		}
		
		public void info()
		{
			System.out.println("color: "+color+", height: "+length);
			System.out.println("weight: "+weight);
		}
	}
	
	public void test()
	{
		CowLeg c1= new CowLeg(1.12,"black-white");
		c1.info();
	}
	
	public static void main(String[] args)
	{
		Cow cow= new Cow(378.9);
		cow.test();
	}
}

OUT:
color: black-white, height: 1.12
weight: 378.9

		
			
Page 216 :
	
	成员内部类（包括静态内部类， 非静态内部类）的 class 文件总是以这种形式：
	OuterClass$InnerClass.class 
	
	在非静态类里面可以直接访问外部类的 private 成员 
	
	如果外部类成员变量， 内部类成员变量 与 内部类里方法的 局部变量同名， 可以
通过 使用 this, 外部类类名.this 来区分限定


public class DiscernVariable
{
	private String prop= "外部类的实例变量";
	
	private class InClass
	{
		private String prop="内部类的实例变量";
		
		public void info()
		{
			String prop="局部变量";
			
			System.out.println("外部类的Field值： "+DiscernVariable.this.prop);
			
			System.out.println("内部类的Field值： "+this.prop);
			
			System.out.println("局部变量的值： "+prop);
		}
	}
	
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}
}

OUT:
外部类的Field值： 外部类的实例变量
内部类的Field值： 内部类的实例变量
局部变量的值： 内部类的实例变量
		
	
	
Page 217 
	
	非静态 内部类 的成员可以访问外部类的 private 成员， 反过来就不能成立。
	
	非静态内部类的成员只在非静态内部类范围内是可知的， 并不能被外部类直接使用，
	
	如果外部类需要访问非静态内部类的成员， 则必须创建非静态内部类对象调用访问其 实例成员
	
	
public class Outer 
{
	private int outProp=9;
	
	class Inner
	{
		private int inProp=5;
		
		public void acessOuterProp()
		{
			System.out.println("外部类的 OutProp："+outProp);
			
		}
	}
	
	public void acessInnerProp()
	{
		System.out.println("内部类的 inProp 值： "+new Inner().inProp);
	}
	
	public static void main(String[] args)
	{
		Outer out= new Outer();
		out.acessInnerProp();
	}
}

OUT:
	内部类的 inProp 值： 5
	
	
	
Page 217 

	静态类成员不能访问非静态成员的规则， 
	外部类的静态方法， 静态代码块， 不能访问非静态内部类， 包括：
	不能使用非静态类内部类 定义变量， 创建实例 。。。
in all, 不允许在外部类的静态成员中直接使用非静态内部类：

public class StaticTest
{
	private  class In{} // 非静态内部类 non-static 
	
	public static void main(String[] args)
	{
		new In(); // 编译异常， main() 方法 是静态的
		// 无法访问 非静态成员 In 类
	}
}


	Java 不允许在  非静态内部类 里定义 静态成员变量：
	
public class InnerNoStatic 
{
	private class InnerClass
	{
		static 
		{
			System.out.println("========");
		}
		
		private static int inProp;
		private static void test(){}
	}
}
/  非静态 内部类里不能有静态的 1. 方法， 静态的 2. Field， 静态的 3. 初始化块



如果外部类成员变量， 内部类成员变量与内部类里方法的局部变量同名，则可以通过使用外部类 
外部类 类名.this.作为限定来区分。

如果外部类成员变量， 内部类成员变量， 与 内部类里方法的局部变量同名，
则可以通过使用 this       外部类类名.this 作为限定来区分。		


public class DiscernVariable
{
	private String prop= "外部类的实例变量";
	private class InClass
	{
		private String prop="内部类的实例变量";
		
		public void info()
		{
			String prop= "局部变量";
			System.out.println("外部类的 Field 值： "+ DiscernVariable.this.prop);
			System.out.println("内部类的Field 值： "+this.prop);
			System.out.println("局部变量的值： "+prop);
		}
	}
	
	public void test()
	{
		InClass in = new InClass();
		in.info();
	}
	
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}
}

OUT:

外部类的 Field 值： 外部类的实例变量
内部类的Field 值： 内部类的实例变量
局部变量的值： 局部变量



public class DiscernVariable
{
	private String prop= "外部类的实例变量";
	
	private class InClass
	{
		private String prop="内部类的实例变量";
		
		public void info()
		{
			String prop="局部变量";
			System.out.println("外部类的Field值： "+ DiscernVariable.this.prop);
			
			System.out.println("内部类的Field值： "+ this.prop);
			
			System.out.println("局部的Field值： "+ prop);
		}
	}
	
	public void test()
	{
		InClass in= new InClass();
		in.info();
	}
	
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}
}

OUT:

外部类的Field值： 外部类的实例变量
内部类的Field值： 内部类的实例变量
局部的Field值： 局部变量		
			
			

非静态内部类的成员可以访问外部类的 private 成员， 反过来不能成立

非静态内部类的成员只能在非静态内部类范围内是 可知的， 并不能被外部类直接使用

如果外部类需要访问非静态内部类的成员， 则必须显示的创建非静态内部类对象来访问其 实例成员，如

外部类如何访问非静态内部类的成员？？？
答： 必须显示创建非静态内部类对象来调用访问其 实力成员： 如：


public class Outer 
{
	private int outProp = 9; 
	
	class Inner
	{
		private int inProp=5;
		
		public void accessOuterProp()
		{
			System.out.println("外部类的 outProp 值： "+outProp);
		}
	}
	
	public void accessInnerProp()
	{
		System.out.println("内部类的 inProp 值： "+ new Inner().inProp);
	}
	
	public static void main(String[] args)
	{
		Outer out=new Outer();
		out.accessInnerProp();
	}
}

OUT:
内部类的 inProp 值： 5




public class Outer 
{
	private int outProp=9;
	
	class Inner
	{
		private int inProp=5;
		
		public void accessOuterProp()
		{
			System.out.println("外部类的 outProp 值： "+ outProp);
		}
	}
	
	public void accessInnerProp()
	{
		System.out.println("内部类的 outProp 值： "+ new Inner().inProp);
	}
	
	public static void main(String[] args)
	{
		Outer out= new Outer();
		out.accessInnerProp();
	}
}
OUT：
内部类的 outProp 值： 5



不允许在外部类的静态成员中直接使用非静态内部类：

不允许在外部类的静态成员中直接使用非静态内部类：

public class StaticTest
{
	private class In{}
	
	public static void main(String[] args)
	{
		new In();
	}
}

public class StaticTest
{
	private class In{}
	
	public static void main(String[] args)
	{
		new In();
	}
}


Java  不允许在非静态内部类里定义静态成员：

public class InnerNoStatic
{
	private class InnerClass
	{
		static 
		{
			System.out.println("=======");
		}
		
		private static int inProp;
		private static void test(){}
	}
}
非静态内部类里不能有 静态方法， 静态Field, 静态初始化块，以上桑格静态申明都error

非静态内部类里不可以有静态初始化块， 但是可以有普通的初始化块；
非静态内部类普通的初始化块的作用 和 外部类初始化块的作用完全相同。 // important  
		
		
		
		
Page 218 
	
6.7.2 静态内部类：
如果用 static 修饰一个内部类，则这个内部类就属于外部类本身，而不属于外部类的某个对象

static 关键字的作用是 把 类的成员变成 类相关， 而不是 实例 相关， 
那么 static  修饰的成员属于整个类， 而不是属于某个对象

外部类的上一级程序单元是包， 所以不可以使用 static 修饰 外部类

而内部类的上一级程序单元是 外部类， 使用 static  修饰可以将内部类变成外部类相关，
而不是 与 外部类的实例相关， 
所以， static 关键字可以不可以修饰 外部类， 但是可以修饰 内部类


public class StaticInnerClassTest
{
	private int prop1=5;  // non-static 
	private static int prop2=9; // static 
	
	static class StaticInnerClass // 静态内部类：
	{
		private static int age; // static  
		
		public void accessOuterProp() // 普通的实例方法， 但是依然不能 
		//不能访问 外部类中的实例变量 prop1 , 但是可以访问 静态的类变量 prop2 
		{
			System.out.println(prop1);
			// 静态内部类无法访问外部类的实例成员  
			
			System.out.println(prop2);
			// 正常 
		}
	}
}

OUT：

	all in all, 	
	静态内部类 可以包含静态成员， 也可以包含非静态成员
	
	静态内部类 不能访问外部类的实例成员， 只能访问外部类的类成员。
	即使是  静态内部类的实例方法也不能访问外部类的实例成员，只能访问外部类的静态成员


外部类依然不能直接访问静态内部类的成员， 但是可以 使用静态内部类的类名作为调用者来
访问静态内部类的类成员	。
也可以使用 静态内部类对象作为调用者来访问静态内部类的实力成员


public class AccessStaticInnerClass
{
	static class StaticInnerClass
	{
		private static int prop1=5;
		private int prop2=9;
	}
	
	public void accessInnerProp()
	{
		System.out.println(prop1); // error : 不能直接访问
		
		System.out.println(StaticInnerClass.prop1); // 内部类名字.类变量名
		
		System.out.println(prop2); //error 
		
		System.out.println(new StaticInnerClass().prop2); 
		// 对于调用 静态内部类里的 普通实例变量， 需要 创建一个 静态内部类的对象来调用
	}
}


		
		
	接口里的 变量都是默认的 public static final 修饰；
	方法是 ： public abstract 修饰；
	
	接口里可以包含 1. Field (只能是常量)， 2. 方法（只能是抽象实例方法）， 
	3. 内部类 （包含 内部接口。枚举）定义

	
	Java还 可以在接口里定义内部类， 接口里定义的 内部类默认 使用的是： public static 修饰
	接口的内部类只能是静态内部类
	



Page 220
6.7.3 使用内部类:

	定义类的主要作用： 定义变量， 创建实例 作为父类被继承
	
	内部类定义变量和创建实例与外部类存在一些差异：

(1) 在外部类的内部使用内部类：
	可以通过内部类类名定义变量，  通过 new 调用内部类构造器创建实例
	区别： 
	不要在外部类的静态成员（包括静态方法和静态初始化块）中使用非静态内部类，
	因为静态成员不能访问非静态成员
	
	
（2） 在外部类以外使用非静态内部类：
	private 修饰的内部类只能在 外部类中使用
	

class Out
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance 
{
	public static void main(String[] args)
	{
		Out.In in= new Out().new In("测试信息");
		
		在外部类以外的地方创建非静态内部类实例 必须 使用外部类实例 
		和 new 来调用 非静态内部类的构造器  
		
		// Out.In in= new Out().new In("测试信息");
		/*
			如何定义 OuterClass.InnerClass 形式的内部变量：
			
			Out.In in;
			Out out=new Out();
			in= out.new In("测试信息")；
		
		*/
	}
}


Out.In in= new Out(). new In("测试信息");
创建一个 非静态内部类的对象， 非静态内部类的构造器必须使用外部类对象来调用 




Page 221 
	创建非静态内部类的子类时， 必须保证让 子类构造器可以调用 非静态内部类的构造器， 
调用非静态内部类的构造器时， 必须存在一个外部对象
如下：  定义了一个子类继承 Out 类的非静态内部类 In类。



class Out
{
	class In
	{
		public In(String msg)
		{
			System.out.println(msg);
		}
	}
}

public class CreateInnerInstance 
{
	public static void main(String[] args)
	{
		Out.In in= new Out().new In("测试信息"); // 构造函数 
		
		在外部类以外的地方创建非静态内部类实例 必须 使用外部类实例 
		和 new 来调用 非静态内部类的构造器  
		
		// Out.In in= new Out().new In("测试信息");
		/*
			如何定义 OuterClass.InnerClass 形式的内部变量：
			
			Out.In in;
			Out out=new Out();
			in= out.new In("测试信息")；
		
		*/
	}
}

public class SubClass extends Out.In
{

	public SubClass(Out out)
	{
		非静态内部类 In 类的构造器必须使用外部类对象来调用，
		super() 代表调用 In 类的构造器， out 代表 外部类对象 
		
		out.super("hello"); // 构造器中有 this() super(); 
	}
}

需要创建一个 SubClass 对象的时候， 先要创建一个 Out 对象， 


（3） 在外部类以外使用静态内部类：
	因为 静态内部类 是 外部类 类相关的， 因此 创建内部类 对象时候无需创建外部类对象
	
	new OuterClass.InnerConstructor()
	
class StaticOut
{
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("静态内部类的构造器");
		}
	}
}

public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in= new StaticOut.StaticIn();
	}
}

不管是 静态内部类 还是 非静态内部类， 它们的声明变量的语法完全一样
区别只是在： 创建内部类对象的时候， 静态内部类只需要使用外部类既可以调用构造器
而非静态内部类必须使用外部类对象来调用构造器


创建静态内部类的子类：
如： 为静态内部类 StaticIn 类定义了一个空的子类：

public class StaticSubClass extends StaticOut.StaticIn{}



Page  223 
6.7.4 局部内部类：

如果把 一个 内部类放在方法里定义， 这个内部类就是一个局部内部类
局部内部类仅仅在方法里有效， 
由于 局部内部类不能再外部类的方法以外的地方使用， 因此局部内部类也不能使用访问
控制符和 static 修饰符修饰：

如果需要局部内部类定义变量， 创建实例或者派生子类， 只能再局部内部类所在的方法内进行

public class LocalInnerClass
{
	public static void main(String[] args)
	{
		class InnerBase 
		{
			int a;
		}
		
		class InnerSub extends InnerBase
		{
			int b;
		}
		
		InnerSub  is = new InnerSub();
		is.a=5;
		is.b=8;
	}
}


























































			