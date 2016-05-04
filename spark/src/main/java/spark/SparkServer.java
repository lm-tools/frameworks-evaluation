package spark;

import static spark.Spark.*;

public class SparkServer {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}
