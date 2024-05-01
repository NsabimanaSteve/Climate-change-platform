import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class representing articles related to climate change.
 * This class provides methods to display information about Ghanaian and international articles.
 * @Author: Steve, Trsesor, Rosiline and Bennetta 
 */


// Class representing articles
class Articles extends Resources {
    // Arrays to store Ghana and international articles information
    private String[][] ghanaArticles = {
            {"Ghana Article 1", "HOW THE CLIMATE CRISIS IS IMPACTING GHANA", "https://www.int-res.com/abstracts/cr/v17/n2/p145-168"},
            {"Ghana Article 2", "CLIMATE RISK COUNTRY PROFILE: GHANA", "https://agupubs.onlinelibrary.wiley.com/doi/full/10.1002/2017EF000714"},
            {"Ghana Article 3", "Environment and Climate Change in Ghana", "https://www.tandfonline.com/doi/full/10.1080/13504500903354424"},
            {"Ghana Article 4", "Adaptation and resilience to climate change and variability in north-east Ghana", "https://mediadon.co.za/wp-content/uploads/2019/09/2009-Chapter_5_The_Impacts_of_Climate_Change_in_Africa-5.pdf"}
    };

    private String[][] internationalArticles = {
            {"International Article 1", "African Climate Change", "https://careclimatechange.org/wp-content/uploads/2017/06/G20-REPORT-.pdf"},//
            {"International Article 2", "THE IMPACTS OF CLIMATE CHANGE IN AFRICA", "https://www.annualreviews.org/content/journals/10.1146/annurev-soc-121919-054614"},
            {"International Article 3", "Adaptation to climate change in Africa", "https://books.google.com.gh/books?hl=en&lr=&id=QjlkAgAAQBAJ&oi=fnd&pg=PP1&ots=Nl8slpCKjR&sig=NzeO5Xthtw4eBmz6ie_KfX5sa-s&redir_esc=y#v=onepage&q&f=false"},
            {"International Article 4", "Climate Change and Africa", "https://www.mdpi.com/2225-1154/3/1/78"}
    };

     /**
     * Constructor for Articles class
     *
     * @param title Title of the article
     * @param type  Type of the article (e.g., "Ghana", "International")
     * @param URL   URL of the article
     */
    public Articles(String title, String type, String URL) {
        super(title, type, URL);
    }

    /**
     * Method to display information about articles
     */

    @Override
    public void displayInfo() {
        Scanner scanner = new Scanner(System.in);
        // Ask user to enter the article level (1 to 4)
        System.out.print("Enter your level (1 to 4): ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Check if the entered level is valid (between 1 and 4)
        if (index >= 1 && index <= 4) {
            // Display Ghana Articles
            System.out.println("Ghana Articles:");
            System.out.println("Title: " + ghanaArticles[index - 1][0]);
            System.out.println("Topics: " + ghanaArticles[index - 1][1] + ", " + ghanaArticles[index - 1][2]);

            // Display International Articles
            System.out.println("International Articles:");
            System.out.println("Title: " + internationalArticles[index - 1][0]);
            System.out.println("Topics: " + internationalArticles[index - 1][1] + ", " + internationalArticles[index - 1][2]);
        } else {
            System.out.println("Invalid level. Please choose between 1 and 4.");
        }
    }
}