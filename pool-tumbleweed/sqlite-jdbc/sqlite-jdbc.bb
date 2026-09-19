SUMMARY = "SQLite JDBC Driver"
DESCRIPTION = "SQLite JDBC is a library for accessing and creating SQLite database files in \
Java. \
 \
Our SQLiteJDBC library requires no configuration since native libraries for \
major OSs, including Windows, Mac OS X, Linux etc., are assembled into a single \
JAR (Java Archive) file. The usage is quite simple; download our sqlite-jdbc \
library, then append the library (JAR file) to your class path."
LICENSE = "Apache-2.0"

PV = "3.53.4.0"

RPM_NAME = "sqlite-jdbc-3.53.4.0-1.1.aarch64.rpm"
RPM_HASH = "77c704dd1892d00665097317a8593214bf49e1f08e1be305a334a3baeb2e4e0292952cd788372f58e7b8b5469c9ebe9f43db337ed8ca383ba2eed867080126d5"

RPROVIDES:${PN} += "mvn-org.xerial-sqlite-jdbc \
mvn-org.xerial-sqlite-jdbc-pom- \
osgi-org.xerial.sqlite-jdbc \
sqlite-jdbc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
