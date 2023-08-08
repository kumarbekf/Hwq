public class Student {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private Cource cource;

    public Student(int id, String name, String lastName, int age, Cource cource) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.cource = cource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cource getCource() {
        return cource;
    }

    public void setCource(Cource cource) {
        this.cource = cource;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", cource=" + cource +
                '}';
    }
}
