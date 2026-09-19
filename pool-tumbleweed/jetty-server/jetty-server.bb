SUMMARY = "The server module for Jetty"
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
This package contains The server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-server-9.4.58-5.1.noarch.rpm"
RPM_HASH = "d213c9b7c9931a9d2969da643c579a2578066b8c0da5e300ed0454148290939f80a9f9c6d5e741d4044c2853b8738afa0e7ce73b97edbc9ef770fcabf8f9794f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-server \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-server-pom- \
osgi-org.eclipse.jetty.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io"

inherit rpm
