package careerrecommend;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crazelu Credits goes to Ezeifeanyi Neche for data used in this class
 */
public class Geology {

    private String value;
    private int point;
    Scanner scan;

    Geology() {
        scan = new Scanner(System.in);
    }

    /**
     * *
     * @return list of user's favourite courses if user is currently in their
     * first year of study *
     */
    private ArrayList<String> level1() {

        point = 0;

        String[] courseList = new String[]{
            "GLG 111 Physical Geology", "BIO 151 General Biology 1", "CHM 101 Basic Principles of Inorganic Chemistry",
            "MTH 111 Elementary Mathematics I", "MTH 121 Elementary Mathematics II",
            "PHY 115 General Physics for Physical Sciences I", "PHY 191 Practical Physics I",
            "FRE 101 Elementary French I", "PHY 121 Fundamental of Physics", "GLG 142 Earth History",
            "BIO 152 General Biology II", "CHM 112 Basic Principles of Physical Chemistry II",
            "CHM 122 Basic Principles of Organic Chemistry", "PHY 116 General Physics For Physical Sciences II",
            "PHY 118 General Physics For Physical Sciences III", "FRE 102 Elementary French II",
            "MTH 122 Elementary Mathematics III",};

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
     * second year of study *
     */
    private ArrayList<String> level2() {
        point = 0;

        String[] courseList = new String[]{
            "GLG 111 Physical Geology", "BIO 151 General Biology 1", "CHM 101 Basic Principles of Inorganic Chemistry",
            "MTH 111 Elementary Mathematics I", "MTH 121 Elementary Mathematics II",
            "PHY 115 General Physics for Physical Sciences I", "PHY 191 Practical Physics I",
            "FRE 101 Elementary French I", "PHY 121 Fundamental of Physics", "GLG 142 Earth History",
            "BIO 152 General Biology II", "CHM 112 Basic Principles of Physical Chemistry II",
            "CHM 122 Basic Principles of Organic Chemistry", "PHY 116 General Physics For Physical Sciences II",
            "PHY 118 General Physics For Physical Sciences III", "FRE 102 Elementary French II",
            "MTH 122 Elementary Mathematics III",
            "GLG 211 Crystallography and Mineralogy", "GLG 251 Field Geology", "CHM 171 Basic Practical Chemistry",
            "CHM 211 General Physical Chemistry", "COS 101 Introduction to Computer Science",
            "STA 205 Statistics for Physical Sciences and Engineering I", "FRE 201 Intermediate French I",
            "MTH 208 Advanced Mathematics III", "PHY 221 Mechanics", "GLG 212 Optical Mineralogy",
            "GLG 214 Introduction to Petrology of Igneous and Metamorphic Rocks", "GLG 222 Structural Geology/Map Interpretation",
            "GLG 242 Palaebiology I", "CHM 232 Analytical Chemistry", "STA 206 Statistics For Physical Sciences and Engineering II",
            "FRE 202 Intermediate French II", "MTH 204 Advanced Mathematics IV"};

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
     * third year of study *
     */
    private ArrayList<String> level3() {
        point = 0;

        String[] courseList = new String[]{
            "GLG 111 Physical Geology", "BIO 151 General Biology 1", "CHM 101 Basic Principles of Inorganic Chemistry",
            "MTH 111 Elementary Mathematics I", "MTH 121 Elementary Mathematics II",
            "PHY 115 General Physics for Physical Sciences I", "PHY 191 Practical Physics I",
            "FRE 101 Elementary French I", "PHY 121 Fundamental of Physics", "GLG 142 Earth History",
            "BIO 152 General Biology II", "CHM 112 Basic Principles of Physical Chemistry II",
            "CHM 122 Basic Principles of Organic Chemistry", "PHY 116 General Physics For Physical Sciences II",
            "PHY 118 General Physics For Physical Sciences III", "FRE 102 Elementary French II",
            "MTH 122 Elementary Mathematics III",
            "GLG 211 Crystallography and Mineralogy", "GLG 251 Field Geology", "CHM 171 Basic Practical Chemistry",
            "CHM 211 General Physical Chemistry", "COS 101 Introduction to Computer Science",
            "STA 205 Statistics for Physical Sciences and Engineering I", "FRE 201 Intermediate French I",
            "MTH 208 Advanced Mathematics III", "PHY 221 Mechanics", "GLG 212 Optical Mineralogy",
            "GLG 214 Introduction to Petrology of Igneous and Metamorphic Rocks", "GLG 222 Structural Geology/Map Interpretation",
            "GLG 242 Palaebiology I", "CHM 232 Analytical Chemistry", "STA 206 Statistics For Physical Sciences and Engineering II",
            "FRE 202 Intermediate French II", "MTH 204 Advanced Mathematics IV",
            "GLG 311 Petrology of Igneous Rocks", "GLG 321 Structural Geology II",
            "GLG 331 Stratigraphy", "GLG 351 Field Mapping and Surveying", "CED 341 Introduction to Entrepreneurship",
            "COS 201 Computer Programming I", "PHY 331 Thermal Physics", "PHY 251 Electromagnetism",
            "CHM 311 Physical and Structural Chemistry I", "GLG 322 Aerogeology and Remote Sensing",
            "GLG 332 Sedimentology", "GLG 334 Geology Of Nigeria", "GLG 342 Palaebiology II (Micropaleontology)",
            "GLG 362 Mineral Resources", "GLG 364 Mining Geology", "GLG 372 Principles of Geophysics",
            "GLG 382 Engineering Geology I", "CED 342 Business Development and Management", "CVE 342 Soil Mechanics",
            "COS 202 Computer Programming II", "MTH 216 Elementary Differential Equations I",};

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
     * fourth year of study *
     */
    private ArrayList<String> level4() {
        point = 0;

        String[] courseList = new String[]{
            "GLG 111 Physical Geology", "BIO 151 General Biology 1", "CHM 101 Basic Principles of Inorganic Chemistry",
            "MTH 111 Elementary Mathematics I", "MTH 121 Elementary Mathematics II",
            "PHY 115 General Physics for Physical Sciences I", "PHY 191 Practical Physics I",
            "FRE 101 Elementary French I", "PHY 121 Fundamental of Physics", "GLG 142 Earth History",
            "BIO 152 General Biology II", "CHM 112 Basic Principles of Physical Chemistry II",
            "CHM 122 Basic Principles of Organic Chemistry", "PHY 116 General Physics For Physical Sciences II",
            "PHY 118 General Physics For Physical Sciences III", "FRE 102 Elementary French II",
            "MTH 122 Elementary Mathematics III",
            "GLG 211 Crystallography and Mineralogy", "GLG 251 Field Geology", "CHM 171 Basic Practical Chemistry",
            "CHM 211 General Physical Chemistry", "COS 101 Introduction to Computer Science",
            "STA 205 Statistics for Physical Sciences and Engineering I", "FRE 201 Intermediate French I",
            "MTH 208 Advanced Mathematics III", "PHY 221 Mechanics", "GLG 212 Optical Mineralogy",
            "GLG 214 Introduction to Petrology of Igneous and Metamorphic Rocks", "GLG 222 Structural Geology/Map Interpretation",
            "GLG 242 Palaebiology I", "CHM 232 Analytical Chemistry", "STA 206 Statistics For Physical Sciences and Engineering II",
            "FRE 202 Intermediate French II", "MTH 204 Advanced Mathematics IV",
            "GLG 311 Petrology of Igneous Rocks", "GLG 321 Structural Geology II",
            "GLG 331 Stratigraphy", "GLG 351 Field Mapping and Surveying", "CED 341 Introduction to Entrepreneurship",
            "COS 201 Computer Programming I", "PHY 331 Thermal Physics", "PHY 251 Electromagnetism",
            "CHM 311 Physical and Structural Chemistry I", "GLG 322 Aerogeology and Remote Sensing",
            "GLG 332 Sedimentology", "GLG 334 Geology Of Nigeria", "GLG 342 Palaebiology II (Micropaleontology)",
            "GLG 362 Mineral Resources", "GLG 364 Mining Geology", "GLG 372 Principles of Geophysics",
            "GLG 382 Engineering Geology I", "CED 342 Business Development and Management", "CVE 342 Soil Mechanics",
            "COS 202 Computer Programming II", "MTH 216 Elementary Differential Equations I",
            "GLG 411 Petrology of Metamorphic Rocks", "GLG 431 Sequence Stratigraphy", "GLG 433 Regional Geology",
            "GLG 443 Introduction to Palynology", "GLG 453 Petrophysics I", "GLG 461 Economic Geology",
            "GLG 465 Environmental Geology and Waste Management", "CVE 221 Fluid Mechanics",
            "PHY 351 Electronics", "STA 341 Sampling Theory and Survey Methods"};

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
     * fifth year of study *
     */
    private ArrayList<String> level5() {
        point = 0;

        String[] courseList = new String[]{
            "GLG 111 Physical Geology", "BIO 151 General Biology 1", "CHM 101 Basic Principles of Inorganic Chemistry",
            "MTH 111 Elementary Mathematics I", "MTH 121 Elementary Mathematics II",
            "PHY 115 General Physics for Physical Sciences I", "PHY 191 Practical Physics I",
            "FRE 101 Elementary French I", "PHY 121 Fundamental of Physics", "GLG 142 Earth History",
            "BIO 152 General Biology II", "CHM 112 Basic Principles of Physical Chemistry II",
            "CHM 122 Basic Principles of Organic Chemistry", "PHY 116 General Physics For Physical Sciences II",
            "PHY 118 General Physics For Physical Sciences III", "FRE 102 Elementary French II",
            "MTH 122 Elementary Mathematics III",
            "GLG 211 Crystallography and Mineralogy", "GLG 251 Field Geology", "CHM 171 Basic Practical Chemistry",
            "CHM 211 General Physical Chemistry", "COS 101 Introduction to Computer Science",
            "STA 205 Statistics for Physical Sciences and Engineering I", "FRE 201 Intermediate French I",
            "MTH 208 Advanced Mathematics III", "PHY 221 Mechanics", "GLG 212 Optical Mineralogy",
            "GLG 214 Introduction to Petrology of Igneous and Metamorphic Rocks", "GLG 222 Structural Geology/Map Interpretation",
            "GLG 242 Palaebiology I", "CHM 232 Analytical Chemistry", "STA 206 Statistics For Physical Sciences and Engineering II",
            "FRE 202 Intermediate French II", "MTH 204 Advanced Mathematics IV",
            "GLG 311 Petrology of Igneous Rocks", "GLG 321 Structural Geology II",
            "GLG 331 Stratigraphy", "GLG 351 Field Mapping and Surveying", "CED 341 Introduction to Entrepreneurship",
            "COS 201 Computer Programming I", "PHY 331 Thermal Physics", "PHY 251 Electromagnetism",
            "CHM 311 Physical and Structural Chemistry I", "GLG 322 Aerogeology and Remote Sensing",
            "GLG 332 Sedimentology", "GLG 334 Geology Of Nigeria", "GLG 342 Palaebiology II (Micropaleontology)",
            "GLG 362 Mineral Resources", "GLG 364 Mining Geology", "GLG 372 Principles of Geophysics",
            "GLG 382 Engineering Geology I", "CED 342 Business Development and Management", "CVE 342 Soil Mechanics",
            "COS 202 Computer Programming II", "MTH 216 Elementary Differential Equations I",
            "GLG 411 Petrology of Metamorphic Rocks", "GLG 431 Sequence Stratigraphy", "GLG 433 Regional Geology",
            "GLG 443 Introduction to Palynology", "GLG 453 Petrophysics I", "GLG 461 Economic Geology",
            "GLG 465 Environmental Geology and Waste Management", "CVE 221 Fluid Mechanics",
            "PHY 351 Electronics", "STA 341 Sampling Theory and Survey Methods",
            "GLG 511 Petrology of Igneous and Metamorphic Rocks", "GLG 541 Biostratigraphy",
            "GLG 553 Petrophysics II", "GLG 571 Applied Geophysics", "GLG 581 Hydro Geology",
            "GLG 583 Engineering Geology II", "PHY 471 Physics of Geomagnetic Phenomenon",
            "STA 413 Time Series I", "GLG 512 Geochemistry", "GLG 562 Marine Geology",
            "GLG 572 Petroleum Geology", "GLG 574 Tectonophysics", "CHM 586 Chemistry of Coal and Coal Products"
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

    /**
     * *
     * @param level user's current year of study
     * @return list of user's favourite courses given user's current year of
     * study (@param level) *
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
            case 5:
                favouriteCourses = level5();
                break;
            default:
                System.out.println("Invalid year of study!");
        }
        return favouriteCourses;
    }

}
