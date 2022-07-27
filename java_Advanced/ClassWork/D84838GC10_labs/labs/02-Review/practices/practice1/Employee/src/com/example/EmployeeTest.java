/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

/**
 *
 * @author Brent
 */

import com.example.domain.Employee;

public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(120_345.27);
        
        Employee emp01 = new Employee();
        emp01.setEmpId(102);
        emp01.setName("Will Smith");
        emp01.setSsn("012-34-5679");
        emp01.setSalary(120_345.25);
        
        Employee emp02 = new Employee();
        emp02.setEmpId(103);
        emp02.setName("Chris Smith");
        emp02.setSsn("012-34-5681");
        emp02.setSalary(120_345.26);
        
        Employee emp03 = new Employee();
        emp03.setEmpId(104);
        emp03.setName("John Smith");
        emp03.setSsn("012-34-5680");
        emp03.setSalary(120_345.28);
        
        System.out.println("Employee id:        " + emp.getEmpId());
        System.out.println("Employee name:      " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary:    " + emp.getSalary());
        System.out.println("");
        
        System.out.println("Employee id:        " + emp01.getEmpId());
        System.out.println("Employee name:      " + emp01.getName());
        System.out.println("Employee Soc Sec #: " + emp01.getSsn());
        System.out.println("Employee salary:    " + emp01.getSalary());
        System.out.println("");
        
        System.out.println("Employee id:        " + emp02.getEmpId());
        System.out.println("Employee name:      " + emp02.getName());
        System.out.println("Employee Soc Sec #: " + emp02.getSsn());
        System.out.println("Employee salary:    " + emp02.getSalary());
        System.out.println("");
        
        System.out.println("Employee id:        " + emp03.getEmpId());
        System.out.println("Employee name:      " + emp03.getName());
        System.out.println("Employee Soc Sec #: " + emp03.getSsn());
        System.out.println("Employee salary:    " + emp03.getSalary());
        System.out.println("");
    }
    
}
