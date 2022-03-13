package com.greatlearning.oopsgradedassignmentsolution.DeparmentModel;

public class SuperDepartment {
	
	protected String depName="Super Department";
	protected String todaysWork="No work as of now";
	protected String workDeadline="Nil";
	protected String todayHoliday="Today is not a holiday";
	
	String departmentName() {
		return depName;	
	}
	
	String getTodaysWork() {	
		return todaysWork;	
	}
	
	String getWorkDeadline() {	
		return workDeadline;	
	}
	
	public String isTodayAHoliday() {
		return todayHoliday;
	}
	

}
