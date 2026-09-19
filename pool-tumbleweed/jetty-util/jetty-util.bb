SUMMARY = "The util module for Jetty"
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
This package contains The util module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-util-9.4.58-5.1.noarch.rpm"
RPM_HASH = "7fdd6c3f6ce2d1f8345366f873614971c9f87aac0fda78a70d3b2a9fd5c140705b2f2a1839bfdbdeefbc33ad0aeb10478ee88cdd11918eff34e0da8736af9a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-util \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty-jetty-util-pom- \
osgi-org.eclipse.jetty.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
