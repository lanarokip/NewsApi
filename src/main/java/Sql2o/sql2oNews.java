package Sql2o;

import dao.IntNews;
import models.News;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class sql2oNews implements IntNews {

    private final Sql2o sql2o;

    public sql2oNews(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void create(News news) {
        String sql = "INSERT INTO news(general_News,department_News) VALUES (:general_News,:department_news)";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(news)
                    .executeUpdate()
                    .getKey();
            news.setId(id);
        } catch (
                Sql2oException e) {
            System.out.println(e);
        }
    }

    @Override
    public List<News> findAll() {
        try( Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM News")
                    .executeAndFetch(News.class);
        }
    }

    @Override
    public News findbyId(int id) {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * From news WHERE id=:id")
                    .addParameter("id", id)
                    .executeAndFetchFirst(News.class);
        }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM news";
            try (Connection con = sql2o.open()) {
                con.createQuery(sql)
                        .executeUpdate();
            } catch (Sql2oException e) {
                System.out.println(e);
            }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM news WHERE id=:id";
        try(Connection con = sql2o.open()){
            con.createQuery(sql).addParameter("id",id)
                    .executeUpdate();
        }catch(Sql2oException e){
            System.out.println("runnn");
        }
    }

}
