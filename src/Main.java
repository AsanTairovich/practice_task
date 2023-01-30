import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Asan", "Tairov", 23, "asantairov11@gmail.com", "M", 2);
        Student student2 = new Student("Uson", "Kamalov", 23, "kamalovuson@gmail.com", "M", 3);
        Student student3 = new Student("Nargiza", "Galova", 33, "nargizagalova@gmail.com", "Ж", 7);
        Student student4 = new Student("Malika", "Moloshova", 16, "malikamoloshova@gmail.com", "Ж", 6);
        Student student5 = new Student("Nurmuxammed", "Akbaraliev", 17, "nurmuxammed@gmail.com", "M", 8);
        Student student6 = new Student("Nurtilek", "Avazbekov", 23, "nurtilek@gmail.com", "M", 4);
        Student student7 = new Student("Nrisa", "Jrmamat kyzy", 20, "nurisa@gmail.com", "Ж", 9);
        Student student8 = new Student("Madina", "Suiunbek kyzy", 20, "madina@gmail.com", "Ж", 5);
        Student student9 = new Student("Aibek", "Erlan uulu", 17, "aibek@gmail.com", "M", 10);

        School school = new School("Peaksoft house", new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9});
        System.out.println(school.findByName("Aibek"));
        System.out.println();
        school.getAllStudents();
        System.out.println();
        System.out.println(Arrays.toString(school.getAllGirls()));
        System.out.println();
        school.getMaxEstimation();
        System.out.println();
        System.out.println(school.getAverageEstimation());
        System.out.println();
        school.getAverageAge();


    }
}