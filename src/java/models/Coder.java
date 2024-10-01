/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
//import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class Coder extends Person{
    private String Programming_language;
    
    public Coder() {
        
    }
    
    //private ArrayList<Person> list; // aggregation se chua 1 hoac nhieu
                                    // doi tuong khac
    //private Person student; // composition: mot doi tuong chua
                            // mot doi tuong khac
                            // khi doi tuong chua bi huy, cac doi tuong
                            // trong no cung se bi huy theo
    
    public Coder(String Programming_language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_language = Programming_language;
    }

    public String getProgramming_language() {
        return Programming_language;
    }

    public void setProgramming_language(String Programming_language) {
        switch (Programming_language) {
            case "C", "1" -> this.Programming_language = "C";
            case "C#", "2" -> this.Programming_language = "C#";
            case "Java", "3" -> this.Programming_language = "Java";
            case "Python", "4" -> this.Programming_language = "Python";
            default -> {
                this.Programming_language = "";
                System.out.println("Vui long chon 1 trong 4 ngon ngu");
            }
        }
        //this.Programming_language = Programming_language;
    }

    /*public void toString(String Programming_language, String name, int age, String phone) {
        System.out.println("Ten: " +name+ 
                "\nTuoi: " +age+ 
                "\nSDT: " +phone+
                "\nNNLT: " +Programming_language);
    }*/
    public void toString(Coder coder) {
        System.out.println("Ten: " +coder.getName());
        System.out.println("Tuoi: " +coder.getAge());
        System.out.println("SDT: " +coder.getPhone());
        System.out.println("NNLT: " +coder.getProgramming_language());
    }
}
