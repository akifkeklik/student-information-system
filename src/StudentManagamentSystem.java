import java.util.ArrayList;

public class StudentManagamentSystem {

    private ArrayList<Student> students;
    private int currentId;


    public StudentManagamentSystem() {
        students = new ArrayList<>();
        currentId = 1;
    }


    public void addStudent(String name, String email) {
        Student student1 = new Student(currentId++, name, email);
        students.add(student1);
        System.out.println("Öğrenci başarıyla eklendi" + student1.toString());
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("Henüz kayıtlı bir öğrenci yok");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void updateStudent(int id, String name, String email) {
        boolean isupdate = false;
        for (Student s: students) {
            if(s.getId() == id){
                s.setName(name);
                s.setEmail(email);
                System.out.println("Öğrenci bilgileri güncellendi : " + s);
                isupdate = true;
            }
        }
        if(!isupdate){
            System.out.println("Öğrenci bulunamadı!");
        }
    }

    public void deleteStudent(int id){
        for(Student s: students){
            if(s.getId() == id){
                students.remove(s);
                System.out.println("Öğrenci silindi : " + s);
                return;
            }
        }
        System.out.println("Öğrenci bulunamadı !");
    }



}


