package java8Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
		
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		// Find out the count of male and female employees present in the organization?
		Employee.getCountOfMaleFemale(employeeList);
		// ==================================================================================

		// Write a program to print the names of all departments in the organization.
		Employee.getAllDepartmentList(employeeList);
		// ==================================================================================

		// Find the average age of Male and Female Employees.
		Employee.getAvgAgeByGender(employeeList);
		// ===================================================================================

		// Get the Names of employees who joined after 2015.

		Employee.getEmpNameJoinAfter2015(employeeList);

		// =========================================================

		// Count the number of employees in each department.

		Employee.getDepartmentWiseEmpList(employeeList);

		// ==========================================================

		// Find out the average salary of each department.
		Employee.getAvgSalDepartmentWiseist(employeeList);

		// =========================================================

		// Find out the oldest employee, his/her age and department?

		Employee.oldestEmpE(employeeList);

		// =========================================================

		// 8. Find out the average and total salary of the organization.

		Employee.getEmpSalary(employeeList);

		// 9. List down the employees of each department.

		Employee.getDepartmentWiseEmpNameList(employeeList);

		// ======================================================
		
		Employee.seniorEmp(employeeList);

	}

	public static void getCountOfMaleFemale(List<Employee> employeeList) {

		Map<String, Long> empCountByGender = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("empCountByGender:" + empCountByGender);
	}

	public static void getAllDepartmentList(List<Employee> employeeList) {

		List<String> departmentList = employeeList.stream().map(Employee::getDepartment).distinct()
				.collect(Collectors.toList());

		System.out.println("getAllDepartmentList:" + departmentList);
	}

	public static void getAvgAgeByGender(List<Employee> employeeList) {

		Map<String, Double> getAvgAgeByGenderList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println("getAvgAgeByGenderList:" + getAvgAgeByGenderList);
	}

	public static void getEmpNameJoinAfter2015(List<Employee> employeeList) {

		List<String> empNameList = employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015)
				.map(Employee::getName).collect(Collectors.toList());

		System.out.println("getEmpNameJoinAfter2015:" + empNameList);
	}

	public static void getDepartmentWiseEmpList(List<Employee> employeeList) {

		Map<String, Long> getDepartmentWiseEmpList = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("getDepartmentWiseEmpList:" + getDepartmentWiseEmpList);
		

		Set<Entry<String, Long>> map = getDepartmentWiseEmpList.entrySet();

		for (Entry<String, Long> key : map) {

			System.out.println(key.getKey() + "==========" + key.getValue());
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");

		employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
		.entrySet().stream()
		.forEach( m -> {
			System.out.println(m.getKey() +" "+m.getValue());
		});

		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||");


		}
	}

	public static void getAvgSalDepartmentWiseist(List<Employee> employeeList) {

		Map<String, Double> getAvgSalDepartmentWiseist = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println("getAvgSalDepartmentWiseist:" + getAvgSalDepartmentWiseist);

		/*
		 * Map<String,String> getDepartmentWiseEmpNameList =
		 * employeeList.stream().collect(Collectors.toMap(Employee::getDepartment,
		 * Employee::getName , (oldValue, newValue) -> oldValue ));
		 * 
		 * System.out.println("getDepartmentWiseEmpNameList:"+
		 * getDepartmentWiseEmpNameList);
		 */

		Set<Entry<String, Double>> map = getAvgSalDepartmentWiseist.entrySet();

		for (Entry<String, Double> key : map) {

			System.out.println(key.getKey() + "==========" + key.getValue());
		}
	}

	public static void oldestEmpE(List<Employee> employeeList) {

		Optional<Employee> oldestEmpE = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
		
		Optional<Employee> maxSal  = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));

		System.out.println("emp name :" + oldestEmpE.get().getName());
		System.out.println("department name  :" + oldestEmpE.get().getDepartment());
		System.out.println("emp age :" + oldestEmpE.get().getAge());
		
		System.out.println("max sal :" + maxSal.get().getName());

	}

	public static void getEmpSalary(List<Employee> employeeList) {

		DoubleSummaryStatistics empSalary = employeeList.stream().filter(st -> st.getName().startsWith("M"))
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		
	//	DoubleSummaryStatistics empSalary = employeeList.stream().filter(st -> st.getName().startsWith("M"))
		//		.collect(Collectors.summarizingDouble(Employee::getSalary));
		
	
		System.out.println("Average Salary = " + empSalary.getAverage());
		System.out.println("Total Salary = " + empSalary.getSum());
		System.out.println("get max Salary = " + empSalary.getMax());
		System.out.println("get min Salary = " + empSalary.getMin());
		System.out.println("get count  = " + empSalary.getCount());

	}

	public static void getDepartmentWiseEmpNameList(List<Employee> employeeList) {

		Map<String, List<Employee>> getDepartmentWiseEmpNameList =null ;
		
		getDepartmentWiseEmpNameList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment))
				.entrySet().stream().forEach(ent -> {
					 System.out.println(ent.getKey() +"====5555555555====="+ent.getValue());
				}
			);
		
		
		getDepartmentWiseEmpNameList.entrySet().stream().forEach(st -> {
			 
			System.out.println(st.getKey()+"========"+st.getValue());
		});

		/*Set<Entry<String, List<Employee>>> map = getDepartmentWiseEmpNameList.entrySet();

		for (Entry<String, List<Employee>> entry : map) {

			System.out.println("departmentName:" + entry.getKey());

			List<Employee> list = entry.getValue();
			for (Employee emp : list) {
				System.out.println(emp.getName());
			}

		}*/

	}

	public static void seniorEmp(List<Employee> employeeList) {

		Optional<Employee> seniorEmp = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst();

		Employee seniorMostEmployee = seniorEmp.get();

		System.out.println("Senior Most Employee Details :");
		System.out.println("----------------------------");
		System.out.println("ID : " + seniorMostEmployee.getId());
		System.out.println("Name : " + seniorMostEmployee.getName());
		System.out.println("Age : " + seniorMostEmployee.getAge());
		
		List<Employee> list1 = new ArrayList<>();
		
		List<String> list2 =	employeeList.stream().filter(st-> st.getAge()< 40 ).map( em -> em.getName().toUpperCase()).collect(Collectors.toList());
		
		
		employeeList.stream().
			sorted(Comparator.comparing((Employee::getSalary))).filter(st -> st.getAge() > 30 )
			.forEach(st -> {
				Employee e12 = new Employee(st.getId(), st.getName().toUpperCase(),
						st.getAge(), st.getGender(), st.getDepartment(), st.getYearOfJoining(), st.getSalary());
				 list1.add(e12);
			});
			
	
	
		
	System.out.println("2 test case"+list1);
		

	}

}
