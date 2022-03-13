package com.greatlearning.oopsgradedassignmentsolution.DepartmentType;

import com.greatlearning.oopsgradedassignmentsolution.DeparmentModel.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	String stackInformation="core Java";
	
	public String departmentName() {	
		return depName="Tech Department";	
	}
	
	public String getTodaysWork() {	
		return todaysWork="Complete coding of module 1";	
	}
	
	public String getWorkDeadline() {	
		return workDeadline="Complete by EOD";
	}
	
	public String getTechStackInformation() {
		return stackInformation;
	}
}
