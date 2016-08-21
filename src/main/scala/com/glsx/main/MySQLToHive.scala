package com.glsx.main

import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xiaolong on 2016/8/16.
  */
object MySQLToHive {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("MySQLToHive")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    val glsx_common_merchant = sqlContext.read.format("jdbc").options(Map("url" -> "jdbc:mysql://192.168.3.201:3306/cyb_os",
      "dbtable" -> "glsx_common_merchant", "user" -> "yunying_luys", "password" -> "cyb_pwd_0721")).load();
    glsx_common_merchant.saveAsTable("cyb_os.glsx_common_merchant");
    sc.stop()
  }
}
