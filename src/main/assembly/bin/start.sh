#!/bin/bash

spark-submit --class com.glsx.spark.other.Mysql2Hive \
#--master yarn \
#--deploy-mode client \
--driver-memory 2g \
--executor-memory 4g \
--executor-cores 2 \
--queue thequeue \
lib/spark-demo-1.0.jar