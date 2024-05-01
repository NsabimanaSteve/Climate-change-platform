/**
 * Abstract class representing various types of resources.
 * This class provides a method for resources such as articles, videos, and courses.
 * @Author: Steve, Trsesor, Rosiline and Bennetta 
 */
// Abstract class representing resources
abstract class Resources implements Resource {
    protected String title; //Title of resources
    protected String type;  //Type of the resource (e.g., article, video, course)
    protected String URL;   // URL or location of the resource

    /**
     * Constructor to initialize resource attributes.
     *
     * @param title Title of the resource
     * @param type  Type of the resource (e.g., article, video, course)
     * @param URL   URL or location of the resource
     */
    public Resources(String title, String type, String URL) {
        this.title = title;
        this.type = type;
        this.URL = URL;
    }

    /**
     * Getter method for the title of the resource.
     *
     * @return The title of the resource
     */
    public String getTitle() {
        return title;
    }
}