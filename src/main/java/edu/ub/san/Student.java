package edu.ub.san;

/**
 * Created by dhandapa on 7/2/16.
 */
public class Student {
	int age;
	public Student() {
		System.out.println("Modifying Student.java in Master branch");
	}

	//Making changes to Student when there is a stash on App.java
	public Student(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append("age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
