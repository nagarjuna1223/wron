import org.apache.spark.sql.SparkSession

object Ssession {



  def main(args: Array[String]): Unit = {

   val spark=SparkSession
      .builder()
      .appName("session")
      .master("local")
      .getOrCreate()

   val df=spark
     .read
     .format("csv")
     .option("header",true)
     .option("inferSchema",true)
     .load("C:\\Users\\nagarjuna.mungara\\Downloads\\results-20191120-145533.csv")
df.show()


  }

}
