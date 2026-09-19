SUMMARY = "Gradient Boosting (GBDT, GBRT or GBM) Library"
DESCRIPTION = "Scalable, Portable and Distributed Gradient Boosting (GBDT, GBRT or \
GBM) Library, for Python, R, Java, Scala, C++ and more. Runs on \
single machine, Hadoop, Spark, Flink and DataFlow"
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "xgboost-2.0.0-4.5.aarch64.rpm"
RPM_HASH = "1c73d8c2516a5ef2f6c23c8fd543be03fa5f09fc9a932e9acc54b07b59fc45e7375dc53c42422700fa0d42ca58dc5f2da969e14e1ab53e570245d5db8a49d7c4"

RPROVIDES:${PN} += "mvn-ml.dmlc-xgboost4j \
mvn-ml.dmlc-xgboost4j-2.13 \
mvn-ml.dmlc-xgboost4j-2.13-pom- \
mvn-ml.dmlc-xgboost4j-pom- \
xgboost"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.esotericsoftware-kryo \
mvn-commons-logging-commons-logging \
mvn-org.scala-lang-scala-compiler \
mvn-org.scala-lang-scala-library"

inherit rpm
