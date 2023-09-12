
class std{
	int id;
	String name;
	int age;
	
	std(){
		id = 10;
		name = "Deepjyoti kalita";
		age = 21;
	}
	
	void show() {
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("age is: "+21);
	}
}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		std mydetails = new std();
		
		mydetails.show();
	}

}
