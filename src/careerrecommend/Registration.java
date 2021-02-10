/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crazelu
 */
public class Registration {
    private String userName;
    private String regNum;
    private String department;
    private int level;
    private int num;
    
    public boolean register(){
        
     ArrayList<String> departments = new ArrayList<>();
     departments.add("(1) Computer Science");
     departments.add("(2) Statistics");  
     departments.add("(3) Mathematics");
     departments.add("(4) Geology");
     departments.add("(5) Physics and Astronomy");
     departments.add("(6) Science Laboratory Technology");
     departments.add("(7) Pure and Industrial Chemistry");
     
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter full name:");
    this.userName = scan.nextLine();
    System.out.println("Enter reg number:");
    this.regNum = scan.nextLine();
    System.out.println("Enter department:");
    departments.forEach((course)->{
        System.out.println(course);});
    
    this.num = scan.nextInt();
 
    System.out.println("Enter year of study:");
    this.level = scan.nextInt();

    return true;
    }
        
    public String getName(){
        return this.userName;
    }
    
    public String getDepartment(){
        
        switch(num){
            case 1:
                this.department = "Computer Science";
                break;
            case 2:
                this.department = "Statistics";
                break;
                
            case 3:
                this.department = "Mathematics";
                break;
                
                
            case 4:
                this.department = "Geology";
                break;
                
                
            case 5:
                this.department = "Physics and Astronomy";
                break;
                
                
            case 6:
                this.department = "Science Laboratory Technology";
                break;
                 
            case 7:
                this.department = "Pure and Industrial Chemistry";
                break;
                
            default:
                System.out.println("Invalid department selection!");
        this.department = "Invalid";
        }
      
        return this.department.toLowerCase();
    }
    
    public int getLevel(){
        return this.level;
    }
    
    
    /***
     * @param department
     * @return true if @param department is in Physical Sciences Faculty, otherwise, false
     
     ***/
    public boolean isInPhyScience(String department){
        String [] physicalScienceDepartments = new String []{"computer science","statistics","geology", "pure and industrial chemistry",
        "physics and astronomy","mathematics"};
        
        for(int i = 0; i<physicalScienceDepartments.length; i++ ){
            if(physicalScienceDepartments[i].equals(department.toLowerCase())){
                return  true;
            }
        }
         return  false;

    }   
    
    public void welcome(){
        System.out.println("+==================================================================================+");
        System.out.println("+                                                                                  +");
        System.out.println("                                   Hey "+ this.userName+"!");  
        System.out.println("               Welcome to Physical Sciences Career Recommendation System.         ");
        System.out.println("+                                                                                  +");
        System.out.println("+==================================================================================+");
    }
    
    }
