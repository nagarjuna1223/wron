import org.apache.spark.{SparkConf, SparkContext}

object Second {

  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setMaster("local").setAppName("sec")
    val sc=new SparkContext(conf)

val rdd=sc.parallelize(List(1,2,3,4,5,6))

    rdd.foreach(println)

  }
}
