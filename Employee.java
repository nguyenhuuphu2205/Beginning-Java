/*
 Su dung ke thua trong java xay dung lop nhan vien
 */
package beginning_java;

/**
 *
 * @author nguyenhuuphu
 */
public class Employee extends Person {
    //Tao them 2 thuoc tinh cho lop//
    private float salary;
    private float rate;
    //Phuong thuc khoi tao//
    public Employee(String name,int age,String adress,float salary,float rate){
        super(name,age,adress);
        this.salary=salary;
        this.rate=rate;
            }
    //tinh tong luong//
    public float totalSalary(){
        return salary*rate;
    }
    //display thong tin employee//
    public void display(){
        super.display();
        System.out.println("Co tong luong la:"+totalSalary());
        
    }
    public static void main(String []args){
        Employee A=new Employee("Phu",20,"Ha Noi",5000f,2.1f);
        A.display();
    }
}
