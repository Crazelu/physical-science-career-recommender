/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package careerrecommend;

import java.util.ArrayList;
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

        String[] chemCareers = new String[]{"Chemical Analysis", "Food Science", "Geochemistry", "Forensic Science", "Material Science",
            "Scientific Laboratory Technician", "Nanotechnology", "Petroleum Engineering",
            "Chemical Manufacturing", "Pharmacology", "Biotechnology"};

        //Create hashmap that maps careers to relevant courses
        HashMap careerToCoursesMap = new HashMap();

        careerToCoursesMap.put("Chemical Analysis", new String[]{"CHM_431", "CHM_314", "CHM_152", "MTH_111",
            "MTH_121", "CHM_322", "CMH_374", "CHM_211", "CHM_101"});

        careerToCoursesMap.put("Food Science", new String[]{"BCH_201", "CHM_152", "CHM_352"});

        careerToCoursesMap.put("Geochemistry", new String[]{"GEO_103", "CHM_381", "CHM_272", "CHM_314", "PHY_251", "CHM_211"});

        careerToCoursesMap.put("Forensic Science", new String[]{"BCH_201", "CHM_314", "PHM_241", "CHM_322", "CHM_352"});

        careerToCoursesMap.put("Pharmacology", new String[]{"BCH_201", "CHM_314", "PHM_241"});

        careerToCoursesMap.put("Biotechnology", new String[]{"BCH_201", "CHM_314", "PHM_241", "BIO_151", "CHM_322"});

        careerToCoursesMap.put("Material Science", new String[]{"CHM_272", "CHM_152", "MTH_111", "MTH_121", "PHY_115", "CHM_211", "CHM_101"});

        careerToCoursesMap.put("Scientific Laboratory Technician", new String[]{"CHM_351", "COS_201",
            "CHM_431", "CHM_314", "PHY_251", "CHM_101"});

        careerToCoursesMap.put("Nanotechnology", new String[]{"CHM_122", "CHM_101", "CHM_273", "CHM_201",
            "CHM_431", "PHY_262", "CHM_272", "CHM_314", "PHY_118", "PHY_251", "MTH_111", "MTH_121", "CMH_374",
            "CHM_352", "CHM_101"});

        careerToCoursesMap.put("Chemical Manufacturing", new String[]{"CHM_314", "CHM_321", "CHM_322", "CHM_431",
            "CHM_152", "MTH_111", "MTH_121", "CHM_352", "CHM_211", "CHM_101"});

        careerToCoursesMap.put("Petroleum Engineering", new String[]{"CHM_314", "CHM_321", "CHM_381", "CHM_322",
            "CHM_431", "CHM_152", "MTH_111", "MTH_121", "CHM_352", "CHM_211", "CHM_101"});

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

    //Contributed by Egwu Dominion and Onwuzama Isreal
    public void getStatisticsCareerRecommendation(ArrayList<String> userFavouriteCourses) {

        //Create hashmap that maps careers to relevant courses
        HashMap careerToCoursesMap = new HashMap();
        careerToCoursesMap.put("Data Science", new String[]{"COS_102", "STA_131", "STA_172", "STA_371"});
        careerToCoursesMap.put("Data Analysis", new String[]{"STA_131", "STA_132", "MTH_111",
            "MTH_121", "STA_205"});
        careerToCoursesMap.put("Statistics", new String[]{"STA_131", "STA_132", "STA_205"});
        careerToCoursesMap.put("Actuary", new String[]{"STA_132", "COS_101", "MTH_211", "STA_441"});
        careerToCoursesMap.put("Market Research", new String[]{"STA_131", "STA_132", "STA_172", "STA_363", "STA_411"});
        careerToCoursesMap.put("Business Analysis", new String[]{"ECO_101", "STA_363", "STA_331", "STA_172"});
        careerToCoursesMap.put("Economics", new String[]{"ECO_101", "ECO_102", "STA_371", "STA_411", "STA_441"});
        careerToCoursesMap.put("Database Administration", new String[]{"STA_131", "COS_104", "STA_371", "STA_321"});
        careerToCoursesMap.put("Financial Analysis", new String[]{"STA_371", "MTH_111", "ECO_101", "COS_101"});
        careerToCoursesMap.put("Risk Analysis", new String[]{"STA_371", "MTH_132", "STA_323", "STA_321", "STA_363"});

        String[] statisticsCareers = new String[]{"Data Science", "Data Analysis", "Statistics", "Actuary", "Market Research", "Business Analysis",
            "Economics", "Financial Analysis", "Database Administration", "Risk Analysis"};

        getCareerRecommendation(userFavouriteCourses, careerToCoursesMap, statisticsCareers);

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

            if (recommendedCareer.isEmpty()) {
                System.out.println("\nThere's no recommendation for you at the moment. Check again.");
            } else {
                System.out.println("\nYour recommended career is " + recommendedCareer);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }


    //Contributed by Ebiobowei Weyinmomoemi
    public void getMathematicsCareerRecommendation(ArrayList<String> userFavouriteCourses){
        String[] mathCareers = new String[]{"Cryptography", "Statistics", "Computer and Information Research", "Banking and Finance", 
            "Machine Learning Engineering", "Meteorology"};

        //Create hashmap that maps careers to relevant courses
        HashMap careerToCoursesMap = new HashMap();

        careerToCoursesMap.put("Cryptography", new String[]{"MTH_111", "MTH_121","MTH_122", "COS_201", "COS_101", "MTH_242", "MTH_337"});

        careerToCoursesMap.put("Statistics", new String[]{"STA_205", "STA_206", "STA_111", "STA_131", "MTH_121", "MTH_111",
            "MTH_122", "STA_112", "STA_132", "STA_211", "STA_311", "STA_321", "STA_331", "STA_312", "STA_332"});

        careerToCoursesMap.put("Computer and Information Research", new String[]{"COS_101", "COS_201", "COS_333", "C0S_332", "MTH_111",
            "MTH_121", "MTH_211", "STA_131", "STA_132", "MTH_122"});

        careerToCoursesMap.put("Banking and Finance", new String[]{"MTH_111", "MTH_121", "MTH_122", "STA_131", "STA_132", "MTH_224", "MTH_341"});

        careerToCoursesMap.put("Machine Learning Engineering", new String[]{"MTH_111", "MTH_221", "MTH_321", "MTH_323", "MTH_121",
            "MTH_242", "STA_111", "STA_205"});
        
        careerToCoursesMap.put("Meteorology", new String[]{"MTH_111", "MTH_121", "MTH_122", "MTH_432", "MTH_438", "MTH_427",
            "MTH_336", "MTH_338"});


        getCareerRecommendation(userFavouriteCourses, careerToCoursesMap, mathCareers);
    }

    public void getPhysicsCareerRecommendation(ArrayList<String> userFavouriteCourses) {}
}
