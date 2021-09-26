import models.Departments;
import models.News;
import com.google.gson.Gson;
import Sql2o.sql2oDepartments;
import org.sql2o.Sql2o;
import static spark.Spark.*;


import java.sql.Connection;

import static spark.route.HttpMethod.post;

public class App {
    public static void main(String[] args) {

        sql2oDepartments departments;
        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:~/jadle.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        departments = new sql2oDepartments(sql2o);

        post("/department/new", "application/json", (req, res) -> {
            Departments department1 = gson.fromJson(req.body(), Departments.class);
            departments.create(department1);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department1);
        });

    }
}
