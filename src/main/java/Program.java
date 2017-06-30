import java.util.Map;

/**
 * Created by Marinka on 30.06.2017.
 */
public class Program {
    private String name;
    private int totalDuration;
    private Map<Course, Integer> programMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Map<Course, Integer> getProgramMap() {
        return programMap;
    }

    public void setProgramMap(Map<Course, Integer> programMap) {
        this.programMap = programMap;
    }

    public Program(String name, Map<Course, Integer> programMap) {
        this.name = name;
        this.programMap = programMap;
    }

    public int calculateDuration() {
        for (Map.Entry<Course, Integer> entry : programMap.entrySet()) {
            totalDuration += entry.getValue();
        }
        return totalDuration;
    }
}
