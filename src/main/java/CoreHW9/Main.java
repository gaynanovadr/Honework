package CoreHW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(); // делаем лист студентов
        students.add(new Student("Lena", Arrays.asList(new Course("Core"), new Course("Testing"),
                new Course("Java"))));
        students.add(new Student("Diana", Arrays.asList(new Course("Core"),
                new Course("Java"), new Course("Testing"), new Course("English"))));
        students.add(new Student("Anna", Arrays.asList(new Course("JavaCore"))));

        System.out.println(students.stream()   //список уникальных курсов
                .map(s -> s.getCourses())
                .flatMap(c -> c.stream())
                .collect(Collectors.toSet()));

        System.out.println(students.stream()    //любознательных
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(2)
                .collect(Collectors.toList()));

        Course course = new Course("Math");
        System.out.println(students.stream()    //список студентов, которые посещают курс которые посещают курс
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
