/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab01;

import java.util.Scanner;

/**
 *
 * @author ngomi
 */
public class Customer {
    private String id;
    private String name;
    private Date birth;
    static Scanner scan = new Scanner(System.in);
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        if ( birth == null) {
            birth = new Date();
        }
        // Nhập ngày sinh 
        System.out.println("Nhap ngay sinh ");
        int day = scan.nextInt();
        while ( day < 1 || day > 31) {
            System.out.println("Nhap sai roi, nhap lai");
            day = scan.nextInt();
        }
        birth.setDay(day);
        // Nhập tháng sinh 
        System.out.println("Nhap thang sinh ");
        int month = scan.nextInt();
        while ( month < 1 || month > 12) {
            System.out.println("Nhap sai roi, nhap lai");
            month = scan.nextInt();
        }
        birth.setMonth(month);
        // Nhập năm sinh
        System.out.println("Nhap ngay sinh ");
        int year = scan.nextInt();
        while ( year < 1800 || year > 2018) {
            System.out.println("Nhap sai roi, nhap lai");
            year = scan.nextInt();
        }
        birth.setYear(year);
        
        
        this.birth = birth;
    }
    
    
    
}
