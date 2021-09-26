package dao;

import models.Departments;
import models.News;

import java.util.List;

public interface IntDepartments {
//   create
    void create(Departments departments);
//    read
    List<Departments> findAll();
    Departments findbyId(int id);
//    delete
    void deleteAll();
    void deleteById(int id);
}
