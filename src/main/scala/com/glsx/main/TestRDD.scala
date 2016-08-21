package com.glsx.main

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by xiaolong on 2016/8/3.
  */
object TestRDD {
  def main(args: Array[String]) {
    val conf = new SparkConf().setAppName("Spark Pi")
    conf.setMaster("local")
    val sc = new SparkContext(conf)
    val rddInt = sc.makeRDD(List(1,2,3,4,5))
    rddInt.fold(0)((x,y) => x + y)

  }
}
