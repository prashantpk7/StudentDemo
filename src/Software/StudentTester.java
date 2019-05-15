/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Software;

/**
 *
 * @author Prashant Khanna
 */
public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName ("mantesh");
        System.out.println(s1.getName());
        Student s2 = new Student("Prashant");
        Student s3 = new Student("Parth");
        Student[] list = new Student[3];
        list[0]= s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
        System.out.println(list[i].getName());
        }
        
    }
}
