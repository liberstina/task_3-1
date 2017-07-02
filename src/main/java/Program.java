import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Marinka on 30.06.2017.
 */
public class Program {
    private static final int WORK_TIME_START = 10;
    private static final int WORK_TIME_END = 18;
    private String name;
    private String dateStart;
    //not needed as an object class parameter
    private int totalDuration;
    private Courses[] course;

    public String getName() {
        return name;
    }

    public Program(String name, String dateStart) {
        this.name = name;
        this.dateStart = dateStart;
    }

    public void setProgram(Courses... courses) {
        //TODO refactor this method
        for (int i = 0; i < courses.length; i++) {
            course[i] = courses[i];
        }
    }

    public Date convertStringToDateFormat(String date){
        //TODO refactor this method
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String convertDateToStringFormat(Date date){
        //TODO implement method
        return null;
    }

    public Date getDateStart() {
        return convertStringToDateFormat(dateStart);
    }

    public int calculateDuration() {
        //returns total duration of all courses from particular program
        //TODO refactor this method
        /*for (Map.Entry<Course, Integer> entry : programMap.entrySet()) {
            totalDuration += entry.getValue();
        }*/
        return totalDuration;
    }

    //TODO define return type and list of input parameters
    public void getProgramEndDate(){

        //TODO implement
    }

    //TODO define return type and list of input parameters
    public void getDaysEndOfTheProgram(){
        //TODO implement
    }
}
