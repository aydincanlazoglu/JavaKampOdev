package KampOdev;

public class Main {
	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.name = "Can";
		instructor1.adminNumber=12;
		instructor1.age=24;
		
		Instructor instructor2 = new Instructor();
		instructor2.name = "Şenol";
		instructor2.adminNumber=2156;
		instructor2.age = 54;
		
		Student student1 = new Student();
		student1.schoolNumber = 132;
		student1.name = "Talha";
		
		Student student2 = new Student();
		student2.schoolNumber = 964;
		student2.name= "AliCan";
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.assign(instructor1);
		instructorManager.assign(instructor2);
		
		StudentManager studentManager = new StudentManager();
		studentManager.register(student1);
		studentManager.register(student2);
		
	}
}
