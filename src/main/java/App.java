import models.Departments;
import models.News;
import com.google.gson.Gson;
import Sql2o.sql2oDepartments;
import models.User;
import org.sql2o.Sql2o;
import static spark.Spark.*;
import Sql2o.sql2oNews;
import Sql2o.sql2oUser;


import java.sql.Connection;

import static spark.route.HttpMethod.post;

public class App {
    public static void main(String[] args) {

        sql2oDepartments departments;
        sql2oNews sql2oNew ;
        sql2oUser sql2ouser;
        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:~/jadle.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        departments = new sql2oDepartments(sql2o);
        sql2oNew = new sql2oNews(sql2o);
        sql2ouser = new sql2oUser(sql2o);
//        conn = sql2o.open();

        post("/department/new", "application/json", (req, res) -> {
            Departments department1 = gson.fromJson(req.body(), Departments.class);
            departments.create(department1);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department1);
        });
        get("/department", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(departments.findAll());
        });

        post("/news/new", "application/json", (req, res) -> {
            News news = gson.fromJson(req.body(), News.class);
            sql2oNew.create(news);
            res.status(201);
            res.type("application/json");
            return gson.toJson(news);
        });
        get("/news", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2oNew.findAll());
        });

        post("/users/new", "application/json", (req, res) -> {
            User user = gson.fromJson(req.body(), User.class);
            sql2ouser.create(user);
            res.status(201);
            res.type("application/json");
            return gson.toJson(user);
        });
        get("/users", "application/json", (req, res) -> {
            res.type("application/json");
            return gson.toJson(sql2ouser.findAll());
        });


    }
}
