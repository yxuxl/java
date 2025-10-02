import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public Student(int studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        String numStr = Long.toString(phoneNumber);

        numStr = "0" + numStr;

        String first = numStr.substring(0, 3);
        String middle = numStr.substring(3, 7);
        String last = numStr.substring(7);

        return first + "-" + middle + "-" + last;
    }

    public void printStudentInfo() {
        System.out.println("학번: " + studentId);
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("전화번호: " + getFormattedPhoneNumber());
        System.out.println("-----------------------------");
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "번째 학생 정보를 입력하세요.");
            System.out.println("형식: 학번 이름 전공 전화번호(숫자만)");

            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n===== 입력된 학생 정보 =====");
        for (Student s : students) {
            s.printStudentInfo();
        }
    }
}
