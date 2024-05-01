import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * This class represents a collection of courses related to climate change.
 * It provides methods to display information about existing courses and add new courses to the collection.
 * @Author: Steve, Trsesor, Rosiline and Bennetta 
 */

// // Array to store course information
class Courses extends Resources {
    private String[][] courseList = {
            {"Eco-literacy", "Perceptions and vulnerability to climate change among the urban poor in Kampala City, Uganda", "https://link.springer.com/article/10.1007/s10113-021-01771-5"},
            {"Climate Crisis", "Climate, Peace and Security Fact Sheet: South Sudan", "https://nupi.brage.unit.no/nupi-xmlui/handle/11250/2736744"},
            {"Policy and Politics of Climate Change", "Assessing Coastal Vulnerability Index to Climate Change: the Case of Accra – Ghana", "https://meridian.allenpress.com/jcr/article-abstract/doi/10.2112/SI65-320.1/192623"},
            {"Adapting to a Changing Climate", "Adapting agriculture to climate change in Kenya: Household strategies and determinants", "https://www.sciencedirect.com/science/article/pii/S0301479712005415"},
            {"Climate Change and Society", "Awareness of sea-level response under climate change on the coast of Ghana", "https://link.springer.com/article/10.1007/s11852-017-0569-6"},
            {"Severity of Climate Change in the African Setting", "The State of Climate Change in 2023", "https://link.springer.com/article/10.1007/s11852-017-0569-6"},
            {"Severity of Climate Change in the African Setting II", "Climate Change Is an Increasing Threat to Africa", "https://unfccc.int/news/climate-change-is-an-increasing-threat-to-africa"}
    };

    /**
     * Constructor for Courses class
     *
     * @param title Title of the course
     * @param type  Type of the course (e.g., "Climate Change")
     * @param URL   URL of the course
     */
    public Courses(String title, String type, String URL) {
        super(title, type, URL);
    }

    /**
     * Method to display information about courses
     */
    @Override
    public void displayInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your level (1 to 7): ");
        int level;
        try {
            level = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (level >= 1 && level <= 7) {
                System.out.println("Courses for Level " + level + ":");
                // Display the courses for the specified level
                for (int i = 0; i < courseList[level - 1].length; i++) {
                    System.out.println("Course " + (i + 1) + ": " + courseList[level - 1][i]);
                }
            } else {
                System.out.println("Invalid level. Please choose between 1 and 7.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
