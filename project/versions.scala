object versions {
  val scala = "2.10.6"
  val scalatest = "2.2.6"

  val spark = sys.env.getOrElse("SPARK_VERSION", "1.6.1")
}