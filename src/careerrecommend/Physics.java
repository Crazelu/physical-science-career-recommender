package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @authors Olugbemi Daniel and Maduka Raphael
 */

public class Physics {

    private String value;
    private int point;
    Scanner scan;

    Physics() {
        scan = new Scanner(System.in);
    }

    /**
     * *
     * @return list of user's favourite courses if user is currently in their
     * first year of study
     **
     */
    private ArrayList<String> level1() {

        point = 0;

        String[] courseList = new String[]{"PHY 121 Fundamentals of Physics I",
            "PHY 195 Practical Physics II",
            "MTH 111 General Mathematics  I",
            "MTH 121 General  Mathematics II",
            "CHM 101 Basic Principles of Chemistry 1",
            "CHM 171 Basic Practical Chemistry",
            "GSP 101 The Use of English I",
            "PHY 122 Fundamentals of Physics II",
            "PHY 124 Fundamentals of Physics III",
            "PHY 196 Practical Physics III ",
            "MTH 122  General Mathematics III",
            "CHM 112 Basic Principles of Chemistry II",
            "CHM 122 Basic Principles of Chemistry III",};

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

    /**
     * *
     * @return list of user's favourite courses if user is currently in their
     * second year of study
     **
     */
    private ArrayList<String> level2() {

        point = 0;

        String[] courseList = new String[]{
            "PHY 121 Fundamentals of Physics I",
            "PHY 195 Practical Physics II",
            "MTH 111 General Mathematics  I",
            "MTH 121 General  Mathematics II",
            "CHM 101 Basic Principles of Chemistry 1",
            "CHM 171 Basic Practical Chemistry",
            "GSP 101 The Use of English I",
            "PHY 122 Fundamentals of Physics II",
            "PHY 124 Fundamentals of Physics III",
            "PHY 196 Practical Physics III ",
            "MTH 122  General Mathematics III",
            "CHM 112 Basic Principles of Chemistry II",
            "CHM 122 Basic Principles of Chemistry III",
            "PHY 211 Structure of Matter",
            "PHY 221 Mechanics ",
            "PHY 241 Waves ",
            "PHY 251 Electromagnetism",
            "MTH 207 Advanced Mathematics ",
            "COS 201 Computer Programming I	",
            "PHY 242 Physical Optics",
            "PHY 262 Introduction to Atomic & Nuclear Physics",
            "PHY 292 Practical Physics IV",
            "MTH 206 Advanced Mathematics VII",
            "MTH 208 Advanced Mathematics VIII",};

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

    /**
     * *
     * @return list of user's favourite courses if user is currently in their
     * third year of study
     **
     */
    private ArrayList<String> level3() {

        point = 0;

        String[] courseList = new String[]{
            "PHY 121 Fundamentals of Physics I",
            "PHY 195 Practical Physics II",
            "MTH 111 General Mathematics  I",
            "MTH 121 General  Mathematics II",
            "CHM 101 Basic Principles of Chemistry 1",
            "CHM 171 Basic Practical Chemistry",
            "GSP 101 The Use of English I",
            "PHY 122 Fundamentals of Physics II",
            "PHY 124 Fundamentals of Physics III",
            "PHY 196 Practical Physics III ",
            "MTH 122  General Mathematics III",
            "CHM 112 Basic Principles of Chemistry II",
            "CHM 122 Basic Principles of Chemistry III",
            "PHY 211 Structure of Matter",
            "PHY 221 Mechanics ",
            "PHY 241 Waves ",
            "PHY 251 Electromagnetism",
            "MTH 207 Advanced Mathematics ",
            "COS 201 Computer Programming I	",
            "PHY 242 Physical Optics",
            "PHY 262 Introduction to Atomic & Nuclear Physics",
            "PHY 292 Practical Physics IV",
            "MTH 206 Advanced Mathematics VII",
            "MTH 208 Advanced Mathematics VIII",
            "PHY 301 Methods of Theoretical Physics I",
            "PHY 311 Solid State Physics I ",
            "PHY 321 Relativity Physics ",
            "PHY 331 Thermal Physics ",
            "PHY 351 Electronics ",
            "PHY 391 Practical Physics V ",
            "PHY 393 Workshop Course I(Mechanical) ",
            "EEE 211 Electrical Engineering I ",
            "ECE 311 Circuit Theory I ",
            "ECE 321 Physical Electronics ",
            "CHM 211 General Physical Chemistry ",
            "GLG 211 Crystallography ",
            "STA 203 Statistics for Physical Sciences & Engineering I ",
            "STA 322 Regression Analysis ",
            "PHY 302 Methods of Theoretical Physics II",
            "PHY 362 Quantum Mechanics I ",
            "PHY 382 An Introduction to Nanoscience and Nanotechnology ",
            "PHY 392 Practical Physics VI",
            "PHY 394 Workshop Course I (Electronics) ",
            "PHY 396 Measurements and Instrumentation ",
            "COS 202 Computer Programming II ",
            "EEE 251 Electrical Engineering Lab ",
            "ECE 312 Circuit Theory II ",
            "ECE 322 Applied Electronics ",
            "CHM 251 Chemical Process Principles ",
            "MTH 222 Elementary Differential Equations I ",
            "MTH 214 Mathematical Methods I ",
            "STA 206 Mathematical Methods I ",};

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

    /**
     * *
     * @return list of user's favourite courses if user is currently in their
     * fourth year of study
     **
     */
    private ArrayList<String> level4() {

        point = 0;

        String[] courseList = new String[]{
            "PHY 121 Fundamentals of Physics I",
            "PHY 195 Practical Physics II",
            "MTH 111 General Mathematics  I",
            "MTH 121 General  Mathematics II",
            "CHM 101 Basic Principles of Chemistry 1",
            "CHM 171 Basic Practical Chemistry",
            "GSP 101 The Use of English I",
            "PHY 122 Fundamentals of Physics II",
            "PHY 124 Fundamentals of Physics III",
            "PHY 196 Practical Physics III ",
            "MTH 122  General Mathematics III",
            "CHM 112 Basic Principles of Chemistry II",
            "CHM 122 Basic Principles of Chemistry III",
            "PHY 211 Structure of Matter",
            "PHY 221 Mechanics ",
            "PHY 241 Waves ",
            "PHY 251 Electromagnetism",
            "MTH 207 Advanced Mathematics ",
            "COS 201 Computer Programming I	",
            "PHY 242 Physical Optics",
            "PHY 262 Introduction to Atomic & Nuclear Physics",
            "PHY 292 Practical Physics IV",
            "MTH 206 Advanced Mathematics VII",
            "MTH 208 Advanced Mathematics VIII",
            "PHY 301 Methods of Theoretical Physics I",
            "PHY 311 Solid State Physics I ",
            "PHY 321 Relativity Physics ",
            "PHY 331 Thermal Physics ",
            "PHY 351 Electronics ",
            "PHY 391 Practical Physics V ",
            "PHY 393 Workshop Course I(Mechanical) ",
            "EEE 211 	Electrical Engineering I ",
            "ECE 311 Circuit Theory I ",
            "ECE 321 Physical Electronics ",
            "CHM 211 General Physical Chemistry ",
            "GLG 211 Crystallography ",
            "STA 203 Statistics for Physical Sciences & Engineering I ",
            "STA 322 Regression Analysis ",
            "PHY 302 Methods of Theoretical Physics II",
            "PHY 362 Quantum Mechanics I ",
            "PHY 382 An Introduction to Nanoscience and Nanotechnology ",
            "PHY 392 Practical Physics VI",
            "PHY 394 Workshop Course I (Electronics) ",
            "PHY 396 Measurements and Instrumentation ",
            "COS 202 Computer Programming II ",
            "EEE 251 Electrical Engineering Lab ",
            "ECE 312 Circuit Theory II ",
            "ECE 322 Applied Electronics ",
            "CHM 251 Chemical Process Principles ",
            "MTH 222 Elementary Differential Equations I ",
            "MTH 214 Mathematical Methods I ",
            "STA 206 Mathematical Methods I ",
            "PHY 401 Computational Physics 2",
            "PHY 403 General Physics ",
            "PHY 421 Analytical Mechanics ",
            "PHY 451 Electromagnetic Theory",
            "PHY 461 Quantum Mechanics II ",
            "PHY 491 Practical Physics VII ",
            "PHY 485 Galaxies  ",
            "PHY 487 High Energy Astrophysics ",
            "PHY 487 Meteorology ",
            "PHY 475 Industrial Geophysics ",
            "PHY 415 Science of Materials ",
            "PHY 475 Industrial Geophysics ",
            "PHY 441 Solar Energy I",
            "PHY 443 Biomas Energy ",
            "PHY 445 Nuclear Energy I",
            "PHY 416 Solid State Physics ",
            "PHY 438 Statistical Physics ",
            "PHY 462 Nuclear Physics ",
            "PHY 492 Practical Physics VIII ",
            "PHY 494 Project ",
            "PHY 486 Stellar Structure and Evolution ",
            "PHY 488 Modern Cosmology ",
            "PHY 472 Aeronomy ",
            "PHY 476 Physics of the Earth’s Interior ",
            "PHY 418 Physical Metallurgy ",
            "PHY 414 Introduction to Processes ",
            "PHY 456 Industrial Electronics ",
            "PHY 442 Solar Energy ",
            "PHY 444 Fossil Energy ",
            "PHY 446 Nuclear Energy II ",};

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

    /**
     * *
     * @param level user's current year of study
     * @return list of user's favourite courses given user's current year of
     * study (@param level)
     **
     */
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
