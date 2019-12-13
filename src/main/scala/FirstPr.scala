import org.apache.spark.{SparkConf, SparkContext}

class FirstPr {

  def main(args: Array[String]): Unit = {

    val conf=new SparkConf().setAppName("first").setMaster("local")

    val sc=new SparkContext(conf)

    println("something wrong")
  }
}
