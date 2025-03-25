package ra.entity;

import java.util.Scanner;

public class Student {
    private String stu_id;
    private String stu_name;
    private int age;
    private float avg_score;

    public Student() {}

    public Student(String stu_id, String stu_name, int age, float avg_score) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.age = age;
        this.avg_score = avg_score;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAvg_score() {
        return avg_score;
    }

    public void setAvg_score(float avg_score) {
        this.avg_score = avg_score;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Nhập mã sinh viên: ");
        this.stu_id = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        this.stu_name = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập điểm trung bình: ");
        this.avg_score = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + stu_id + "\n" +
                "Tên sinh viên: " + stu_name + "\n" +
                "Tuổi sinh viên: " + age + "\n" +
                "Điểm trung bình: " + avg_score;
    }
}
