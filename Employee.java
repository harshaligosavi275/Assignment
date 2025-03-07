import java.util.*;

class Employee{
    int empId;
    String empName;
    double empSal;

    Employee(int empId,String empName,double empSal){
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;

    }
    public void displayDetails(){
            ArrayList al = new ArrayList();
            al.add(empId);
            al.add(empName);
            al.add(empSal);
          
        System.out.println(al);
    } 
 

    public static void main(String[] args){
        
        for(int i=0; i<3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id:");
            int id = sc.nextInt();
            System.out.println("enter name:");
            String name = sc.next();
            System.out.println("Enter sal:");
            double sal= sc.nextDouble();

            Employee e1 = new Employee(id,name,sal);
            e1.displayDetails();
        }
        // Employee e1 = new Employee(1,"neha",20000.12);
        // Employee e2 = new Employee(2,"harsha",40000.34);
        // Employee e3 = new Employee(3,"rohit",25000.4);

        // e2.displayDetails();
        // e3.displayDetails();
    }
}