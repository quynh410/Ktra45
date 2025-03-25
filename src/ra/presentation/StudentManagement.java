package ra.presentation;

import ra.entity.Student;

import java.util.*;

public class StudentManagement {
    private Map<String, Student> stu_map = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    public void display(){
        while (true) {
            System.out.println("********************MENU*******************");
            System.out.println("1. Danh sách sinh viên");
            System.out.println("2. Thêm mới các sinh viên");
            System.out.println("3. Xóa sinh viên theo mã sinh viên");
            System.out.println("4. Tính điểm trung bình của tất cả sinh viên");
            System.out.println("5. In thông tin sinh viên có điểm trung bình lớn nhất");
            System.out.println("6. In thông tin sinh viên có tuổi nhỏ nhất");
            System.out.println("7. Thoát");
            System.out.println("********************************************");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayList();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    calculateAvg();
                    break;
                case 5:
                    printHighestAvg();
                    break;
                case 6:
                    printSmallAge();
                    break;
                case 7:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }
    }
    public void displayList(){
        if (stu_map.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }
        System.out.println("Danh sách sinh viên:");
        for (Student student : stu_map.values()) {
            System.out.println(student);
        }
    }
    public void addStudent() {
        Student student = new Student();
        student.inputData(scanner);
        stu_map.put(student.getStu_id(), student);
        System.out.println("Thêm sinh viên thành công!");
    }
    public void delete() {
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String stu_id = scanner.nextLine();
        if(stu_map.remove(stu_id) != null ) {
            System.out.println("Xóa sinh viên thành công");
        }else{
            System.out.println("ko tìm thấy sinh viên có mã !!"+ stu_id);
        }
    }
    public void  calculateAvg() {
        if (stu_map.isEmpty()) {
            System.out.println("ko có sinh viên.");
            return;
        }
        float  avg = 0;
        for (Student student : stu_map.values()) {
            avg = avg + student.getAvg_score();
        }
        avg = avg / stu_map.size();
        System.out.println("Điểm trung bình của sinh viên: " + avg);
    }
    public void  printHighestAvg() {
        if (stu_map.isEmpty()) {
            System.out.println("không có sinh viên trong danh sách!");
            return;
        }
        List<Student> listStudent = new ArrayList<>(stu_map.values());
        System.out.println("Sinh viên có điểm trung bình cao nhất: ");
        System.out.println(listStudent.get(0));
    }
    public void printSmallAge(){

    }
}
