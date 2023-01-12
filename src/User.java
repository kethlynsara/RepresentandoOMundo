public class User {
    private String name;
    private String phone;
    private String email;
    Course course ;
    Plan plan = new Plan();

    public User(String name, String phone, String email, String courseName, String college, String state, int admissionYear, int admissionSemester) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.course = new Course(courseName, college, state, admissionYear, admissionSemester);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
