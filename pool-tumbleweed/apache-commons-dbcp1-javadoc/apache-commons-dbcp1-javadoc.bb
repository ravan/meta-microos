SUMMARY = "Javadoc for jakarta-commons-dbcp"
DESCRIPTION = "This package contains the javadoc documentation for the DBCP package. \
 \
The DBCP package shall create and maintain a database connection pool \
package written in the Java language to be distributed under the ASF \
license. The package shall be available as a pseudo-JDBC driver and via \
a DataSource interface. The package shall also support multiple logins \
to multiple database systems, reclamation of stale or dead connections, \
testing for valid connections, PreparedStatement pooling, and other \
features."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "apache-commons-dbcp1-javadoc-1.4-6.5.noarch.rpm"
RPM_HASH = "487ee49aa596317f1443a79b2ac5c8c644a150e3618b3b759b581270e0f8b0fcffbb63b690c083de17309ee1efa4ee5c157681e6914d926cfd9c80142d745fbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp1-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
