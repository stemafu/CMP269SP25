import java.util.Iterator;

public class DynamicArrayDriver {

	public static void main(String[] args) {
		DynamicArray<Integer> list;
		list = new DynamicArray<Integer>();

		list.add(90);
		list.add(100);
		list.add(85);

		System.out.println(list.contains(85));

		Student s1 = new Student("Drink Water", 15);
		Student s2 = new Student("Desktop Computer", 24);
		Student s3 = new Student("Blue Sky", 30);

		DynamicArray<Student> studentList;
		studentList = new DynamicArray<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);

		System.out.println(studentList.contains(s1));

		try {
			System.out.println(studentList.contains(null));
		}catch(IllegalArgumentException e) {

		}catch(Exception e) {

		}
		
		Iterator<Student> it = studentList.iterator();

	}

}
