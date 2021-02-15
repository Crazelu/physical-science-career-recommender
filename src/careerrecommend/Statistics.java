package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @authors Egwu Dominion and Onwuzama Isreal
 */
public class Statistics {

    private String value;
    private int point;
    Scanner scan;

    Statistics() {
        scan = new Scanner(System.in);
    }

    /***
     * @return list of user's favourite courses if user is
     * currently in their first year of study
     ***/
    private ArrayList<String> level1() {

        point = 0;
        
        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2", "STA 111 Probability 1", "COS 101 Introduction to computer", 
            "ECO 101 Introduction to Economics", "STA 112 Probability 2",  "ECO 102 Intro to Economics 2", "PHY 191 PRACTICAL PHYSICS 1", "MTH 132 Mechanics", "STA 172 Statistical computing 1"};
        
        
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
        
        
        String[] courseList = new String[]{ "MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2",
            "STA 111 Probability 1", "COS 101 Introduction to computer", "ECO 101 Introduction to Economics", "STA 112 Probability 2", 
            "ECO 102 Intro to Economics 2","PHY 191 PRACTICAL PHYSICS 1", "MTH 132 Mechanics", "STA 172 Statistical computing 1", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1",
            "COS 202 SOFTWARE ENGINEERING 1",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "STA 211 Probability 3", "STA 231 Inference 3", "STA 212",  "MTH 224", "MTH 242", "STA 272" };
        
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
        
        String[] courseList = new String[]{  "MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "STA 131 INFERENCE",
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2",
            "STA 111 Probability 1", "COS 101 Introduction to computer", "ECO 101 Introduction to Economics", "STA 112 Probability 2", 
            "ECO 102 Intro to Economics 2","PHY 191 PRACTICAL PHYSICS 1", "MTH 132 Mechanics", "STA 172 Statistical computing 1", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1",
            "COS 202 SOFTWARE ENGINEERING 1",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "STA 211 Probability 3", "STA 231 Inference 3", "STA 212",  "MTH 224", "MTH 242", "STA 272" ,
            "STA 311 Probability 5", "STA 331 Inference 4", "STA 321 Distribution theory", "STA 323 Analysis of variance", "STA 361 Algebraic basis of statistics",
            "STA 363 Operations Research", "STA 341 Sampling", "STA 371 statistical computing", "CEDR" };
        
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
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2",
            "STA 111 Probability 1", "COS 101 Introduction to computer", "ECO 101 Introduction to Economics", "STA 112 Probability 2", 
            "ECO 102 Intro to Economics 2","PHY 191 PRACTICAL PHYSICS 1", "MTH 132 Mechanics", "STA 172 Statistical computing 1", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1",
            "COS 202 SOFTWARE ENGINEERING 1",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "STA 211 Probability 3", "STA 231 Inference 3", "STA 212",  "MTH 224", "MTH 242", "STA 272" ,
            "STA 311 Probability 5", "STA 331 Inference 4", "STA 321 Distribution theory", "STA 323 Analysis of variance", "STA 361 Algebraic basis of statistics",
            "STA 363 Operations Research", "STA 341 Sampling", "STA 371 statistical computing", "CEDR" , "STA 411 Probability 6", "STA 441 Sampling 2" };
        
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
