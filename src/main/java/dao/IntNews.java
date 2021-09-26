package dao;

import models.Departments;
import models.News;

import java.util.List;

public interface IntNews {

    //    CRUDE

    void create(News news);
    void  addNewsToRestaurant(News news, Departments departments);

    List<News> findAll();
    List<Departments> getallDepartmentNews(int id);
    News findbyId();

    void deleteAll();
    void deleteById(int id);

}
