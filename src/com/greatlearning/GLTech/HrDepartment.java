package com.greatlearning.GLTech;

public class HrDepartment extends SuperDepartment {
    public String departmentName(){

        return "Hr Department";
    }
    public String getTodaysWork(){

        return "Fill today’s timesheet and mark your attendance.";
    }
    public String getWorkDeadline(){

        return "Complete by EOD.";
    }
    public String doActivity(){

        return "team Lunch";
    }
    public void getHrDeptFunctionalities(){
        System.out.println("Department name : " + departmentName());
        System.out.println("today's assigned work : " + getTodaysWork());
        System.out.println("Deadline for the work assigned : " + getWorkDeadline());
        System.out.println("Today's Activity : " + doActivity());
        System.out.println("Is today a holiday? : " + isTodayAHoliday());
    }
}