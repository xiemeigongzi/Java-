4 Chaper method operation instance variable
Page 72：

Remember：
类所描述的是  对象 知道什么  和  执行什么；

同一类型的每个对象能够有不通风的方法行为：

Song t2=new Song();
t2.setArtist("Travis");
t2.setTitle("Sing");

Song t3=new Song();
s3.setArtist("Sex Pistols");
s3.setTitle("My Way");


Page 73 
Dog这个类有个 size 的实例变量
bark() 会解决使用什么声音

class Dog{
	int size ;
	String name;
	
	void bark(){
		if(size>60)
			System.out.println("Woof!Woof~");
		else if(size>14)
			System.out.println("Ruff! Ruff!");
		else 
			System.out.println("Yip! Yip!");
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Dog one=new Dog();
		one.size=70;
		Dog two=new Dog();
		two.size=8;
		Dog three=new Dog();
		three.size=35;
		
		one.bark();
		two.bark();
		three.bark();
	}
}
		
		
		
Page 74 
方法的参数：
可以传值给方法：
如上所示：

void bark (int numOfBarks){
	while(numOfBarks>0){
		System.out.println("ruff");
		numOfBarks--;
	}
}

Dog d= new Dog();
d.bark(3);	


Page  75
取得返回值
int giveSecret(){
	return 42;
}

int theSecret = life.giveSecret();
	
		
Page 76 向方法中传入一个以上的参数
void go(){
	TestStuff t=new TestStuff();
	t.takeTwo(12,34);
}

void takeTwo(int x, int y){
	int x=x+y;
	System.out.println("Total is "+x);
}

也可以将变量当作参数传入，只要类型 相符合

void go(){
	int foo=7;
	int bar=3;
	t.takeTwo(foo, bar);
}

void takeTwo(int x, int y){
	int x=x+y;
	System.out.println("Total is "+x);
}



Page  77:
Java 是通过值传递的， 也就是说通过拷贝传递

int x=7; // 声明一个变量 int 类型

void go(int z) {} // 参数是int类型 参数名为z 

foo.go(x);
void go(int z)
// 以x 为参数传入 go() 方法中， x字节组合会被拷贝并且装进z中

在方法中改变z的值，x的值不会改变，传给z 的只是一个拷贝
方法无法改变调用方所传入的参数


Page 78 ： 
方法只能声明单一的返回值，
若要返回多个值，可以装进数组里来返回，
如果混合不同类型的值要返回时，稍后再说

Java并未一定要处理返回值，可以不指派返回值
		
		
	
Page 79 运用参数与返回类型：
class ElectricGuitar {
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;
	
	String getBrand(){
		return brand;
	}
	
	void setBrand(String aBrand){
		brand =aBrand;
	}
	
	int getNumOfPickups(){
		return numOfPickups;
	}
	
	void setNumOfPickups(int num){
		numOfPickups=num;
	}
	
	boolean getRockStarUsesIt(){
		return rockStarUsesIt;
	}
	
	void setRockStarUsesIt(boolean yesOrNo){
		rockStarUsesIt=yesOrNo;
	}
}

get: 返回实例变量的值；
set: 取用一个参数来设定实例变量



Page 80：
封装： Encapsulation：
寻求一种方法强制其他程序必须通过set来设定变量而不是直接存取

		
		
Page 81 ：
保护数据并且还能修改数据：
如何隐藏数据：  使用 公有 和 私有 这两个存取修饰符： access modifier 

封装的基本原则：
将  实例变量 标记为 私有的，并且提供公有的get 和 set 来控制存取动作


Page 82 
封装 GoodDog


class GoodDog{
	
	private int size;
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int s){
		size=s;
	}
	
	void bark(){
		if(size>60){
			System.out.println("Woof!Woof!");
		}
		else if(size>14){
			System.out.println("Ruff! Ruff!");
		}
		else {
			System.out.println("Yop! Yip!");
		}
	}
}

class GoodDogTestDrive{
	
	public static void main(String[] args){
		GoodDog one=new GoodDog();
		one.setSize(70);
		
		GoodDog two=new GoodDog();
		two.setSize(8);
		
		System.out.println("Dog one: "+one.getSize());
		System.out.println("Dog Two: "+two.getSize());
		
		one.bark();
		two.bark();
	}
}


Page 83 
数组中对象的行为：
Dog[] pets=new Dog[7];

创建两个Dog对象并复制为数组的前两项元素：
pets[0]=new Dog();
pets[1]=new Dog();

调用Dog对象的方法：
pets[0].setSize(30);
int x=pets[0].getSize();
pets[1].setSize(8);

		
Page 84 
声明与初始化实例变量：

实例变量在初始化事前的值是什么？

class PoorDog{
	private int size;
	private String name;
	
	public int getSize(){
		return size;
	}
	
	public String getName(){
		return name ;
	}
}

public class PoorDogTestDrive{
	public static void main(String[] args){
		PoorDog one=new PoorDog();
		
		System.out.println("Dog size is "+one.getSize());
		System.out.println("Dog name is "+one.getName());
	}
}

OUTPUT:
Dog size is 0
Dog name is null

无需初始化 实例变量， 因为会有默认值：
数字的primitive （包括char） 	预设为 0 ；
Boolean 预设为 false , 对象引用为null;



Page  85 
实例变量与局域变量之间的差别：

1）。 实例变量是声明在类class里， 而不是方法中
class Horse{
	private double height =15.2;
	private String bread;
	...
}

2）。 局域变量是声明在方法中的
class AddThing{
	int a;
	int b=12;
	
	public int add(){
		int total=a+b;
		return total;
	}
}

3)。 局域变量在使用前必须初始化：
class Foo{
	public void go(){
		int x;
		int z=x+3;
	}
}
// 无法编译 ， x 没有初始化
局域变量美誉默认值！如果在变量被初始前就要使用的话，
编译器就会报错！


Page 86 
变量的比较

使用== 来对比 primitive 主数据类型：
int a=3;
byte b=3;
if(a==b) // true

使用== 来判别俩个个引用是否 都指向同一个对象
尺寸的大小和名字一样 不是相等的 不呢个用== 
意义上相同 用equals()

Foo a=new Foo();
Foo b=new Foo();

Foo c=a;
if(a==b) // false 
if(a==c)  // true 
if(b==c) // false 

使用 == 来比较两个primitive主数据类型，
或者判断两个引用是否 引用同一个对象

使用equals（） 来判断两个对象是否在意义上相等
如： 两个String 对象是否带有相同的字节组合

Page 88 
// 习题：
A

class XCopy{
	public static void main(String[] args){
		int orig=42;
		XCopy x= new XCopy();
		int y=x.go(orig);
		System.out.println(orig+" "+y);
	}
	
	int go(int arg){
		arg=arg*2;
		return arg;
	}
}
OUTPUT:
42 84

B
class Clock{
	String time;
	
	void setTime(String t){
		time=t;
	}
	
	String getTime(){
		return time;
	}
}

class ClockTestDrive{
	public static void main(String[] args){
		Clock c= new Clock();
		 c.setTime("1234");
		 String tod=c.getTime();
		 System.out.println("time: "+tod);
	}
}

OUTPUT:
time: 1234

// 后面的懒得看

一个类可以带有很多个： instance variables, getter, setter, method
一种方法只能带有一个：  return ;
可以被隐含地转换： return argument 
我喜欢 private 的实例变量 encapsulation 
其实就是制作一个拷贝： pass by value 
应该只有setter才能更新：  instance variables
方不可以带很多个： argument
根据定义返回： getter 
不应该以实例变量来运用： public 

可以有很多个参数： method 
被定义成采用一个参数： setter 
帮忙创建封装： getter setter public private 
总是单飞：  return 




		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
