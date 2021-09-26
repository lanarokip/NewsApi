package models;

public class News {
    private int id;
    private String General_News;
    private String DepartMent_News;
    private int department;

    public News(String general_News, String departMent_News) {
        General_News = general_News;
        DepartMent_News = departMent_News;
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

    public String getDepartMent_News() {
        return DepartMent_News;
    }

    public void setDepartMent_News(String departMent_News) {
        DepartMent_News = departMent_News;
    }
}
