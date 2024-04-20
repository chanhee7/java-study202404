package day07.encap.practice;

public class Student {

    private String name;
    private String studentId;
    private String department;

    public void setName(String name) {
        // isEmpty(), equals("") : 비어있는
        if (name == null || name.isEmpty()) {
            System.out.println("유효하지 않은 이름입니다.");
            return;
        }
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDepartment() {
        return department;
    }
}
