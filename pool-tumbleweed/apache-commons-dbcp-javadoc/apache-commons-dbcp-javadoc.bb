SUMMARY = "Javadoc for apache-commons-dbcp"
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

PV = "2.14.0"

RPM_NAME = "apache-commons-dbcp-javadoc-2.14.0-1.2.noarch.rpm"
RPM_HASH = "94ef928a6df4f545ff89fb6f0a28a222b734478da35cb1c919c497b25fb907c6716db6f85e31528caf1a4cc349c02545816d2efc9a20ef9becf93bf0bcb5823c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-dbcp-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
