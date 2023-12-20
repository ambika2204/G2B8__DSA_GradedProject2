package com.greatlearning.GLTech;

public class TechDepartment extends SuperDepartment {

    public String departmentName(){

        return "Tech Department";
    }
    public String getTodaysWork(){

        return "Complete coding of module 1.";
    }
    public String getWorkDeadline(){

        return "Complete by EOD.";
    }
    public String getTechStackInformation(){

        return "core Java";
    }
    public void getTechDeptFunctionalities(){
        System.out.println("Department name : " + departmentName());
        System.out.println("today's assigned work : " + getTodaysWork());
        System.out.println("Deadline for the work assigned : " + getWorkDeadline());
        System.out.println("Tech stack for the module is : " + getTechStackInformation());
        System.out.println("Is today a holiday? : " + isTodayAHoliday());
    }
}