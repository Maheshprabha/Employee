package com.atmecs.employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {
	@SuppressWarnings("rawtypes")
	public static Map<String, List> initialize_data() {
		
		Map<String, List> employee_list = new HashMap<String, List>();
			
		List<String> employee1 = Arrays.asList("Mahesh","CSE","Associate Engineer","10000");
		List<String> employee2 = Arrays.asList("Prabha","IT","Software Engineer","20000");
		List<String> employee3 = Arrays.asList("yogesh","CSE","Senior software Engineer","30000");
        List<String> employee4 = Arrays.asList("Ram","IT","Associate Engineer","40000");
		List<String> employee5 = Arrays.asList("Ravi","CSE","Associate Engineer","50000");
		List<String> employee6 = Arrays.asList("Ranjitha","CSE","Associate Engineer","60000");
        employee_list.put("101", employee1);
		employee_list.put("102", employee2);
		employee_list.put("103", employee3);
        employee_list.put("104", employee4);
        employee_list.put("105", employee5);
        employee_list.put("106", employee6);

            return employee_list;
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void employee_access() {
		
		int num = 1;
		do {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 to show data.."+"\n"+"Enter 2 to add data"+"\n"+"Enter 3 to delete data");
		String ekey = scan.next();

		switch (ekey) {
		
			case "1": {
				System.out.println("Enter the employee id");
				String id = scan.next();
				@SuppressWarnings("rawtypes")
				Map<String, List> employee_list = initialize_data();
				System.out.println(employee_list.get(id));
				break;
			}
			case "2": {
				
				System.out.println("enter the number of employee data to add");
				int num1 = scan.nextInt();
				
				@SuppressWarnings("rawtypes")
				Map<String, List> employee_list = initialize_data();
				
				for(int i=0; i<num1; i++) {
					System.out.println("employee id, employee name, department, designation,salary");
					String id = scan.next();
					String name = scan.next();
					String dept = scan.next();
					String designation = scan.next();
					String salary = scan.next();
					
					List<String> employee1 = Arrays.asList(name,dept,designation,salary);
					employee_list.put(id, employee1);
				}
					System.out.println("Updated employee data");
					System.out.println(employee_list);
				break;
		
			}
			
			case "3": {
				System.out.println("enter the employee id do you want to delete record");
				int num1 = scan.nextInt();
				@SuppressWarnings("rawtypes")
				Map<String, List> employee_list = initialize_data();
				employee_list.remove(num1);
				System.out.println("Updated employee data");
				System.out.println(employee_list);
				break;
			}
			case "4": break;
					default: System.out.println("Invalid choice");
				}
				
			System.out.println("Do you want to continue?1.Yes 2.No");
				@SuppressWarnings("unused")
				int num1 = scan.nextInt();
		}while(num==1);
   }
}


