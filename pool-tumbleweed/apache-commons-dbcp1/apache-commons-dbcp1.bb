SUMMARY = "Jakarta Commons DataBase Pooling Package"
DESCRIPTION = "The DBCP package creates and maintains a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package is available as a pseudo-JDBC driver and via a \
DataSource interface. The package also supports multiple logins to \
multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "apache-commons-dbcp1-1.4-6.5.noarch.rpm"
RPM_HASH = "1fa45a49583994294b678ba52d97c68cdab07169f93ae8632ba53e381b5c8def7bac60bdf930e8d014e6cc63a0ec30e10f70f8b2f443f8b85f673d9b41c8b9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1 \
commons-dbcp \
jakarta-commons-dbcp \
mvn-commons-dbcp-commons-dbcp \
mvn-commons-dbcp-commons-dbcp-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-pool-commons-pool"

inherit rpm
