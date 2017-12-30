3 Chaper primitive data type and refer 
Page 49 :
认识变量
变量有2种：
primitive 主数据类型 +  引用；
primitive 主数据类型用来：
	保存基本类型的值，包括证书，Boolean 和浮点数等
	
引用：
	对象引用保存的是对象的引用。//？？？
	
variables must have a type 
variables must have a name 
变量必须拥有类型，必须要有名称；

primitive 主数据类型有不同的大小和名称：
long(64) > int(32) > short(16) > byte(8)
double(64) > float(32)

primitive 主数据类型：
  类型     位数   值域
boolean         true or false 
char     16 bits 0~65535= 2^16-1;
integer 
byte      8 bits -128~127 
short    16 bits -2^16~2^16-1;
int      32 bits -2^32~2^32-1;
long     64 bits -2^64~2^64-1;

浮点数：
float  32 bits  
double 64 bits 

byte b=89;
char c='f';
float f=32.5f;


Page 53 
避开关键字：

1). 名称必须以字母，下划线 or $ 开头，不能用数字开头；
2). 除了第一个字符外， 后面就可以用数字。反正不要用在第一个字符就行
3). 避开Java的保留字

primitive 主数据的保留字：
boolean char byte short int long float double 


Page 54 
对象引用：  圆点运算符
Dog d= new Dog();
d.brak();


Page 55 
对象的声明 创建 与 赋值 3 步骤
1. 声明一个引用变量
Dog myDog= new Dog();
分配空间给引用变量： 命名为 myDog 
次变量 被永远固定成 Dog类型

2. 创建对象
myDog 就是对象

3. 连接对象和引用


Page 57 - 58 
// 看不懂


Page 59 
数组 array
int [] nums = new int[7];


Page 60 
创建 Dog 数组
 Dog [] pets= new Dog[7];
 
pets[0]= new Dog(); //?????
pets[1]=new Dog(); //????


Page 61 
控制 Dog （通过引用变量）
Dog fido= new Dog();
fido.name="Fido";
fido.bark();
fido.chaseCat();

存取Dog数组中的Dog 
Dog[] myDogs= new Dog[3];
myDogs[0]=new Dog();
myDogs[0].name="Fido";
myDogs[0].bark();

//  这里说的不清楚 看下面一部分


Page 62 Dog范例

class Dog{
	
	public void bark(){
		System.out.println(name+" says Ruff");
	}
	
	String name;
	public static void main(String[] args){
		
		Dog dog1= new Dog();
		dog1.bark();
		dog1.name="Bart";
		
		Dog [] myDogs= new Dog[3];
		
		myDogs[0]= new Dog();
		myDogs[1]= new Dog();
		myDogs[2]= new Dog();
		
		myDogs[0].name="Fred";
		myDogs[1].name="Marge";
		
		System.out.println("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		int x=0;
		while(x<myDogs.length){
			myDogs[x].bark();
			x++;
		}
	}
}
		

Page 63 
// 习题
A

class Books{
	String title;
	String author;
}

class BooksTestDrive{
	public static void main(String [] args){
		Books[] myBooks=new Bookes[3];
		int x=0;
		
		// myBooks[0]= new Books();
		//  myBooks[1]= new Books();
		 // myBooks[2]= new Books();
		
		myBooks[0].title="The Grapes of Java";
		myBooks[1].title="The Java Gatsby";
		myBooks[2].title="The Java Cookbook";
		
		myBooks[0].author="bob";
		myBooks[1].author="sue";
		myBooks[2].author="ian";
		
		while(x<3){
			System.out.print(myBooks[x].title);
			System.out.print("bye");
			System.out.println(myBooks[x].author);
			x++;
		}
	}
}


B

class Hobbits{
	String name;
	
	public static void main(String[] args){
		Hobbits[] h=new Hobbits[3];
		
		int z=0;  // z=-1
		
		while(z<4){ //z< h.length
			z++;
			h[z]= new Hobbits();
			h[z].name="Bilbo";
	
			if(z==1)
			{
				h[z].name="frodo";
			}
			if(z==2){
				h[z].name="sam";
			}
			System.out.print(h[z].name+ " is a ");
			System.out.println("good Hobbit name");
		}
	}
}



Page 64 :
OUTPUT:
island=Fiji
island =Cozumel
island=Bermuda
island=Azores

class TestArrays{
	
	public static void main(String[] args){
		String [] islands=new String[4];
		islands[0]="Fiji";
		islands[1] ="Cozumel";
		islands[2]="Bermuda";
		islands[3]="Azores";
		
		int [] index=new int [4];
		index[0]=1;
		index[1]=3;
		index[2]=0;
		index[3]=2;
		
		int y=0;
		
		int ref;
		while(y<4){
			ref=index[y];
			System.out.print("island= ");
			System.out.println(islands[ref]);
			y++;
		}
	}
}

Page 65 
// 不想看


Page 66 
class HeapQuiz{
	int id=0;
	public static void main(String[] args){
		int x=0;
		
		HeapQuiz[] hq=new HeapQuiz[5];
		while(x<3){ // x= 0 ,1, 2 
			hq[x]=new HeapQuiz();
			hq[x].id=x;
			x++;
		}
		
		hq[3]=hq[1];  // h3=h1=1;
		hq[4]=hq[1];  // h4=h1=1;
		hq[3]=null;  //  h3=null
		hq[4]=hq[0];  // h4=0
		hq[0]=hq[3]; // h0=null
		hq[3]=hq[2]; // h3=2;
		hq[2]=hq[0];  // h2=null;
		// h0=null h1=1; h2=null, h3=2; h4=0; 
	}
}
	
	
Page 67:
// 不想看
