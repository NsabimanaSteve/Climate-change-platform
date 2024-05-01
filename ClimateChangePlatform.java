import java.util.ArrayList; // Import ArrayList class from the java.util package
import java.util.List; // Import List interface from the java.util package
import java.util.Scanner; // Import Scanner class from the java.util package
import java.util.regex.Matcher; // Import Matcher class from the java.util.regex package
import java.util.regex.Pattern; // Import Pattern class from the java.util.regex package

/**
 * Class representing the Climate Change Platform.
 * This class manages user profiles, including creating new profiles, logging in, and logging out.
 * @Author: Steve, Trsesor, Rosiline and Bennetta 
 */

// Class representing the Climate Change Platform
class ClimateChangePlatform {

     // List to store user profiles
    private List<User> userList = new ArrayList<>();

    // Reference to the currently logged-in user
    private User currentUser = null;

    /**
     * Method to create a user profile and store it in the list of users.
     *
     * @param username Username of the user
     * @param email    Email of the user
     * @param password Password of the user
     */
    public void createUserProfile(String username, String email, String password) {
         // Validate email format
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Please enter a valid email.");
            return;
        }

        // Create a new user profile and add it to the list of users
        User newUser = new User(username, email, password);
        userList.add(newUser);
        System.out.println("The profile of the user is created successfully.");
    }

    /**
     * Method to validate the format of an email address.
     *
     * @param email Email address to validate
     * @return true if the email format is valid, otherwise false
     */
    public static boolean isValidEmail(String email) {
        // Regex pattern for email validation
        String emailPattern = "^(.+)@(.+)$"; // Simple pattern for demonstration
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * Method to log in a user with the specified username and password.
     *
     * @param username Username of the user
     * @param password Password of the user
     * @return true if the user is successfully logged in, otherwise false
     */
    public boolean loginUser(String username, String password) {
        // Iterate through the list of users to find the matching username and password
        for (User user : userList) {
            // If a match is found, set the current user as logged in and return true
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println(username +", " + "You have successfully logged in. You can proceed now.");
                currentUser = user;
                user.setLoggedIn(true);
                return true;
            }
        }
        // If no match is found, display an error message and return false
        System.out.println("Invalid username or password. Please try again.");
        return false;
    }

    /**
     * Method to log out the current user.
     */
    public void logoutUser() {
        if (currentUser != null) {
            // If a user is currently logged in, log them out
            currentUser.setLoggedIn(false);
            currentUser = null;
            System.out.println("You have been logged out successfully.");
        } else {
            // If no user is currently logged in, display a message
            System.out.println("No user is currently logged in.");
        }
    }
    /**
     * Method to check if a user is currently logged in.
     *
     * @return true if a user is logged in, otherwise false
     */
    public boolean isLoggedIn() {
        // Check if no user is logged in or the current user is not logged in
        if (currentUser == null || !currentUser.isLoggedIn()) {
            System.out.println("Please first login."); // Ask the user to log in
            return false; // Return false to indicate that no user is logged in
        }
        return true; // Return true to indicate that a user is logged in
    }
}