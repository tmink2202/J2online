/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import models.Coder;

public class OOP {
    
    public static void main(String[] args) {
        //ArrayList in java
        // quan he has - a
        try (Scanner sc = new Scanner(System.in)) {
            //ArrayList in java
            Coder coder = new Coder();
            
            //Coder coder2 = new Coder();
            
            
            //System.out.println("Nhap du lieu cho coder thu " + (i + 1));

            System.out.println("Nhap ten: ");
            String name = sc.next();
            coder.setName(name);

            do {
                System.out.println("Nhap tuoi: ");
                int age = sc.nextInt();
                coder.setAge(age);
            }
            while(coder.getAge() == 0);

            System.out.println("Nhap sdt: ");
            String phone = sc.next();
            coder.setPhone(phone);

            do {
                System.out.println("********Chon ngon ngu lap trinh: *******");
                System.out.println("**Ban co the nhap so hoac ten ngon ngu**");
                System.out.println("1. C");
                System.out.println("2. C#");
                System.out.println("3. Java");
                System.out.println("4. Python");
                String lang = sc.next();
                coder.setProgramming_language(lang);
            } while("".equals(coder.getProgramming_language()));

            /*System.out.println("Ten: " +coder1.getName()+
            "\nTuoi: " +coder1.getAge()+
            "\nSDT: " +coder1.getPhone()+
            "\nNNLT: " +coder1.getProgramming_language());
            */
            coder.toString(coder);
            // instanceof operation
            //System.out.println(coder1 instanceof Person);


        }
    }
}
