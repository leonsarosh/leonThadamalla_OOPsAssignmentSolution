package com.greatlearning.oopsgradedassignmentsolution.DepartmentType;

import com.greatlearning.oopsgradedassignmentsolution.DeparmentModel.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	
	String activity="team Lunch";
	
	public String departmentName() {
		return depName="Hr Department";	
	}
	
	public String getTodaysWork() {	
		return todaysWork="Fill today's worksheet and mark your attendance";	
	}
	
	public String getWorkDeadline() {	
		return workDeadline="Complete by EOD";	
	}
	
	public String doActivity() {	
		return activity;
	}
}
