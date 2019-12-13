import org.apache.spark.sql.SparkSession

object WindowSource {

  def main(args: Array[String]): Unit = {


    val spark=SparkSession
      .builder()
      .appName("window sorce")
      .master("local")
      .getOrCreate()



    //read the data from windows file system


    val df=spark
      .read
      .format("csv")
      .option("header",true)
      .option("inferSchema",true)
     .load("C:\\Users\\nagarjuna.mungara\\Downloads\\results-20191120-145533.csv")

 // you should keep \\ and should keep .csv extension

    df.show()

    // writing data into windows file system with diff file formates

   df.write
      .format("json")
      .save("C:\\Users\\nagarjuna.mungara\\Downloads\\json5")



  }

}
