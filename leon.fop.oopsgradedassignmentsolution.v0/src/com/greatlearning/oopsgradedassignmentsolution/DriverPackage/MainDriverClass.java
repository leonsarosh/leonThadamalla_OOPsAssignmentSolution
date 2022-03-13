package com.greatlearning.oopsgradedassignmentsolution.DriverPackage;

import com.greatlearning.oopsgradedassignmentsolution.DeparmentModel.SuperDepartment;
import com.greatlearning.oopsgradedassignmentsolution.DepartmentType.AdminDepartment;
import com.greatlearning.oopsgradedassignmentsolution.DepartmentType.HrDepartment;
import com.greatlearning.oopsgradedassignmentsolution.DepartmentType.TechDepartment;

public class MainDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment admin_obj=new AdminDepartment();
		HrDepartment hr_obj=new HrDepartment();
		TechDepartment tech_obj=new TechDepartment();
		
		System.out.println("Welcom to "+admin_obj.departmentName());
		System.out.println(admin_obj.getTodaysWork());
		System.out.println(admin_obj.getWorkDeadline());
		System.out.println(admin_obj.isTodayAHoliday());
		
		System.out.println();		
		System.out.println("Welcom to "+hr_obj.departmentName());
		System.out.println(hr_obj.doActivity());
		System.out.println(hr_obj.getTodaysWork());
		System.out.println(hr_obj.getWorkDeadline());
		System.out.println(hr_obj.isTodayAHoliday());
		
		System.out.println();		
		System.out.println("Welcom to "+tech_obj.departmentName());
		System.out.println(tech_obj.getTodaysWork());
		System.out.println(tech_obj.getWorkDeadline());
		System.out.println(tech_obj.getTechStackInformation());
		System.out.println(tech_obj.isTodayAHoliday());

	}

}
