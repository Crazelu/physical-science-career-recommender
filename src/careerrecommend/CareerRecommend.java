package careerrecommend;

import java.util.ArrayList;

/**
 *
 * @author Crazelu
 */
public class CareerRecommend {

    ArrayList<String> favouriteCourses;

    CareerRecommend() {
        favouriteCourses = new ArrayList<>();
    }

    public static void main(String[] args) {
        new CareerRecommend().run();
    }

    void run() {

        String department;

        //create instances of the objects needed
        RecommendationHandler recommendationHandler = new RecommendationHandler();
        Registration registrationHandler = new Registration();
        ComputerScience compsci = new ComputerScience();
        Chemistry chem = new Chemistry();
        Statistics statistics = new Statistics();
        Physics physics = new Physics();
        Mathematics mathematics = new Mathematics();

        //register user
        registrationHandler.register();

        //get user's department
        department = registrationHandler.getDepartment();

        if (!registrationHandler.isInPhyScience(department)) {
            //department is not in physical sciences
        } else {

            //show welcome message
            registrationHandler.welcome();

            //get user's current level
            int level = registrationHandler.getLevel();

            //for corresponding department, get favouriteCourses and 
            //recommend career based on those favouriteCourses selected
            switch (department) {
                case "computer science":

                    favouriteCourses = compsci.getFavouriteCourses(level);

                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getComputerScienceCareerRecommendation(favouriteCourses);
                    }
                    break;

                case "pure and industrial chemistry":
                    favouriteCourses = chem.getFavouriteCourses(level);
                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getChemistryCareerRecommendation(favouriteCourses);
                    }
                    break;
                case "statistics":
                    favouriteCourses = statistics.getFavouriteCourses(level);
                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getStatisticsCareerRecommendation(favouriteCourses);
                    }
                    break;
                case "physics and astronomy":
                    favouriteCourses = physics.getFavouriteCourses(level);
                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getPhysicsCareerRecommendation(favouriteCourses);
                    }
                    break;
                case "mathematics":
                    favouriteCourses = mathematics.getFavouriteCourses(level);
                    if (!favouriteCourses.isEmpty()) {
                        recommendationHandler.getMathematicsCareerRecommendation(favouriteCourses);
                    }
                    break;

                default:
                    System.out.println("We'll soon treat your department.");
                    break;
            }

        }
    }

}
