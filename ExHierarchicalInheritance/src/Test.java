
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person test1 = new Person();
		
		System.out.println(test1.name);
		System.out.println(test1.phoneNumber);
		System.out.println(test1.emailAddress);
		
		test1.PurchaseParkingPass();
		
		Professor test2 = new Professor();
		
		System.out.println(test2.salary);
		
		Student test3 = new Student();
		
		System.out.println(test3.studentNamber);
		System.out.println(test3.averageMark);

	}
}
