/**
 * Created by User on 2/7/2017.
 */
public enum Courses {
    JAVA_SCRIPT("javascript", 300),
    JAVA_CORE("java core", 500);

    String courseName;
    int duration;

    Courses(String courseName, int duration) {
        //TODO implement
    }

    public int getDuration() {
        return this.duration;
    }
}
