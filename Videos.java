import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

// Class representing videos, a type of resource
class Videos extends Resources {
    // Array to store titles of videos
    private String[] videoTitles = {"Video 1", "Video 2", "Video 3"};

    // Array to store URLs of videos
    private String[] videoURLs = {
            "URL: https://www.youtube.com/watch?v=qySBQjSXbfw",
            "https://www.youtube.com/watch?v=pEt6-jA2UE4",
            "https://www.youtube.com/watch?v=6tFaZnuhC-4"
    };

    
    /**
     * Constructor to initialize the details of a video.
     *
     * @param title Title of the video
     * @param type  Type of the video (e.g., "Video")
     * @param URL   URL of the video
     */
    public Videos(String title, String type, String URL) {
        super(title, type, URL); // Call the constructor of the parent class (Resources)
    }

    /**
     * Method to display information about videos.
     * Allows the user to get a random video from the list.
     */
    @Override
    public void displayInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'random' to get a random video: ");
        String input = scanner.nextLine().trim();

        // Check if the user wants a random video
        if (input.equalsIgnoreCase("random")) {
            Random random = new Random();
            int randomIndex = random.nextInt(videoTitles.length);
            System.out.println("Random Video:");
            System.out.println("Title: " + videoTitles[randomIndex]);
            System.out.println("URL: " + videoURLs[randomIndex]);
        } else {
            System.out.println("Invalid input. Please type 'random' to get a random video.");
        }
    }
}