import org.apache.spark.sql.*;

public class EventProcessor {
    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("SoundPulseEventProcessor")
                .master("local[*]")
                .getOrCreate();

        Dataset<Row> df = spark.read().json("data/music_events.json");

        df.createOrReplaceTempView("events");

        spark.sql("SELECT artistName, COUNT(*) as plays FROM events GROUP BY artistName ORDER BY plays DESC")
             .show();

        spark.stop();
    }
}
