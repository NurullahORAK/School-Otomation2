import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printSchool();
    }

    public static void printSchool() {
        School school = new School("Karşıyaka Lisesi", "Bingöl", 12, createMudurList(), creeateTeacherList(), createClassroomList());
        System.out.println("School Name : " + school.name);
        System.out.println("adress : " + school.name);
        System.out.println("Manager : " + school.name + " " + school.mudur.get(0).lastName + " TC No: " + school.mudur.get(0).tckNo + " Salary: " + school.mudur.get(0).salary);
        for (int i = 0; i < creeateTeacherList().size(); i++) {
            System.out.println("Teachers:\n" + "First Name: " + school.teacher.get(i).name + " Last Name: " + school.teacher.get(i).lastName + " TC No: " + school.teacher.get(i).tckNo + " Salary: " + school.teacher.get(i).salary);
        }
        for (int i = 0; i < createClassroomList().size(); i++) {
            System.out.println("Classrom:\n" + "Grade Name: " + school.classRoom.get(i).name);
        }
        for (int i = 0; i < createStudentList().size(); i++) {
            System.out.println("Students:\n" + "First Name: " + school.classRoom.get(0).studentList.get(i).name + " Last Name: " + school.classRoom.get(0).studentList.get(i).name + " TC No: " + school.classRoom.get(0).studentList.get(i).tckNo + " Id: " + school.classRoom.get(0).studentList.get(i).id);
        }
        for (int i = 0; i < createDersList().size(); i++) {
            System.out.println("Lessons:\n" + "Name: " + school.classRoom.get(0).dersList.get(i).name + " Credit: " + school.classRoom.get(0).dersList.get(i).credit);
        }
    }

    private static List<School> createSchoolList() {
        List<School> schoolList = new ArrayList<>();
//        schoolList.add(createSchool());
        return schoolList;
    }

    private static List<Mudur> createMudurList() {
        List<Mudur> mudurList = new ArrayList<>();
        mudurList.add(createMudur("Ahmet", "Son", "12345678900", "0", 55000));
        return mudurList;
    }

    public static Mudur createMudur(String name, String lastName, String tckNo, String id, int salary) {
        Mudur mudur = new Mudur();
        mudur.name = name;
        mudur.lastName = lastName;
        mudur.id = id;
        mudur.tckNo = tckNo;
        mudur.salary = salary;
        return mudur;
    }

    private static List<Teacher> creeateTeacherList() {
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(createTeacher("Numan", "Turkeri", "12345678910", "1", 40000));
        teacherList.add(createTeacher("Nurullah", "Orak", "12234567891", "2", 39000));
        return teacherList;
    }

    public static Teacher createTeacher(String name, String lastName, String tckNo, String id, int salary) {
        Teacher teacher = new Teacher();
        teacher.name = name;
        teacher.lastName = lastName;
        teacher.id = id;
        teacher.tckNo = tckNo;
        teacher.salary = salary;
        return teacher;
    }

    public static Student createStudent(String name, String lastName, String tckNo, String id) {
        Student student = new Student();
        student.name = name;
        student.lastName = lastName;
        student.tckNo = tckNo;
        student.id = id;
        return student;
    }

    public static List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(createStudent("Enes", "Erdoğan", "11234567891", "300"));
        studentList.add(createStudent("Ergun", "Atay", "12334567891", "301"));
        return studentList;
    }

    private static Classroom createClassroom(String name, List<Student> studentList, List<Ders> dersList) {
        Classroom classRoom = new Classroom();
        classRoom.name = name;
        classRoom.studentList = studentList;
        classRoom.dersList = dersList;
        return classRoom;
    }

    public static List<Classroom> createClassroomList() {
        List<Classroom> classrooms = new ArrayList<>();
        classrooms.add(createClassroom("1/A", createStudentList(), createDersList()));
        return classrooms;
    }

    public static Ders createDers(String name, int credit) {
        Ders ders = new Ders();
        ders.name = name;
        ders.credit = credit;
        return ders;
    }

    private static List<Ders> createDersList() {
        List<Ders> dersList = new ArrayList<>();
        dersList.add(createDers("Math", 6));
        dersList.add(createDers("English", 4));
        return dersList;
    }
}

//        List<School> schoolList = new ArrayList<>();
//        for (School school : createSchoolList()) {
//            System.out.println(school.name);
//            System.out.println(school.adress);
//            System.out.println(school.id);
//            System.out.println(school.teacher.get(0).name);
//            System.out.println(school.classRoom.get(0).name);
//            System.out.println(school.mudur.get(0).name);
//        }

//    public static School createSchool() {
//        School school = new School();
//        school.adress = "Bingol";
//        school.id = 1;
//        school.name = "Karsıyaka";
//        school.teacher = creeateTeacherList();
//        school.classRoom = createClassroomList();
//        school.mudur = createMudurList();
//        return school;
//    }

// eğer print metodu yapacaksak createSchool metodu oluşturulmamalı çünkü School nesnesi print metodunda da oluşturulacak o yüzden gereksiz kod kalabalığı oluyor.School un nesnesini metodda oluşturacaz.ve School sınıfında constructor oluşturacaz.