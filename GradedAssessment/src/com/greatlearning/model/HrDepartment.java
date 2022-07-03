package com.greatlearning.model;

public class HrDepartment extends SuperDepartment {
    public String departmentName() {
        return "Hr Department ";
    }
    public String getTodaysWork() {
        return "Fill todays worksheet and mark your attendance" ;
    }
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
    public String doActivity() {
        return "Team Lunch";
    }
}
