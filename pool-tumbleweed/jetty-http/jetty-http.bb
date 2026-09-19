SUMMARY = "The http module for Jetty"
DESCRIPTION = " \
Jetty is a 100% Java HTTP Server and Servlet Container. This means that you \
do not need to configure and run a separate web server (like Apache) in order \
to use Java, servlets and JSPs to generate dynamic content. Jetty is a fully \
featured web server for static and dynamic content. Unlike separate \
server/container solutions, this means that your web server and web \
application run in the same process, without interconnection overheads \
and complications. Furthermore, as a pure java component, Jetty can be simply \
included in your application for demonstration, distribution or deployment. \
Jetty is available on all Java supported platforms. \
 \
This package contains The http module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http-9.4.58-5.1.noarch.rpm"
RPM_HASH = "4ac882b42f5d17bbfa19e7b11b56901d9deec3bbbeda7aa8c54359da55c4ecebc519a5c2e0546d57285cb7fcf1717f2441f53a49b8a3405d5a32acbc017693e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-http-pom- \
osgi-org.eclipse.jetty.http"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
