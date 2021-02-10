package careerrecommend;

import java.util.ArrayList;

/**
 *
 * @author Crazelu
 */
public class CareerRecommend {

    ArrayList<String> favouriteCourses = new ArrayList<>();

    public static void main(String[] args) {
        new CareerRecommend().run();
    }

    void run() {
        
        
        String dept;
        RecommendationHandler recommendationHandler = new RecommendationHandler();
        Registration registrationHandler = new Registration();
        ComputerScience compsci = new ComputerScience();
        Chemistry chem = new Chemistry();
        registrationHandler.register();
        dept = registrationHandler.getDepartment();

        if (!registrationHandler.isInPhyScience(dept)) {
        } else {

            //show welcome message
            registrationHandler.welcome();

            //get user's current level
            int level = registrationHandler.getLevel();

            switch (dept) {
                case "computer science":

                    favouriteCourses = compsci.getFavouriteCourses(level);

                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getComputerScienceCareerRecommendation(favouriteCourses);
                    }
                    break;
                case "pure and industrial chemistry":
                    favouriteCourses = chem.getFavouriteCourses(level);
                    if (!favouriteCourses.isEmpty()) {
                    }
                    break;
                default:
                    System.out.println("We'll soon treat your department.");
                    break;
            }

        }
    }

}
