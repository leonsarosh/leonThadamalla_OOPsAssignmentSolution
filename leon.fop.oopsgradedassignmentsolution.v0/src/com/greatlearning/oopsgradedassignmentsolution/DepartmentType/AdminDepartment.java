package com.greatlearning.oopsgradedassignmentsolution.DepartmentType;

import com.greatlearning.oopsgradedassignmentsolution.DeparmentModel.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName() {	
		return depName="Admin Department";	
	}
	
	public String getTodaysWork() {
		return todaysWork="Complete your documents Submission";
	}
	
	public String getWorkDeadline() {	
		return workDeadline="Complete by EOD";	
	}

}
