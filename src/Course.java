public class Course {
    private String name;
    private String college;
    private String state;
    private int admissionYear;
    private int admissionSemester; 

    public Course(String name, String college, String state, int admissionYear, int admissionSemester) {
        this.name = name;
        this.college = college;
        this.state = state;
        this.admissionYear = admissionYear;
        this.admissionSemester = admissionSemester;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege(){
        return this.college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getState(){
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAdmissionYear(){
        return this.admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public int getAdmissionSemester(){
        return this.admissionSemester;
    }

    public void setAdmissionSemester(int admissionSemester) {
        this.admissionSemester = admissionSemester;
    }
}


