/**
 * Created by Marinka on 20.06.2017.
 */
public class Course {
    private int duration;
    private String name;

    public Course (String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
