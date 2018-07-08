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
public class JavaBackend_Lab01 {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        inputData(customer1);
        Customer customer2 = new Customer();
        inputData(customer2);
        int resultCompareAgeOfCustomer;
        resultCompareAgeOfCustomer = compareAgeOfCustomer(customer1,customer2);
        if( resultCompareAgeOfCustomer == 1){
            System.out.println("Khách hàng 2 nhiều tuổi hơn");
        }else {
            if (resultCompareAgeOfCustomer == -1 ){
                 System.out.println("Khách hàng 1 nhiều tuổi hơn");
            } else if (resultCompareAgeOfCustomer == 0 ) {
                System.out.println("2 khách hàng bằng tuổi nhau.");
            }
        } 
    }

    private static void inputData(Customer customer1) {
        System.out.println("Nhập thông tin khách hàng bao gồm : id, họ tên, ngày sinh");
        System.out.println("Nhập id");
        String id = scan.nextLine();
        customer1.setId(id);
        System.out.println("Nhập tên");
        String name = scan.nextLine();
        customer1.setName(name);
        System.out.println("Nhập ngày tháng năm sinh");
        customer1.setBirth(customer1.getBirth());
        
    }
    // hàm trả về giá trị nguyên so sánh giữa 2 object , 
    // nếu kq trả về là -1 thì customer 1 ít tuổi hơn customer 2
    // nếu kq trả về là 1 thì customer 1 nhiều tuổi hơn customer 2
    // nếu kq trả về là 0 thì 2 customer bằng tuổi nhau
    private static int compareAgeOfCustomer(Customer customer1, Customer customer2){
        if( customer1.getBirth().getYear() > customer2.getBirth().getYear() ){
            return -1;
        }else if( customer1.getBirth().getYear() < customer2.getBirth().getYear() ){
            return 1;
        }
        if( customer1.getBirth().getMonth()> customer2.getBirth().getMonth()){
            return -1;
        } else if( customer1.getBirth().getMonth()< customer2.getBirth().getMonth()){
            return 1;
        }
        if( customer1.getBirth().getDay()> customer2.getBirth().getDay()){
            return -1;
        } else if( customer1.getBirth().getDay()< customer2.getBirth().getDay()){
             return 1;
        }
        return 0;
    }
    
}
