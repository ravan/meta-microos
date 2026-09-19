SUMMARY = "Jakarta Commons DataBase Pooling Package"
DESCRIPTION = "The DBCP package creates and maintains a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package is available as a pseudo-JDBC driver and via a \
DataSource interface. The package also supports multiple logins to \
multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "apache-commons-dbcp-2.14.0-1.2.noarch.rpm"
RPM_HASH = "f6e1fa56694519f29ddc2a62221fb4a95f64e544ab309dd07ff64f88ce319b0675684dc9841dd5df0958608e9418c17b7f5edabc075b947b3539fb77c4a7b48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp \
commons-dbcp2 \
jakarta-commons-dbcp2 \
mvn-org.apache.commons-commons-dbcp2 \
mvn-org.apache.commons-commons-dbcp2-pom- \
osgi-org.apache.commons.commons-dbcp2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging \
mvn-javax.transaction-javax.transaction-api \
mvn-org.apache.commons-commons-pool2"

inherit rpm
