public class Teacher implements person, Serializable {
    private String name;
    private String birthDate;
    private int tabNo;
    private String jobName;


    public Teacher(String name, String birthDate, int tabNo, String jobName) {
        this.name = name;
        this.birthDate = birthDate;
        this.tabNo = tabNo;
        this.jobName = jobName;
    }

    @Override
    public String toString() {
        return "Преподаватель [" +
                "Таб. №: " + tabNo +
                ", ФИО: " + name +
                ", дата рожд.: " + birthDate +
                ", должность: " + jobName + ']';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getTabNo() {
        return tabNo;
    }

    public void setTabNo(int tabNo) {
        this.tabNo = tabNo;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}