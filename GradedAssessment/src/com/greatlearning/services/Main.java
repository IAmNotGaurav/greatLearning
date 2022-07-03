package com.greatlearning.services;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HrDepartment;
import com.greatlearning.model.TechDepartment;

public class Main {								// Main Class
    public static void main(String[] args) {
    	
        AdminDepartment ad = new AdminDepartment();
        HrDepartment hd = new HrDepartment();
        TechDepartment td = new TechDepartment();

        System.out.println(ad.departmentName());
        System.out.println(ad.getTodaysWork());
        System.out.println(ad.getWorkDeadline());
        System.out.println(ad.isTodayAHoliday());
        
        System.out.println(hd.departmentName());
        System.out.println(hd.getTodaysWork());
        System.out.println(hd.getWorkDeadline());
        System.out.println(hd.doActivity());
        System.out.println(hd.isTodayAHoliday());
        
        System.out.println(td.departmentName());
        System.out.println(td.getTodaysWork());
        System.out.println(td.getWorkDeadline());
        System.out.println(td.getTechStackInformation());
        System.out.println(td.isTodayAHoliday());
   
    }
}

