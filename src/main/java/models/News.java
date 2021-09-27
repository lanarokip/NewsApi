package models;

public class News {
    private int id;
    private String General_News;
    private String Department_News;
//    private int department;

    public News(String general_News, String department_News) {
        General_News = general_News;
        Department_News = department_News;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeneral_News() {
        return General_News;
    }

    public void setGeneral_News(String general_News) {
        General_News = general_News;
    }

    public String getDepartment_News() {
        return Department_News;
    }

    public void setDepartment_News(String department_News) {
        Department_News = department_News;
    }
}
