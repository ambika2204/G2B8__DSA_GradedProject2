package com.greatlearning.GLTech;

public class AdminDepartment extends SuperDepartment {
   public String departmentName(){

       return "Admin Department";
   }
    public String getTodaysWork(){

        return "Complete your documents Submission";
    }
    public String getWorkDeadline(){

        return "Complete by EOD";
    }
    public void getAdminDeptFunctionalities(){
        System.out.println("Department name : " + departmentName());
        System.out.println("today's assigned work : " + getTodaysWork());
        System.out.println("Deadline for the work assigned : " + getWorkDeadline());
        System.out.println("Is today a holiday? : " + isTodayAHoliday());
    }
}