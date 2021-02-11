package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crazelu
 */
public class ComputerScience {

    private String value;
    private int point;
    Scanner scan;

    ComputerScience() {
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
            "MTH 122 ELEMENTARY MATHEMATICS 3",
            "COS 104 INTRODUCTION TO DATABASE SYSTEMS", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2"};
        
        
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
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3",
            "COS 104 INTRODUCTION TO DATABASE SYSTEMS", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING", "COS 203 INTODUCTION TO MICROCOMPUTER SYSTEMS",
            "COS 231 ASSEMBLY LANGUAGE PROGRAMMING", "STA 205 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 1", "EEE 211 BASIC ELECTRICAL ENGINEERING",
            "COS 202 SOFTWARE ENGINEERING 1", "COS 204 INTODUCTION TO DIGITAL SYSTEM DESIGN", "COS 232 DATA STRUCTURES", "COS 242 DATA AND COMPUTER COMMUNICATION",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
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
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3",
            "COS 104 INTRODUCTION TO DATABASE SYSTEMS", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING", "COS 203 INTODUCTION TO MICROCOMPUTER SYSTEMS",
            "COS 231 ASSEMBLY LANGUAGE PROGRAMMING", "STA 205 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 1", "EEE 211 BASIC ELECTRICAL ENGINEERING",
            "COS 202 SOFTWARE ENGINEERING 1", "COS 204 INTODUCTION TO DIGITAL SYSTEM DESIGN", "COS 232 DATA STRUCTURES", "COS 242 DATA AND COMPUTER COMMUNICATION",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "COS 311 SWITCHING ALGEBRA AND DISCRETE STRUCURES", "COS 331 OPERATING SYSTEMS", "COS 333 SOFTWARE ENGINEERING 2",
            "COS 332 AUTOMATA THEORY AND FORMAL LANGUAGES", "COS 337 ARTIFICIAL INTELLIGIENCE 1", "COS 341 COMPUTER ARCHITECTURE",
            "COS 351 LABORATORY FOR DIGITAL SYSTEM DESIGN"
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
            "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "COS 102 COMPUTING PRACTICE", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "PHY 116 GENERAL PHYSICS FOR PHYSICAL SCIENCES 2",
            "MTH 122 ELEMENTARY MATHEMATICS 3",
            "COS 104 INTRODUCTION TO DATABASE SYSTEMS", "STA 172 STATISTICAL COMPUTING 1", "STA 132 INFERENCE 2", "MTH 211 SET LOGIC AND ALGEBRA",
            "MTH 215 LINEAR ALGEBRA 1", "MTH 221 REAL ANALYSIS 1", "COS 201 COMPUTER PROGRAMMING", "COS 203 INTODUCTION TO MICROCOMPUTER SYSTEMS",
            "COS 231 ASSEMBLY LANGUAGE PROGRAMMING", "STA 205 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 1", "EEE 211 BASIC ELECTRICAL ENGINEERING",
            "COS 202 SOFTWARE ENGINEERING 1", "COS 204 INTODUCTION TO DIGITAL SYSTEM DESIGN", "COS 232 DATA STRUCTURES", "COS 242 DATA AND COMPUTER COMMUNICATION",
            "MTH 216 LINEAR ALGEBRA 2", "STA 206 STATISTICS FOR PHYSICAL SCIENCES & ENGINEERING 2", "MTH 222 ELEMENTARY DIFFERENTIAL EQUATIONS",
            "MTH 242 MATHEMATICAL METHODS", "COS 311 SWITCHING ALGEBRA AND DISCRETE STRUCURES", "COS 331 OPERATING SYSTEMS", "COS 333 SOFTWARE ENGINEERING 2",
            "COS 332 AUTOMATA THEORY AND FORMAL LANGUAGES", "COS 337 ARTIFICIAL INTELLIGIENCE 1", "COS 341 COMPUTER ARCHITECTURE",
            "COS 351 LABORATORY FOR DIGITAL SYSTEM DESIGN", "COS 417 COMPUTER SYSTEM PERFORMANCE EVALUATION", "COS 419 OPERATIONS RESEARCH", "COS 421 DATABASE DESIGN AND MANAGEMENT",
            "COS 431 ALGORITHMS', 'COS 435 COMPUTER GRAPHICS AND ANIMATION", "COS 441 ADVANCED COMPUTER NETWORKS", "COS 463 STRUCTURED PROGRAMMING",
            "COS 411 NUMERICAL METHODS", "COS 413 SYSTEMS MODELLING & SIMULATION", "COS 415 COMPUTER PROCESS CONTROL", "COS 437 PROJECT MANAGEMENT",
            "COS 439 GAMING PROGRAMMING", "COS 461 ORGANIZATION OF PROGRAMMING LANGUAGES", "COS 471 WEB APPLICATION DEVELOPMENT", "COS 438 ARTIFICIAL INTELLIGENCE 2",
            "COS 452 ADVANCED DIGITAL LABORATORY", "COS 434 COMPILER CONSTRUCTION", "COS 436 EXPERT SYSTEMS", "COS 442 MOBILE COMMUNICATIONS",
            "COS 444 COMPUTER NETWORK SECURITY", "COS 464 CONCURRENT PROGRAMMING"
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