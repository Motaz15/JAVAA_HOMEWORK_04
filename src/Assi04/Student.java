
package assi04;
public class Student {

    private int id;
    private String name;
    private String major;
    private Double grade;


    public Student() {

    }

    public Student(int id, String name, String major, Double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;


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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    
}
