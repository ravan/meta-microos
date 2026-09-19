SUMMARY = "The start module for Jetty"
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
This package contains The start module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-start-9.4.58-5.1.noarch.rpm"
RPM_HASH = "43951bf2e87b3a79b4c2dea92eda982b26fece1c1937688142dbede929201eaa4b45ede83cfa8535fd39216ddd6e7ff263b23f9588698176e856b38ef98746f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-start \
mvn-org.eclipse.jetty-jetty-start \
mvn-org.eclipse.jetty-jetty-start-pom- \
osgi-org.eclipse.jetty.start"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
