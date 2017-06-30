import java.util.*;

/**
 * Created by Marinka on 19.06.2017.
 */
public class Student {
    private String name;
    private String surname;
    private Calendar startStudy;

    public Calendar getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Calendar startStudy) {
        this.startStudy = startStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Student(String name, String surname, Calendar startStudy) {
        this.name = name;
        this.surname = surname;
        this.startStudy = startStudy;
    }

    public Map<Course, Integer> createProgram(List<Course> courses) {
        Map<Course, Integer> program = new HashMap<>();
        for (int i = 0; i < courses.size(); i++) {
            program.put(courses.get(i), courses.get(i).getDuration());
        }
        return program;
    }

    public void realWork(Program program, Date startDate, int duration) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Calendar currentDate = Calendar.getInstance();
        long durationInMillis = duration * 3600000;
        long difference = startStudy.getTimeInMillis() - currentDate.getTimeInMillis();
        if ((difference < durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println("Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference < durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + ". Рабочие часы: с 00 до 24. Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + startDate + ". Обучение закончено. После окончания прошло " + (durationInMillis - difference) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && ((s.equals("0")) || (s.equals(""))))
            System.out.println("Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
        else if ((difference > durationInMillis) && (!(s.equals("0")) || !(s.equals(""))))
            System.out.println(name.toString() + " " + surname.toString() + ". Рабочие часы: с 00 до 24. Название программы - " + program.getName() + ". Длительность программы - " + duration + " часов. Начало обучения - " + startDate + ". Обучение не закончено. До окончания осталось " + (difference - durationInMillis) / 3600000 + " часов.");
    }

}