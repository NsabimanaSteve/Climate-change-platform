/**
 * Class representing a user in the Climate Change Platform.
 * This class stores information about the user such as username, email, and login status.
 * @Author: Steve, Trsesor, Rosiline and Bennetta 
 */
public class User {
    private String username; // Username of the user
    private String email; // Email of the user
    private String password; // Password of the user
    private boolean isLoggedIn; // Flag to indicate if the user is logged in

    // Constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isLoggedIn = false; // Initialize isLoggedIn to false by default
    }

    /**
     * Getter method to retrieve the username of the user.
     *
     * @return The username of the user
     */
    public String getUsername() {
        return username;
    }
 
    /**
     * Getter method to retrieve the password of the user.
     *
     * @return The password of the user
     */
    public String getPassword() {
        return password;
    }

    /**
     * Method to set the login status of the user.
     *
     * @param isLoggedIn true if the user is logged in, false otherwise
     */

    public void setLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    /**
     * Method to check if the user is logged in.
     *
     * @return true if the user is logged in, false otherwise
     */
    
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}