import java.lang.ref.PhantomReference;

public class School {
private int id;
private String name;
private Lesson lesson;

    public School(int id, String name, Lesson lesson) {
        this.id = id;
        this.name = name;
        this.lesson = lesson;
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

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lesson=" + lesson +
                '}';
    }
}

