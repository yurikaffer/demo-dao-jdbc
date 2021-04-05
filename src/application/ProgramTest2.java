package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*System.out.println("\n===================== TEST 1: Department insert ==========================");
		
		Department department = new Department("Yuri");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());*/
		
		System.out.println("\n===================== TEST 2: Department Update ==========================");
		
		Department department = new Department(6, "Yuri Jhonson");
		departmentDao.update(department);
		System.out.println("Updated! Updated for id = " + department.getId() + ", new name is " + department.getName());
		
		/*System.out.println("\n===================== TEST 3: Department Delete ==========================");
		
		System.out.print("Enter id: ");
		Integer id = sc.nextInt();
		
		departmentDao.deleteById(id);
		System.out.println("Deleted! Deleted department for id = " + department.getId());*/
		
		System.out.println("\n===================== TEST 4: Department findById ==========================");
		Department dep = departmentDao.findById(4);
		System.out.println(dep);

		System.out.println("\n===================== TEST 5: Department findByAll ==========================");
		List<Department> list = departmentDao.findAll();
		
		for (Department dep1 : list) {
			System.out.println(dep1);
		}
		
	}

}
