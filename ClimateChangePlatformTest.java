import java.util.Scanner; // Import Scanner class from the java.util package

public class ClimateChangePlatformTest {
    public static void main(String[] args) {
        ClimateChangePlatform platform = new ClimateChangePlatform(); // Create an instance of the ClimateChangePlatform class
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input
        int choice; // Variable to store the user's choice
        Resource resource = null; // Variable to store the selected resource (article, video, or course)


        //Start the main menu loop
        do {
            System.out.println( "Welcome to the Climate Change Platform !");
            System.out.println("1. Create Profile");
            System.out.println("2. Login");
            System.out.println("3. Get Climate-related Articles");
            System.out.println("4. Get Climate-related Random Videos");
            System.out.println("5. Access Courses to Learn More about Climate");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("Please enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine()); // Read the user's choice

                // Perform actions based on the user's choice
                switch (choice) {
                    case 1:
                        // Create a new user profile
                        System.out.println("Creating profile...");
                        System.out.print("Please enter username: ");
                        String newUsername = scanner.nextLine();
                        System.out.print("Please enter email: ");
                        String newEmail = scanner.nextLine();
                        System.out.print("Please enter password: ");
                        String newPassword = scanner.nextLine();
                        platform.createUserProfile(newUsername, newEmail, newPassword); // Call the createUserProfile method
                        break;
                    case 2:
                        // Log in a user
                        System.out.println("Logging in...");
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        platform.loginUser(username, password); // Call the loginUser method
                        break;

                    case 3:
                        // Get climate-related articles
                        System.out.println("Getting climate articles...");
                        // Check if a user is logged in
                        if (platform.isLoggedIn()) {
                            resource = new Articles("Climate Articles", "Article", "https://example.com/articles");
                            resource.displayInfo(); // Call the displayInfo method for articles
                        }
                        break;
                    case 4:
                        // Get climate-related videos
                        System.out.println("Getting climate videos...");
                        // Check if a user is logged in
                        if (platform.isLoggedIn()) {
                            resource = new Videos("Climate Videos", "Video", "https://example.com/videos");
                            resource.displayInfo(); // Call the displayInfo method for videos
                        }
                        break;
                    case 5:
                        // Access courses to learn more about climate
                        System.out.println("Accessing courses to learn...");
                        // Check if a user is logged in
                        if (platform.isLoggedIn()) {
                            resource = new Courses("Sample Course", "Climate Change", "https://example.com/course");
                            resource.displayInfo(); // Call the displayInfo method for courses
                        }
                        break;
                    case 6:
                        // Logout the current user
                        System.out.println("Logging out...");
                        platform.logoutUser(); // Call the logoutUser method
                        break;
                    case 7:
                        // Exit the program
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;

                }
            } catch (NumberFormatException e) {
                // Handle invalid input exception
                System.out.println("Invalid input. Please enter a number.");
                choice = 0;
            }
        } while (choice != 7); // Continue the loop until the user chooses to exit

        scanner.close(); // Close the scanner object
    }
}

