package primtives.injection.xml;

public class ConstructorConfusionDemo {
	String name;
	int id;
	int count;

	public ConstructorConfusionDemo(String name) {
		this.name = name;
		System.out.println("ConstructorConfusionDemo(String name) is called");
	}

	public ConstructorConfusionDemo(int id) {
		this.id = id;
		System.out.println("ConstructorConfusionDemo(int id) is called");
	}

	public ConstructorConfusionDemo(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println("ConstructorConfusionDemo(String name, int id) is called");
	}

	public ConstructorConfusionDemo(int id, String name) {
		this.name = name;
		this.id = id;
		System.out.println("ConstructorConfusionDemo(int id, String name) is called");
	}

	public ConstructorConfusionDemo(String name, int id, int count) {
		this.name = name;
		this.id = id;
		this.count = count;
		System.out.println("ConstructorConfusionDemo(String name, int id, int count) is called");
	}

}
