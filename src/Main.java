public class Main {
    public static void main(String[] args) {
School[] schools = {
        new School(1,"Let's go",Lesson.MATEMATIKA),
        new School(2,"Peaksoft",Lesson.KYRGYZ_TIL),
        new School(3,"Geekbrains",Lesson.RUSKI)
};
Student[] students = {
        new Student(12,"Samagan","Tolonbaev",15,Cource.JAVA),
        new Student(13,"Kumar","Tolonbaev",15,Cource.PYTON),
new Student(14,"Baikal","Asanov",15,Cource.JAVASCRIPT)};
        for (int i = 0; i < schools.length; i++) {
            System.out.println(schools[i]);
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
}
    }
