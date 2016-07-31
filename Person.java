package beginning_java;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguyenhuuphu
 */
public class Person {
    private String name;
    private int age;
    private String adress;
    public Person(String name,int age,String adress){
        this.name=name;
        this.age=age;
        this.adress=adress;
      }
    public void display(){
        System.out.println("Nhan vien:"+name+" \nTuoi:"+age+" \nDia chi:"+adress);
    }
    
}
