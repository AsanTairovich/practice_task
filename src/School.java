import java.util.Arrays;

public class School implements Service {
    private String schoolName;
    private Student[] students;

    public School(String schoolName, Student[] students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    @Override
    public Student findByName(String studentName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        return null;
    }

    @Override
    public void getAllStudents() {
        for (Student student:students) {
            System.out.println(student);
        }
    }

    @Override
    public Student[] getAllGirls() {
        Student[] girls = new Student[students.length];
        for (int j = 0; j < students.length; j++) {
            if (students[j].getGender().equals("Ж")){
                girls[j] = students[j];
            }
        }
        return girls;
    }

    @Override
    public void getMaxEstimation() {
        int max = students[0].getEstimation();
        for (Student a:students) {
            if(a.getEstimation() > max){
                max = a.getEstimation();
            }
        }
        System.out.println(max);
    }

    @Override
    public double getAverageEstimation() {
        double avg = 0;
        for (Student s: students) {
            avg += s.getEstimation();

        }
        return avg/students.length;
    }

    @Override
    public void getAverageAge() {
        double ave = 0;
        for (Student student:students) {
            ave += student.getAge();
        }
        System.out.println(ave/students.length);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "School " +
                "schoolName: " + schoolName +
                "students: " + Arrays.toString(students);
    }

}
