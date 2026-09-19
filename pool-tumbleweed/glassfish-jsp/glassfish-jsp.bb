SUMMARY = "Glassfish J2EE JSP API implementation"
DESCRIPTION = "This project provides a container independent implementation of JSP \
2.3. The main goals are: \
  * Improves current implementation: bug fixes and performance \
    improvements \
  * Provides API for use by other tools, such as Netbeans \
  * Provides a sandbox for new JSP features; provides a reference \
    implementation of next JSP spec."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.4"

RPM_NAME = "glassfish-jsp-2.3.4-7.5.noarch.rpm"
RPM_HASH = "6af40c3296a1d37e0909f1c34b12ec330d1fb3dd4b5010b9a7ca2aecc2c0e295b9332576df8e8c18f88b3938b2bf8786768875d7a22574ac040baadfc8770fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp \
javax.servlet.jsp \
jsp \
jsp2.3 \
mvn-org.eclipse.jetty.orbit-org.apache.jasper.glassfish \
mvn-org.eclipse.jetty.orbit-org.apache.jasper.glassfish-pom- \
mvn-org.glassfish.web-javax.servlet.jsp \
mvn-org.glassfish.web-javax.servlet.jsp-pom- \
osgi-org.glassfish.web.javax.servlet.jsp"

RDEPENDS:${PN} += "glassfish-jsp-api \
java-headless \
javapackages-filesystem \
mvn-javax.servlet.jsp-javax.servlet.jsp-api \
mvn-org.glassfish-javax.el"

inherit rpm
