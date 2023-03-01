package teacherdatabaseapp;

import java.util.Scanner;

public class Teacher {
//	id name salary contact number age address faculty

	Scanner in = new Scanner(System.in);

	private static int id = 100;
	private String name;
	private long contactNumber;
	private int age;
	private int faculty;
	private int salary;
	private String address;

	public Teacher() {
		setId();
		System.out.print("\nEnter Full Name : ");
		this.name = in.nextLine();

		System.out.print("Enter Address : ");
		this.address = in.nextLine();
		setAge();
		if (age > 60 || age < 24) {
			System.out.println("Your age is not eligible");
//		id=id-1;

		} else {
			setContact();
			System.out.print("Choose Faculty : ");
			teacherFaculty();
			show();

		}

	}

	void setAge() {
		System.out.print("Enter Age : ");
		this.age = in.nextInt();

	}

	void setId() {
		id = id + 1;
		System.out.print("ID : " + id);

	}

	void setContact() {
		System.out.print("Enter Contact Number : ");
		this.contactNumber = in.nextLong();
	}

	private void teacherFaculty() {

		System.out.println("\n0 for Science \n1 for Technical \n2 for Commerce \n3 for Education");
		this.faculty = in.nextInt();

		switch (faculty) {
		case 0 -> this.salary = 30000;
		case 1 -> this.salary = 35000;
		case 2 -> this.salary = 29000;
		case 3 -> this.salary = 29000;

		}
	}

	private void show() {
		System.out.println(
				" Name : " + this.name + "\n Address : " + this.address + "\n Age : " + this.age + "\n Contact no. : "
						+ this.contactNumber + "\n Faculty : " + this.faculty + "\n Salary : Rs " + this.salary

		);

	}

}
