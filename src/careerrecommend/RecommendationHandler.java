/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerrecommend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author Crazelu
 */
public class RecommendationHandler {

    int point = 0;

    public void returnCareers(String x) {
        ArrayList<String> departments = new ArrayList<>();
        departments.add("(1) Computer Science");
        departments.add("(2) Statistics");
        departments.add("(3) Mathematics");
        departments.add("(4) Geology");
        departments.add("(5) Physics and Astronomy");
        departments.add("(6) Science Laboratory Technology");
        departments.add("(7) Pure and Industrial Chemistry");
        HashMap map = new HashMap();
        String[] compSci_careers, stat_careers, math_careers, geology_careers, physics_careers, slt_careers, pic_careers;
        compSci_careers = new String[]{"Software Engineering", "Product Design", "Data Science", "Data Analysis", "Database Administration",
            "Cryptography", "Computer and Information Research", "Machine Leatning Engineering"};
        physics_careers = new String[]{"Data Analysis", "Lab Technician", "Geophysics", "Telecommunications Research", "Patent Attorney",
            "Actuary", "Nanotechnology"};
        stat_careers = new String[]{"Data Science", "Data Analysis", "Statistics", "Actuary", "Market Research",
            "Business Analysis", "Machine Learning Engineering"};
        math_careers = new String[]{"Cryptography", "Statistics", "Computer and Information Research", "Economics", "Machine Learning Engineering"
        };
        geology_careers = new String[]{"Environmental Geology", "Geological Survey", "Geochemistry", "Geophysics", "Geotechnical Engineering",
            "Mining Engineering"};
        slt_careers = new String[]{"Scientific Laboratory Technician", "Chemical Technician", "Nuclear Medicine Technology", "Pathology"};
        pic_careers = new String[]{"Analytical Chemistry", "Food Science", "Geochemistry", "Forensic Science", "Material Science",
            "Scientific Laboratory Technician", "Nanotechnology"};
        map.put("Computer Science", compSci_careers);
        map.put("Mathematics", math_careers);
        map.put("Statistics", stat_careers);
        map.put("Physics and Astronomy", physics_careers);
        map.put("Geology", geology_careers);
        map.put("Pure and Industrial Chemistry", pic_careers);
        map.put("Science Laboratory Technology", slt_careers);
        //for (int i=0; i<compSci_careers.length; i++){
        //System.out.println(((String[]) map.get("Computer Science"))[i]);
        //}
        if (x.equals("Computer Science")) {
            map.get("Computer Science");
        } else {
            if (x.equals("Mathematics")) {
                map.get("Mathematics");
            } else {
                if (x.equals("Statistics")) {
                    map.get("Statistics");
                } else {
                    if (x.equals("Physics and Astronomy")) {
                        map.get("Physics and Astronomy");
                    } else {
                        if (x.equals("Geology")) {
                            map.get("Geology");
                        } else {

                            if (x.equals("Pure and Industrial Chemistry")) {
                                map.get("Pure and Industrial Chemistry");
                            } else {
                                if (x.equals("Science Laboratory Technology")) {
                                    map.get("Science Laboratory Technology");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void getChemistryCareerRecommendation(ArrayList<String> userFavouriteCourses) {

        String[] chemCareers = new String[]{"Analytical Chemistry", "Food Science", "Geochemistry", "Forensic Science", "Material Science",
            "Scientific Laboratory Technician", "Nanotechnology"};

        //Create hashmap that maps careers to relevant courses
        HashMap careerToCoursesMap = new HashMap();
        careerToCoursesMap.put("Analytical Chemistry", new String[]{});
        careerToCoursesMap.put("Food Science", new String[]{});
        careerToCoursesMap.put("Geochemistry", new String[]{});
        careerToCoursesMap.put("Forensic Science", new String[]{});
        careerToCoursesMap.put("Material Science", new String[]{});
        careerToCoursesMap.put("Scientific Laboratory Technician", new String[]{});
        careerToCoursesMap.put("Nanotechnology", new String[]{});

        getCareerRecommendation(userFavouriteCourses, careerToCoursesMap, chemCareers);

    }

    public void getComputerScienceCareerRecommendation(ArrayList<String> userFavouriteCourses) {

        //Create hashmap that maps careers to relevant courses
        HashMap careerToCoursesMap = new HashMap();
        careerToCoursesMap.put("Computer and Information Research", new String[]{"MTH_111", "MTH_121", "COS_419"});
        careerToCoursesMap.put("Data Science", new String[]{"STA_131", "STA_132", "MTH_111",
            "MTH_121", "STA_205"});
        careerToCoursesMap.put("Data Analysis", new String[]{"STA_131", "STA_132", "MTH_111",
            "MTH_121", "STA_205"});
        careerToCoursesMap.put("Statistics", new String[]{"STA_131", "STA_132", "STA_205"});
        careerToCoursesMap.put("Machine Learning Engineering & Artificial Intelligence", new String[]{"STA_131", "STA_132", "COS_337", "MTH_111",
            "MTH_121", "COS_436", "COS_428", "COS_431", "COS_232", "STA_205"});
        careerToCoursesMap.put("Market Research", new String[]{"STA_131", "STA_132", "COS_419"});
        //update these mappings below
        careerToCoursesMap.put("Software Engineering", new String[]{"COS_102", "COS_104", "MTH_111", "MTH_121", "COS_202",
            "COS_201", "COS_333", "COS_471", "COS_431", "COS_232"});

        careerToCoursesMap.put("Product Design", new String[]{"COS_435", "COS_437", "COS_204"});
        careerToCoursesMap.put("Database Administration", new String[]{"STA_131", "COS_104", "COS_421"});
        careerToCoursesMap.put("Cryptography", new String[]{"STA_131", "MTH_111", "MTH_121", "MTH_211", "MTH_215", "COS_431"});

        String[] compScienceCareers = new String[]{"Software Engineering", "Product Design", "Data Science", "Data Analysis", "Database Administration",
            "Cryptography", "Computer and Information Research", "Machine Learning Engineering & Artificial Intelligence"};

        getCareerRecommendation(userFavouriteCourses, careerToCoursesMap, compScienceCareers);

    }

    private void getCareerRecommendation(ArrayList<String> userFavouriteCourses, HashMap careerToCoursesMap, String[] careerList) {
        try {

            //loop through each entry of careerToCoursesMap
            //and check if course code corresponds to course codes in the list
            //if it corresponds, adds mapped career to careersToRecommed
            ArrayList<String> careersToRecommed = new ArrayList<>();

            userFavouriteCourses.forEach((String course) -> {
                for (int i = 0; i < careerList.length; i++) {
                    String[] courseCodes = (String[]) careerToCoursesMap.get(careerList[i]);

                    for (int j = 0; j < courseCodes.length; j++) {

                        //if courseCode from courseCodes matches any of the favourite
                        //courses provided, add the mapped career associated with that courseCode
                        //to careersToRecommed
                        if (courseCodes[j].equals(course)) {
                            careersToRecommed.add(careerList[i]);

                        }
                    }
                }

            }
            );

            int numberOfTimesCareerAppeared = 0;
            int temp = 0;
            String recommendedCareer = "";
            for (int i = 0; i < careersToRecommed.size(); i++) {

                for (int j = 0; j < careersToRecommed.size(); j++) {
                    if (careersToRecommed.get(i).equals(careersToRecommed.get(j))) {
                        temp++;
                    }
                }
                if (temp > numberOfTimesCareerAppeared) {
                    numberOfTimesCareerAppeared = temp;
                    recommendedCareer = careersToRecommed.get(i);
                }

            }

            System.out.println("\nYour recommended career is " + recommendedCareer);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
