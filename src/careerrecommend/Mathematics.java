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
 * @author Emmanuel
 */
public class Mathematics {
    private String value;
    private int point;
    Scanner scan;

    Mathematics() {
        scan = new Scanner(System.in);
    }

    /***
     * @return list of user's favourite courses if user is
     * currently in their first year of study
     ***/
    private ArrayList<String> level1() {

        point = 0;
        
        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "STA 205 STATISTICS FOR PHYSICAL SCIENCES", "COS 101 INTRODUCTION TO COMPUTER SCIENCE", "STA 111 PROBABILITY 1", 
            "MTH 122 ELEMENTARY MATHEMATICS 3", "MTH 132 ELEMENTARY MATHEMATICS 1", "STA 206 STATISTICS FOR PHYSICAL SCIENCES",
            "STA 112 PROBABILITY 2", "STA 134 LABORATORY FOR INFERENCE 1", "STA 132 INFERENCE 2"};
        
        
        ArrayList<String> favouriteCourses = new ArrayList<>();
        
        System.out.println("Select your four favourite courses. Type y for Yes or n for No");
        
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(((String[]) courseList)[i] + "[Y/N]");
            value = scan.nextLine();
            while (!(value.toLowerCase().equals("n")) && !(value.toLowerCase().equals("y"))) {
                System.out.println("Invalid selection");
                System.out.println(((String[]) courseList)[i] + "[Y/N]");
                value = scan.nextLine();
            }
            if (value.toLowerCase().equals("y")) {
                favouriteCourses.add(courseList[i].substring(0,3) + "_" + courseList[i].substring(4,7));
                if (++point == 4) break;
            }
        }
       
        return favouriteCourses;

    }
    
    /***
     * @return list of user's favourite courses if user is
     * currently in their second year of study
     ***/
    private ArrayList<String> level2() {
        point = 0;
        
        
        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "STA 205 STATISTICS FOR PHYSICAL SCIENCES", "COS 101 INTRODUCTION TO COMPUTER SCIENCE", "STA 111 PROBABILITY 1", 
            "MTH 122 ELEMENTARY MATHEMATICS 3", "MTH 132 ELEMENTARY MATHEMATICS 1", "STA 206 STATISTICS FOR PHYSICAL SCIENCES",
            "STA 112 PROBABILITY 2", "STA 134 LABORATORY FOR INFERENCE 1", "STA 132 INFERENCE 2",
            "MTH 211 SET LOGIC AND ALGEBRA", "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING",
            "MTH 231 ELEMENTARY MECHANICS 2", "STA 211 PROBABILITY 3", "MTH 218	THREE-DIMENSIONAL ANALYTIC GEOMETRY",
            "STA 212 PROBABILITY 4", "MTH 216 LINEAR ALGEBRA 2", "", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS"
        };
        
        ArrayList<String> favouriteCourses = new ArrayList<>();

        System.out.println("Select your four favourite courses. Type y for Yes or n for No");
        
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(((String[]) courseList)[i] + "[Y/N]");
            value = scan.nextLine();
            while (!(value.toLowerCase().equals("n")) && !(value.toLowerCase().equals("y"))) {
                System.out.println("Invalid selection");
                System.out.println(((String[]) courseList)[i] + "[Y/N]");
                value = scan.nextLine();
            }
            if (value.toLowerCase().equals("y")) {
                favouriteCourses.add(courseList[i].substring(0,3) + "_" + courseList[i].substring(4,7));
                if (++point == 4) break;
            }
        }

        return favouriteCourses;

    }

    /***
     * @return list of user's favourite courses if user is
     * currently in their third year of study
     ***/
    private ArrayList<String> level3() {
        point = 0;
        
        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "STA 205 STATISTICS FOR PHYSICAL SCIENCES", "COS 101 INTRODUCTION TO COMPUTER SCIENCE", "STA 111 PROBABILITY 1", 
            "MTH 122 ELEMENTARY MATHEMATICS 3", "MTH 132 ELEMENTARY MATHEMATICS 1", "STA 206 STATISTICS FOR PHYSICAL SCIENCES",
            "STA 112 PROBABILITY 2", "STA 134 LABORATORY FOR INFERENCE 1", "STA 132 INFERENCE 2",
            "MTH 211 SET LOGIC AND ALGEBRA", "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING",
            "MTH 231 ELEMENTARY MECHANICS 2", "STA 211 PROBABILITY 3", "MTH 218	THREE-DIMENSIONAL ANALYTIC GEOMETRY",
            "STA 212 PROBABILITY 4", "MTH 216 LINEAR ALGEBRA 2", "", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", 
            "MTH 311 ABSTRACT ALGEBRA 1", "MTH 321 METRIC SPACE TOPOLOGY", "MTH	327 ELEMENTARY DIFFERENTIAL EQUATION 2",
            "MTH 323 COMPLEX ANALYSIS 1", "MTH 331 INTROCUCTION TO MATHEMATICAL MODELLING",
            "MTH 313 GEOMETRY", "MTH 329 CALCULUS IN R^N", "MTH	337 OPTIMIZATION THEORY", "MTH 339 ANALYTIC DYNAMICS", 
            "MTH 335 INTRODUCTION TO OPERATION RESEARCH", "MTH 341 DISCRETE MATHEMATICS", "STA 311 PROBABILITY 5", 
            "STA 321 DISTRIBUTION THEORY", "STA	331 STATISTICAL INFERENCE 4", "COS 333 SYSTEMS ANALYSIS AND DESIGN",
            
            "MTH 312 ABSTRACT ALGEBRA 2", "MTH 324 VECTOR AND TENSOR ANALYSIS",
            "MTH 328 COMPLEX ANALYSIS 2", "MTH 326 REAL ANALYSIS 2", 
            "MTH 314 GEOMETRY 2", "MTH 316 DIFFERENTIAL GEOMETRY",
            "MTH 338 OPTIMIZATION THEORY 2", "MTH 336 DYNAMICS OF RIGID BODY",
            "MTH 338 SPECIAL THEORY OF RELATIVITY", "MTH 342 DISCRETE MATHEMATICS 2",
            "MTH 344 NUMERICAL ANALYSIS 2", "STA 312 PROBABILITY 6",
            "STA 332 INFERENCE 6", "COS	332 OPERATING SYSTEM 2"

        };
        
        ArrayList<String> favouriteCourses = new ArrayList<>();

        System.out.println("Select your four favourite courses. Type y for Yes or n for No");
        
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(((String[]) courseList)[i] + "[Y/N]");
            value = scan.nextLine();
            while (!(value.toLowerCase().equals("n")) && !(value.toLowerCase().equals("y"))) {
                System.out.println("Invalid selection");
                System.out.println(((String[]) courseList)[i] + "[Y/N]");
                value = scan.nextLine();
            }
            if (value.toLowerCase().equals("y")) {
                favouriteCourses.add(courseList[i].substring(0,3) + "_" + courseList[i].substring(4,7));
                if (++point == 4) break;
            }
        }
       
        return favouriteCourses;
    }
    
    /***
     * @return list of user's favourite courses if user is
     * currently in their fourth year of study
     ***/
    private ArrayList<String> level4() {
        point = 0;
        
        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "STA 205 STATISTICS FOR PHYSICAL SCIENCES", "COS 101 INTRODUCTION TO COMPUTER SCIENCE", "STA 111 PROBABILITY 1", 
            "MTH 122 ELEMENTARY MATHEMATICS 3", "MTH 132 ELEMENTARY MATHEMATICS 1", "STA 206 STATISTICS FOR PHYSICAL SCIENCES",
            "STA 112 PROBABILITY 2", "STA 134 LABORATORY FOR INFERENCE 1", "STA 132 INFERENCE 2",
            "MTH 211 SET LOGIC AND ALGEBRA", "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING",
            "MTH 231 ELEMENTARY MECHANICS 2", "STA 211 PROBABILITY 3", "MTH 218	THREE-DIMENSIONAL ANALYTIC GEOMETRY",
            "STA 212 PROBABILITY 4", "MTH 216 LINEAR ALGEBRA 2", "", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "MTH 311 ABSTRACT ALGEBRA 1", "MTH 321 METRIC SPACE TOPOLOGY", "MTH	327 ELEMENTARY DIFFERENTIAL EQUATION 2",
            "MTH 323 COMPLEX ANALYSIS 1", "MTH 331 INTROCUCTION TO MATHEMATICAL MODELLING",
            "MTH 313 GEOMETRY", "MTH 329 CALCULUS IN R^N", "MTH	337 OPTIMIZATION THEORY", "MTH 339 ANALYTIC DYNAMICS", 
            "MTH 335 INTRODUCTION TO OPERATION RESEARCH", "MTH 341 DISCRETE MATHEMATICS", "STA 311 PROBABILITY 5", 
            "STA 321 DISTRIBUTION THEORY", "STA	331 STATISTICAL INFERENCE 4", "COS 333 SYSTEMS ANALYSIS AND DESIGN",
            "MTH 312 ABSTRACT ALGEBRA 2", "MTH 324 VECTOR AND TENSOR ANALYSIS", "MTH 328 COMPLEX ANALYSIS 2", "MTH 326 REAL ANALYSIS 2", 
            "MTH 314 GEOMETRY 2", "MTH 316 DIFFERENTIAL GEOMETRY", "MTH 338 OPTIMIZATION THEORY 2", "MTH 336 DYNAMICS OF RIGID BODY",
            "MTH 338 SPECIAL THEORY OF RELATIVITY", "MTH 342 DISCRETE MATHEMATICS 2", "MTH 344 NUMERICAL ANALYSIS 2", "STA 312 PROBABILITY 6",
            "STA 332 INFERENCE 6", "COS	332 OPERATING SYSTEM 2",
            
            "MTH 421 ORDINARY DIFFERENTIAL EQUATION", "MTH 429 FUNCTIONAL ANALYSIS", "MTH 425 LEBESGUE MEASURE AND INTEGRATION",
            "MTH 427 FIELD THEORY IN MATHEMATICAL PHYSICS", "MTH 439 ANALYTIC DYNAMICS 2", "MTH 437 SYSTEM THEORY", 
            "MTH 443 NUMERICAL ANALYSIS 2", "MTH 441 MATHEMATICAL METHODS 2", "MTH 428 PARTIAL DIFFERENTIAL EQUATIONS",
            "MTH 424 GENERAL TOPOLOGY", "MTH 412 ABSTRACT 3", "MTH 432 GENERAL THEORY OF RELATIVITY", "MTH 438 ELECTROMAGNETISM",
            "MTH 436 FLUID DYNAMICS", "MTH 434 ELASTICITY", "MTH 444 NUMERICAL ANALYSIS 3"

        };
        
        ArrayList<String> favouriteCourses = new ArrayList<>();

        System.out.println("Select your four favourite courses. Type y for Yes or n for No");
        
        
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(((String[]) courseList)[i] + "[Y/N]");
            value = scan.nextLine();
            while (!(value.toLowerCase().equals("n")) && !(value.toLowerCase().equals("y"))) {
                System.out.println("Invalid selection");
                System.out.println(((String[]) courseList)[i] + "[Y/N]");
                value = scan.nextLine();
            }
            if (value.toLowerCase().equals("y")) {
                favouriteCourses.add(courseList[i].substring(0,3) + "_" + courseList[i].substring(4,7));
                if (++point == 4) break;
            }
        }
       
        return favouriteCourses;

    }

    /***
     * @param level user's current year of study
     * @return list of user's favourite courses 
     * given user's current year of study (@param level)
     ***/
    public ArrayList<String> getFavouriteCourses(int level) {
        ArrayList<String> favouriteCourses = new ArrayList<>();
       switch( level){
                case 1:
                    favouriteCourses = level1();
                    break;
                case 2:
                    favouriteCourses = level2();
                    break;
               case 3:
                    favouriteCourses = level3();
                    break;
                case 4:
                    favouriteCourses = level4();
                    break;
                default:
                     System.out.println("Invalid year of study!");
            }
        return favouriteCourses;
    }

}
