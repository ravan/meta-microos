SUMMARY = "J2EE Expression Language Implementation"
DESCRIPTION = "This project provides an implementation of the Expression Language (EL). \
The main goals are: \
 * Improves current implementation: bug fixes and performance improvements \
 * Provides API for use by other tools, such as Netbeans"
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.1~b08"

RPM_NAME = "glassfish-el-3.0.1~b08-3.8.noarch.rpm"
RPM_HASH = "b137708839e469f34c646da081d3149d4b8b826d1c7520396884c06429b842bbca6d135f4ef7a3e00b47afc48251d44cf5b0a17b0747bc118392951fd3ac9093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-el \
mvn-org.eclipse.jetty.orbit-com.sun.el \
mvn-org.eclipse.jetty.orbit-com.sun.el-pom- \
mvn-org.glassfish-javax.el \
mvn-org.glassfish-javax.el-impl \
mvn-org.glassfish-javax.el-impl-pom- \
mvn-org.glassfish-javax.el-pom- \
mvn-org.glassfish.web-javax.el \
mvn-org.glassfish.web-javax.el-pom- \
osgi-com.sun.el.javax.el"

RDEPENDS:${PN} += "glassfish-el-api \
java-headless \
javapackages-filesystem \
mvn-javax.el-javax.el-api"

inherit rpm
