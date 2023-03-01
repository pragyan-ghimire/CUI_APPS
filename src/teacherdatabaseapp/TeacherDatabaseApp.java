package teacherdatabaseapp;

import java.util.Scanner;

public class TeacherDatabaseApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("----------------Log In---------------");
		System.out.print("Username : ");
		String usrname = in.nextLine();
		System.out.print("Password : ");
		String psd = in.nextLine();

		if (usrname.equals("admin") && psd.equals("teacher")) {
			System.out.println("Access Granted");
			System.out.println();

			System.out.println("                * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n"
					+ "		*                                                             *  \n"
					+ "		*       TEACHER MANAGEMENT SYSTEM OF CLASSXI                  * \n"
					+ "		*                                                             *\n"
					+ "		* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" + "		");

			System.out.print("Enter number of records to be added : ");
			int n = in.nextInt();
			for (int i = 1; i < n + 1; i++) {
				System.out.println();
				Teacher t1 = new Teacher();
			}

		} else {
			System.out.println("Access Denied");
		}

		in.close();
	}

}
