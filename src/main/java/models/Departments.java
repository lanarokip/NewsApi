package models;

public class Departments {
    private int id;
    private String departmentName ;
    private int NoWorkers;



    public Departments( String departmentName , int NoWorkers) {

        this.departmentName = departmentName;
        this.NoWorkers = NoWorkers;
    }


    public int getNoWorkers() {
        return NoWorkers;
    }

    public void setNo_workers(int noWorkers) {
        NoWorkers = noWorkers;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }



}
