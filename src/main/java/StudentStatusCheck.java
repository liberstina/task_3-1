/**
 * Created by Marinka on 19.06.2017.
 */
public class StudentStatusCheck {
    public static void main(String[] args) throws InterruptedException {

        /*Course javascript = new Course("javascript", 300);
        Course javaCore = new Course("java core", 500);
        Course javaSE = new Course("java SE", 500);
        Course automation = new Course("automation", 200);
        Course html = new Course("html", 100);
        Course css = new Course("css", 200);
        Course qa = new Course("qa", 300);

        List<Course> jsList = new ArrayList<>();
        jsList.add(javascript);
        jsList.add(css);
        jsList.add(html);

        List<Course> javaList = new ArrayList<>();
        javaList.add(javaCore);
        javaList.add(javaSE);

        List<Course> qaList = new ArrayList<>();
        qaList.add(qa);
        qaList.add(html);

        List<Course> automationList = new ArrayList<>();
        automationList.add(automation);
        automationList.add(javaCore);
        automationList.add(qa);

        //dates - more convenient way
        Student ivanov = new Student("Иван", "Иванов", new GregorianCalendar(2017, 5, 10));
        Student petrov = new Student("Петр", "Петров", new GregorianCalendar(2017, 5, 10));
        Student sidorov = new Student("Сидор", "Сидоров", new GregorianCalendar(2017, 6, 10));
        Student alexandrova = new Student("Александра", "Александрова", new GregorianCalendar(2017, 6, 10));

        Map<Course, Integer> jsMap = ivanov.createProgram(jsList);
        Map<Course, Integer> javaMap = petrov.createProgram(javaList);
        Map<Course, Integer> automationMap = ivanov.createProgram(automationList);
        Map<Course, Integer> qaMap = ivanov.createProgram(qaList);
        Program jsProgram = new Program("Javascript Разработчик", jsMap);
        Program javaProgram = new Program("Java Разработчик", javaMap);
        Program automationProgram = new Program("QA Automation", automationMap);
        Program qaProgram = new Program("QA Manual", qaMap);

        ivanov.realWork(jsProgram, ivanov.getStartStudy().getTime(), jsProgram.calculateDuration());
        petrov.realWork(javaProgram, petrov.getStartStudy().getTime(), javaProgram.calculateDuration());
        sidorov.realWork(automationProgram, sidorov.getStartStudy().getTime(), automationProgram.calculateDuration());
        alexandrova.realWork(qaProgram, alexandrova.getStartStudy().getTime(), qaProgram.calculateDuration());*/
        //TODO create individual program
        //TODO create student and perform calculation results
        Program program = new Program("developer", "23/06/2017");
        program.setProgram(Courses.JAVA_CORE, Courses.JAVA_SCRIPT);
        Student student = new Student("Иван", "Иванов", program);

    }
}