import java.util.*;
public class Employee 
{
	String nm,add;
	int yr;
	float sal;
	void getData(String name,int year,String address, float salary)
	{
		 nm = name;
		 yr = year;
		 add = address;
		 sal = salary;
	}
	void printData()
	{
		System.out.println("Employee Name: "+nm);
		System.out.println("Year Of Joining: "+yr);
		System.out.println("Address: "+add);
		System.out.println("Salary: "+sal);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name, year of joining, address and salary for three employees");
		String nm1 = sc.next(); 
		int yr1 = sc.nextInt();
		String add1 = sc.next();
		float salary1 = sc.nextFloat();
		String nm2 = sc.next(); 
		int yr2 = sc.nextInt();
		String add2 = sc.next();
		float salary2 = sc.nextFloat();
		String nm3 = sc.next(); 
		int yr3 = sc.nextInt();
		String add3 = sc.next();
		float salary3 = sc.nextFloat();
		Employee e = new Employee();
		e.getData(nm1,yr1,add1,salary1);
		e.printData();
		e.getData(nm2,yr2,add2,salary2);
		e.printData();
		e.getData(nm3,yr3,add3,salary3);
		e.printData();
	}
}
