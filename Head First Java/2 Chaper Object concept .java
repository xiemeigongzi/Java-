2 Chaper Object concept 

Page: 34 
设计类时， 对象是靠着 类 的模型塑造出来的
对象是已知的事物
对象是会执行的操作

对象本身已知的事物被称为：  实例变量（instance variable）

对象可以执行的动作成为： 方法 method 

对象带有 实例变量 和 方法， 是设计类中的一部分


Page： 35 
类 和 对象 两者之间 有什么不同？
类 创建模型


Page： 36 
创建第一个对象
运用对象：
需要两个类： 
1）。 要被操作于对象的类
2）。 用来测试该类的类


圆点运算符： "."
//建立对象：
Dog d=new Dog();

// 通过操作和调用：
d.bark();

// 通过操作数存取属性：
d.size=40;

1). 编写类
class Dog{
	int size; // 实例变量
	String bread;  // 实例变量
	String name; // 实例变量
	
	void bark(){ // 方法
		System.out.println("Ruff! Ruff!");
	}
}

2). 编写测试用的类：
	class DogTestDrive{
		public static void main(String[] args){
			// 测试码
		}
	}

3). 在测试用的类中建立对象并存取对象的变量和方法：

class DogTestDrive{
	public static void main(String[] args)
	{
		Dog d=new Dog(); // 建立对象：
		d.size=40; // 存取该对象的变量
		d.bark(); // 调用方法
	}
}

Page 37 ：
创建与测试Movie对象

class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.println("Playing the movie");
	}
}

public class MovieTestDrive{
	public static void main(String[] args){
		Movie one= new Movie();
		one.title="Gone with the Stock";
		one.genre="Tragic";
		one.rating=-2;
		
		Movie two=new Movie();
		two.title="Lost in Cubicle space";
		two.genre="Comedy";
		two.rating=5;
		two.playIt();
		
		Movie three=new Movie();
		three.title="Byte Club";
		three.genre="Tragic but ultimately uplifting";
		three.rating=127;
	}
}


Page  38-40:
main() 用途：
1）。 测试真正的类
2）。 启动 Java 程序

public class Player{
	int number=0;
	
	public void guess(){
		number=(int)(Math.random()*10);
		System.out.println("I am guessing "+number);
	}
}

public class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		
		boolean p1isRight=false;
		boolean p2isRight=false;
		boolean p3isRight=false;
		
		int targetNumber=(int)(Math.random()*10);
		System.out.println("I am thinking of a number between 0 and 9...");
		
		while(true){
			System.out.println("Number to guess is "+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("Player one guessed "+guessp1);
			
			guessp1=p2.number;
			System.out.println("Player two guessed "+guessp2);
			
			guessp1=p3.number;
			System.out.println("Player three guessed "+guessp3);
			
			if(guessp1==targetNumber){
				p1isRight=true;
			}
			
			if(guessp2==targetNumber){
				p2isRight=true;
			}
			
			if(guessp3==targetNumber){
				p3isRight=true;
			}
			
			if(p1isRight || p2isRight ||p3isRight){
				System.out.println("we have a winner!");
				System.out.println("Player one got it right? "+p1isRight);
				System.out.println("Player two got it right? "+p2isRight);
				System.out.println("Player three got it right? "+p3isRight);
				System.out.println("Game is over");
				break;
			}
			else {
				System.out.println("Players will have to try again.");
			}
		}
	}
}

public class GameLaucher{
	public static void main(String[] args){
		GuessGame game= new GuessGame();
		game.startGame();
	}
}

OUTPUT:
I am thinking of a number between 0 and 9...
Number to guess is 5
I am guessing 8
I am guessing 2
I am guessing 6
Player one guessed 8
Player two guessed 0
Player three guessed 0
Players will have to try again.
Number to guess is 5
I am guessing 5
I am guessing 7
I am guessing 5
Player one guessed 5
Player two guessed 0
Player three guessed 0
we have a winner!
Player one got it right? true
Player two got it right? false
Player three got it right? false
Game is over
			
			
Page 41:
任何变量只要加上 public static 和 final ， 
基本上都会编程全局变量取用的常数




Page 42：
//习题：
A

class TapeDeck{
	boolean canRecord=false;
	
	void playType() {
		System.out.println("tape playing");
	}
	
	void recordType(){
		System.out.println("tape recording");
	}
}

class TapeDeckTestDrive{
	TapeDeck t=new TapeDeck(); // supplementary 
	public static void main(String[] args)
	{
		t.canRecord=true;
		t.playType();
		
		if(t.canRecord==true)
			t.recordType();
	}
}
	
//B
class DVDPlayer{
	boolean canRecord=false;
	
	void recordDVD() {
		System.out.println("DVD recording");
	}
	
	// 补充
	void playDVD(){
		System.out.println("DVD Playing");
	}
}

class DVDPlayerTestDrive{
	public static void main(String[] args)
	{
		DVDPlayer d=new DVDPlayer();
		d.canRecord=true;
		d.playDVD(); // 这是哪来的？
		
		if(d.canRecord==true){
			d.recordDVD();
		}
	}
}


Page 43:
OUTPUT： 
bang bang ba-bang 
ding ding da-ding 

class DrumKit{
	
	boolean topHat=true;
	boolean snare=true;
	
	void playSnare(){
		System.out.println("bang bang ba-bang");
	}
	
	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
}


Class DrumKitTestDrive{
	
	public static void main(String [] args){
		DrumKit d=new DrumKit();
		d.playSnare();
		d.playTopHat();
		
		d.snare=false;
		
		if(d.snare==true){
			d.playSnare();
		}
	}
}

OUTPUT:
bang bang ba-bang
ding ding da-ding


Page 44 : 
// 不想做


Page 45 ：
// 我是谁

我是由 .java 文件编译出来的 class 
我的实例变量值可以与其他兄弟姐妹不同 object
我的功能类似模板 ： class
我喜欢执行工作： object, method ;
我带有很多的方法 ： class object ；
我代表“状态”： instance variable;
我拥有很多行为：  object class;
我待在对象中： method， instance variable
我生存在堆中： object；
我被用来创建对象实例： class
我的状态可以改变： object， instance， variable;
我会声明方法： class
我可以在运行期变化  ： class instance variable
















































