
public class Student implements Comparable<Student>{
	
	private int age;
	private String name;
	public Student(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*@Override
	public int compareTo(I o) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	@Override
	public int compareTo(Student o) {
		
		if(this.age == o.age && this.name.compareTo(o.name) == 0) {
			return 0;
		}else if(this.age < o.age && this.name.compareTo(o.name) <= 0) {
			return -1;
		}
		return 1;
	}
	

}
