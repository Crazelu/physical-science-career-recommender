package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crazelu
 */
public class Chemistry {

    private String value;
    private int point;
    Scanner scan;

    Chemistry() {
        scan = new Scanner(System.in);
    }

    public ArrayList<String> level1() {

        point = 0;

        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "CHM 112 BASIC PRINCIPLES OF PHYSICAL CHEMISTRY",
            "CHM 101 BASIC PRINCIPLES OF INORGANIC CHEMISTRY", "CHM 171 BASIC PRACTICAL CHEMISTRY", "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "PHY 191 PRACTICAL PHYSICS 1", "CHM 122 BASIC PRINCIPLES OF ORGANIC CHEMISTRY", "CHM 152 INTRODUCTION TO INDUSTRIAL CHEMISTRY",
            "BIO 151 GENERAL BIOLOGY 1", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "ECO 102 BASIC PRINCIPLES OF ECONOMICS 2"
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
                favouriteCourses.add(courseList[i].substring(0, 3) + "_" + courseList[i].substring(4, 7));
                if (++point == 4) {
                    break;
                }
            }
        }

        return favouriteCourses;
    }

    public ArrayList<String> level2() {

        point = 0;

        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "CHM 112 BASIC PRINCIPLES OF PHYSICAL CHEMISTRY",
            "CHM 101 BASIC PRINCIPLES OF INORGANIC CHEMISTRY", "CHM 171 BASIC PRACTICAL CHEMISTRY", "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "PHY 191 PRACTICAL PHYSICS 1", "CHM 122 BASIC PRINCIPLES OF ORGANIC CHEMISTRY", "CHM 152 INTRODUCTION TO INDUSTRIAL CHEMISTRY",
            "BIO 151 GENERAL BIOLOGY 1", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "ECO 102 BASIC PRINCIPLES OF ECONOMICS 2",
            "CHM 201 GENERAL INORGANIC CHEMISTRY", "CHM 211 GENERAL PHYSICAL CHEMISTRY", "CHM 221 GENERAL ORGANIC CHEMISTRY 1",
            "CHM 273 PRACTICAL ORGANIC CHEMISTRY 1", "MTH 207 ADVANCED MATHEMATICS 7", "STA 203 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING 1",
            "BCH 201 INTRODUCTORY MICROBIOLOGY", "GEO 103 ENVIRONMENTAL, PHYSICAL AND SOCIAL SCIENCES", "ECO 101 PRINCIPLES OF ECONOMICS 1",
            "PHY 251 ELECTROMAGNETISM", "CHM 222 GENERAL ORGANIC CHEMISTRY 2", "CHM 232 ANALYTICAL CHEMISTRY", "CHM 252 CHEMICAL PROCESS PRINCIPLES",
            "CHM 272 PRACTICAL PHYSICAL CHEMISTRY 1", "PRACTICAL INORGANIC CHEMISTRY 1", "MTH 206 ADVANCED MATHEMATICS 7", "BCH 201 GENERAL BIOCHEMISTRY 1",
            "MTH 208 ADVANCED MATHEMATICS 8", "PHM 241 PHARMACOGNOSY 1", "PHY 262 INTRODUCTION TO ATOMIC AND NUCLEAR PHYSICS", "PHY 292 PRACTICAL PHYSICS",
            "STA 206 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING"
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
                favouriteCourses.add(courseList[i].substring(0, 3) + "_" + courseList[i].substring(4, 7));
                if (++point == 4) {
                    break;
                }
            }
        }

        return favouriteCourses;
    }

    public ArrayList<String> level3() {

        point = 0;

        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "CHM 112 BASIC PRINCIPLES OF PHYSICAL CHEMISTRY",
            "CHM 101 BASIC PRINCIPLES OF INORGANIC CHEMISTRY", "CHM 171 BASIC PRACTICAL CHEMISTRY", "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "PHY 191 PRACTICAL PHYSICS 1", "CHM 122 BASIC PRINCIPLES OF ORGANIC CHEMISTRY", "CHM 152 INTRODUCTION TO INDUSTRIAL CHEMISTRY",
            "BIO 151 GENERAL BIOLOGY 1", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "ECO 102 BASIC PRINCIPLES OF ECONOMICS 2",
            "CHM 201 GENERAL INORGANIC CHEMISTRY", "CHM 211 GENERAL PHYSICAL CHEMISTRY", "CHM 221 GENERAL ORGANIC CHEMISTRY 1",
            "CHM 273 PRACTICAL ORGANIC CHEMISTRY 1", "MTH 207 ADVANCED MATHEMATICS 7", "STA 203 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING 1",
            "BCH 201 INTRODUCTORY MICROBIOLOGY", "GEO 103 ENVIRONMENTAL, PHYSICAL AND SOCIAL SCIENCES", "ECO 101 PRINCIPLES OF ECONOMICS 1",
            "PHY 251 ELECTROMAGNETISM", "CHM 222 GENERAL ORGANIC CHEMISTRY 2", "CHM 232 ANALYTICAL CHEMISTRY", "CHM 252 CHEMICAL PROCESS PRINCIPLES",
            "CHM 272 PRACTICAL PHYSICAL CHEMISTRY 1", "PRACTICAL INORGANIC CHEMISTRY 1", "MTH 206 ADVANCED MATHEMATICS 7", "BCH 201 GENERAL BIOCHEMISTRY 1",
            "MTH 208 ADVANCED MATHEMATICS 8", "PHM 241 PHARMACOGNOSY 1", "PHY 262 INTRODUCTION TO ATOMIC AND NUCLEAR PHYSICS", "PHY 292 PRACTICAL PHYSICS",
            "STA 206 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING", "CHM 301 INORGANIC CHEMISTRY 1", "CHM 311 PHYSICAL & STRUCTURAL CHEMISTRY 1",
            "CHM 321 ORGANIC CHEMISTRY 1", "CHM 351 CHEMICAL PROCESS CALCULATIONS", "CHM 373 PRACTICAL ORGANIC CHEMISTRY 2", "CHM 371 PRACTICAL INORGANIC CHEMISTRY 2",
            "381 CHEMICAL INDUSTRY AND ENVIRONMENT", "COS 201 COMPUTER PROGRAMMING", "CHM 302 INORGANIC CHEMISTRY 2", "CHM 312 PHYSICAL & STRUCTURAL CHEMISTRY 2",
            "CHM 314 PHYSICAL & STRUCTURAL CHEMISTRY 3", "CHM 322 ORGANIC CHEMISTRY 2", "CHM 324 ORGANIC CHEMISTRY 3", "CHM 352 CHEMICAL PROCESS TECHNOLOGY 1",
            "CHM 372 PRACTICAL PHYSICAL CHEMISTRY 2", "CMH 374 APPLIED SPECTROSCOPY"
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
                favouriteCourses.add(courseList[i].substring(0, 3) + "_" + courseList[i].substring(4, 7));
                if (++point == 4) {
                    break;
                }
            }
        }

        return favouriteCourses;
    }

    public ArrayList<String> level4() {

        point = 0;

        String[] courseList = new String[]{"MTH 111 ELEMENTARY MATHEMATICS 1", "MTH 121 ELEMENTARY MATHEMATICS 2", "CHM 112 BASIC PRINCIPLES OF PHYSICAL CHEMISTRY",
            "CHM 101 BASIC PRINCIPLES OF INORGANIC CHEMISTRY", "CHM 171 BASIC PRACTICAL CHEMISTRY", "PHY 115 GENERAL PHYSICS FOR PHYSICAL SCIENCES 1",
            "PHY 191 PRACTICAL PHYSICS 1", "CHM 122 BASIC PRINCIPLES OF ORGANIC CHEMISTRY", "CHM 152 INTRODUCTION TO INDUSTRIAL CHEMISTRY",
            "BIO 151 GENERAL BIOLOGY 1", "PHY 118 GENERAL PHYSICS FOR PHYSICAL SCIENCES 3", "ECO 102 BASIC PRINCIPLES OF ECONOMICS 2",
            "CHM 201 GENERAL INORGANIC CHEMISTRY", "CHM 211 GENERAL PHYSICAL CHEMISTRY", "CHM 221 GENERAL ORGANIC CHEMISTRY 1",
            "CHM 273 PRACTICAL ORGANIC CHEMISTRY 1", "MTH 207 ADVANCED MATHEMATICS 7", "STA 203 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING 1",
            "BCH 201 INTRODUCTORY MICROBIOLOGY", "GEO 103 ENVIRONMENTAL, PHYSICAL AND SOCIAL SCIENCES", "ECO 101 PRINCIPLES OF ECONOMICS 1",
            "PHY 251 ELECTROMAGNETISM", "CHM 222 GENERAL ORGANIC CHEMISTRY 2", "CHM 232 ANALYTICAL CHEMISTRY", "CHM 252 CHEMICAL PROCESS PRINCIPLES",
            "CHM 272 PRACTICAL PHYSICAL CHEMISTRY 1", "PRACTICAL INORGANIC CHEMISTRY 1", "MTH 206 ADVANCED MATHEMATICS 7", "BCH 201 GENERAL BIOCHEMISTRY 1",
            "MTH 208 ADVANCED MATHEMATICS 8", "PHM 241 PHARMACOGNOSY 1", "PHY 262 INTRODUCTION TO ATOMIC AND NUCLEAR PHYSICS", "PHY 292 PRACTICAL PHYSICS",
            "STA 206 STATISTICS FOR PHYSICAL SCIENCES AND ENGINEERING", "CHM 301 INORGANIC CHEMISTRY 1", "CHM 311 PHYSICAL & STRUCTURAL CHEMISTRY 1",
            "CHM 321 ORGANIC CHEMISTRY 1", "CHM 351 CHEMICAL PROCESS CALCULATIONS", "CHM 373 PRACTICAL ORGANIC CHEMISTRY 2", "CHM 371 PRACTICAL INORGANIC CHEMISTRY 2",
            "381 CHEMICAL INDUSTRY AND ENVIRONMENT", "COS 201 COMPUTER PROGRAMMING", "CHM 302 INORGANIC CHEMISTRY 2", "CHM 312 PHYSICAL & STRUCTURAL CHEMISTRY 2",
            "CHM 314 PHYSICAL & STRUCTURAL CHEMISTRY 3", "CHM 322 ORGANIC CHEMISTRY 2", "CHM 324 ORGANIC CHEMISTRY 3", "CHM 352 CHEMICAL PROCESS TECHNOLOGY 1",
            "CHM 372 PRACTICAL PHYSICAL CHEMISTRY 2", "CMH 374 APPLIED SPECTROSCOPY", "CHM 401 ADVANCED INORGANIC CHEMISTRY 1", "CHM 411 ADVANCED PHYSICAL CHEMISTRY 1",
            "CHM 421 ADVANCED ORGANIC CHEMISTRY 1", "CHM 431 MODERN ANALYTICAL TECHNIQUES", "CHM 451 CHEMICAL PROCESS TECHNOLOGY 2", "CHM 471 PRACTICAL INDUSTRIAL CHEMISTRY",
            "CHM 402 ADVANCED INORGANIC CHEMISTRY 2", "CHM 412 ADVANCED PHYSICAL CHEMISTRY 2", "CHM 422 ADVANCED ORGANIC CHEMISTRY 2", "CHM 452 CHEMICAL PROCESS TECHNOLOGY 3",};

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
                favouriteCourses.add(courseList[i].substring(0, 3) + "_" + courseList[i].substring(4, 7));
                if (++point == 4) {
                    break;
                }
            }
        }

        return favouriteCourses;
    }

    public ArrayList<String> getFavouriteCourses(int level) {
        ArrayList<String> favouriteCourses = new ArrayList<>();

        switch (level) {
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
