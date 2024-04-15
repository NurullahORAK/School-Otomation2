import java.util.List;

public class School {
    public String name;
    public String adress;
    public int id;
    public List<Mudur> mudur;
    public List<Teacher> teacher;
    public List<Classroom> classRoom;

    public School(String name, String adress, int id, List<Mudur> mudur, List<Teacher> teacher, List<Classroom> classRoom) {
        this.adress = adress;
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.mudur = mudur;
    }
}
