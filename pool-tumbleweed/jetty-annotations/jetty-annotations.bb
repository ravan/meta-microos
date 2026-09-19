SUMMARY = "The annotations module for Jetty"
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
This package contains The annotations module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-annotations-9.4.58-5.1.noarch.rpm"
RPM_HASH = "f096cfedf91f60181851b1f5f31931bd48c4f61173711c23c87341844779b74ab44f1b82d1c969c8faa3f6863be6f17b2c953452f9cb4901d1a2798403a95a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-annotations \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-annotations-pom- \
osgi-org.eclipse.jetty.annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-webapp \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
