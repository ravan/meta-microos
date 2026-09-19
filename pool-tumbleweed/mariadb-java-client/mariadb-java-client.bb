SUMMARY = "Connects applications developed in Java to MariaDB and MySQL databases"
DESCRIPTION = "MariaDB Connector/J is a Type 4 JDBC driver, also known as the Direct to \
Database Pure Java Driver. It was developed specifically as a lightweight \
JDBC connector for use with MySQL and MariaDB database servers."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "3.5.0"

RPM_NAME = "mariadb-java-client-3.5.0-2.5.aarch64.rpm"
RPM_HASH = "2f063e437e90f51c5acb2965e5b05e1d5ec0d510a25bc712f5682f357c900278fd3c637ed0f7609bb6cc5861ab7856eef93062ecb7b90fa8df189fa17792e9cf"

RPROVIDES:${PN} += "mariadb-java-client \
mvn-mariadb-mariadb-connector-java \
mvn-mariadb-mariadb-connector-java-pom- \
mvn-org.mariadb.jdbc-mariadb-java-client \
mvn-org.mariadb.jdbc-mariadb-java-client-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mariadb \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-platform \
mvn-org.slf4j-slf4j-api"

inherit rpm
