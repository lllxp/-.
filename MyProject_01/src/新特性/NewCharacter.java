package 新特性;

import java.util.function.Consumer;

class Apple {

	String color;
	int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

}
public class NewCharacter {

	public static void ConsumerApple(Apple[] apps, Consumer<Apple> c) {
		for (Apple app : apps) {
			c.accept(app);
		}
	}
	public static void main(String[] args) {
		Apple app1 = new Apple("红", 1);
		Apple app2 = new Apple("黄", 2);
		Apple app3 = new Apple("绿", 3);

		Apple[] Apples = { app1, app2, app3 };
		System.out.println("匿名内部类形式:");
		ConsumerApple(Apples, new Consumer<Apple>() {
			@Override
			public void accept(Apple t) {
				System.out.println(t);
			}
		});	
		System.out.println();	
		//lambda表达式
		System.out.println("lambda表达式:");
		ConsumerApple(Apples, apple ->{
			System.out.println(apple.toString());
		});

	}

}

