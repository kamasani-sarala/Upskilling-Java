package Constructor;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
//	public  void personInput() {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the Name : ");
//		String name = sc.nextLine();
//		System.out.print("Enter the Age : ");
//		int age = sc.nextInt();
//		
//		//sc.nextLine();
//		setName(name);
//        setAge(age);
//		
//	}

	public static void main(String[] args) {
		
		
		    Person p1 = new Person("Sri", 30);
	        System.out.println("Name: " + p1.getName());
	        System.out.println("Age: " + p1.getAge());
	        
	        Person p2 = new Person("Raj", 40);
	        System.out.println("Name: " + p2.getName());
	        System.out.println("Age: " + p2.getAge());
		
	}
}

