SUMMARY = "Official JDBC Driver for MySQL"
DESCRIPTION = "MySQL Connector/J is a native Java driver that converts JDBC (Java \
Database Connectivity) calls into the network protocol used by the \
MySQL database. It lets developers working with the Java programming \
language easily build programs and applets that interact with MySQL and \
connect all corporate data, even in a heterogeneous environment. MySQL \
Connector/J is a Type IV JDBC driver and has a complete JDBC feature \
set that supports the capabilities of MySQL."
LICENSE = "GPL-2.0-or-later"

PV = "9.3.0"

RPM_NAME = "mysql-connector-java-9.3.0-2.8.noarch.rpm"
RPM_HASH = "660fdc2d804e7ddb4f92d83424d546374ddcbb8ecb4700fd04812d0fbfcb52de5610790c2bd8a96354aa861a7aea18716fb60923ee4866021c619c5cf19f40d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mm.mysql \
mvn-com.mysql-mysql-connector-j \
mvn-com.mysql-mysql-connector-j-pom- \
mvn-com.mysql-mysql-connector-java \
mvn-com.mysql-mysql-connector-java-pom- \
mvn-mysql-mysql-connector-java \
mvn-mysql-mysql-connector-java-pom- \
mysql-connector-j \
mysql-connector-java \
mysql-connector-java-manual \
osgi-com.mysql.cj"

RDEPENDS:${PN} += "geronimo-jta-1-1-api \
java-headless \
javapackages-filesystem \
mvn-com.google.protobuf-protobuf-java \
reload4j \
slf4j"

inherit rpm
