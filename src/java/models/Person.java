/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author ADMIN
 */
// access modifiers
    // public: non-limit access
    // private: only in class included its variables, its phuong thuc
    // protected only available in package or its child classes
    // default: only available in package
public class Person {
    
    
    private String name;
    private int age;
    private String phone;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18) this.age = age;
        else System.out.println("Your age is below 18, try again");
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Person() {
        
    }
    
    /**
     *
     * @param name
     * @param age
     * @param phone
     */
    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    
    
}
