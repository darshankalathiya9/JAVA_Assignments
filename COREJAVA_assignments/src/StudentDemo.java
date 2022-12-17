import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AgeNotWithinRangeException extends Exception {
	@Override
	public String toString() {
		return ("Age is Not Between 15 and 21.... Please Re-Enter the Age.");
	}
}

class NameNotValidException extends Exception {
	public String Validname() {
		return ("Name is not Valid.... Please Re-Enter The Name.");

	}
}

class Student {
	int roll_no, age;
	String name, course;

	Student() {
		roll_no = 0;
		name = null;
		age = 0;
		course = null;
	}

	Student(int a, String b, int c, String d) {
		roll_no = a;
		course = d;
		int l, temp = 0;
		l = b.length();

		for (int i = 0; i < l; i++) {
			char ch;
			ch = b.charAt(i);
			if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z') {
				temp = 1;
			}
		}

		try {
			if (temp == 1) {
				throw new NameNotValidException();
			} else {
				name = b;
			}
		} catch (NameNotValidException e) {
			System.out.println(e);
		}

		try {
			if (a >= 15 && a <= 21) {
				age = a;
			} else {
				throw new AgeNotWithinRangeException();
			}
		} catch (AgeNotWithinRangeException e1) {
			System.out.println(e1);
		}
	}

	void display() {
		System.out.println("Roll\tName\tAge\tCourse");
		System.out.println("-----------------------------");
		System.out.println(roll_no + "\t" + name + "\t" + age + "\t" + course);
	}
}

public class StudentDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, c;
		String b, d;

		System.out.println("Enter Roll_No, Name, Age, Course");

		a = Integer.parseInt(br.readLine());
		b = br.readLine();
		c = Integer.parseInt(br.readLine());
		d = br.readLine();

		Student s = new Student(a, b, c, d);
		s.display();
	}
}
