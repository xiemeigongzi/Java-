Head First Java 
1 Chapter basic concept 

import java.util.Scanner;

public class MC {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		int n=in.nextInt();
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
				System.out.println(" ");
			
			for(j=0;j<=i;j++)
				System.out.println("* ");

		}
	}
}


1 Chapter 基本概念

Java 的程序结构：
class ： 类；
source ： 源文件；
method 在 class 里
class 在 source 源文件中；

public： 公开给其他类 存取

源文件：
	public class Hello{ // Hello：类
	
	}
	
类：
	public class Hello{ 
		
		public static void main(String[] args){
		// main： 方法名称 方法=函数	
		}
	}
	
	
编写带有 main() 的类：

创建的源文件： 扩展名： ".java";
类文件： 扩展名： （".class"）; 真正被执行的是类：


public class MyFirstApp{
	
	public static void main(String[] args){
		System.out.println("I rule!");
		System.out.println("The world!");
	}
}

Page： 10;

Page 11:
比较运算符： comparison operator 
< , >  ==;

Page: 12 ;
1). 所有的东西包含在类中； 
2). 一个程序只要一个 main 来作为运行；
3). int x=1;
	while(x){}
	不行，Java 中 integer 和 Boolean 两种类型不相容；
	可以这么做：
	boolean isHot=true;
	while(isHot){}
	

while 循环的范例：
public  class  Loopy{
	public static void main(String[] args){
		int x=1;
		System.out.println("Before the Loop");
		
		while (x<4)
		{
			System.out.println("In the loop");
			System.out.println("value of x is "+x);
			x++;
		}
		
		System.out.println("this is after the loop");
	}
}

OUTPUT:
Before the Loop
In the loop
value of x is 1
In the loop
value of x is 2
In the loop
value of x is 3
this is after the loop



Page: 14 
真正的应用：
public class BeerSong{
	public  static void main (String [] args){
		int beerNum=99;
		String word="bottles";
		
		while(beerNum>0)
		{
			if(beerNum==1)
			{
				word="bottle";
			}
			
			System.out.println(beerNum+" "+word+" of beer on the wall");
			// System.out.println();
			System.out.println("take one down");
			System.out.println("pass it around");
			beerNum--;
			
			if(beerNum>0)
			{
				System.out.println(beerNum+" "+word+" of beer on the wall");
			}
			else {
				System.out.println("No more bottles on the wall");
			}
		}
	}
}


Page : 16 开始编写程序：
// 太长了 不想写


Page: 17 
1). 创建3个String的数组；
	
	String[] pets={"Fido", "zeus", "Bin"};
	
2). 查询数组的长度：
	int x=pets.length;  // x=3;
	
3). 产生随机数：
	random() 这个方法返回 0-1 之间的值
	int x = (int) 24.6; // 取整
	
4). 创建专业的术语： 然后使用“+” 运算符将字符串连接在一起，
	使用索引数字可以将数组中的元素提取出来；
	
	String s=pets[0]; 
	s=s+" "+"is a dog"; 
5). OUTPUT:

Page 18: 
// 太长 不想看


Page 20
// 习题：
OUTPUT：  a-b  c-d 

class Shuffle1{
	
	public static void main(String [] args){
		int x=3;
		while(x>0){
			if(x>2){
				System.out.print("a");
			}
			
			if(x==2){
				System.out.print("b c");
			}
			
			x=x-1;
			System.out.print("-");
			
			if(x==1){
				System.out.print("d");
				x=x-1;
			}
		}
	}
}

OUTPUT:
a-b c-d

			
Page 21 : 
// 练习：
A:
class Exercise1b{
	public static void main(String[] args){
		int x=1;
		while(x<10){
			if(x>3)
				System.out.println("big x");
		}
	}
}

// 什么都没有， 是否加上 循环条件？？

B:
// public  class Hello{
public static void main(String[] args){
	int x=5;
	while(x>1)
	{
		x--;
		if(x<3)
		{
			System.out.println("small x");
		}
	}
}
//}

C:
class Exercise1b{
	// public static void main(String[] args)
	int x=5;
	while(x>1)
	{
		x--;
		if(x<3){
			System.out.println("small x");
		}
	}
}

// "//"后面的部分是我补充的


Page 22 
// 懒得做


Page 23：
// 22 46
// 太长 不想看
class Test{
	public static void main(String[] args){
		int x=0;
		int y=0;
		
		while(x<5){
			
		

		System.out.print(x+""+ y+"");
		x++;		
		}
	}
}



Page  24:
// unfinished 



















