SUMMARY = "The jaspi module for Jetty"
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
This package contains The jaspi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-jaspi-9.4.58-5.1.noarch.rpm"
RPM_HASH = "7904fca1984584d6fac506bb8bc1620e2bb3670fad43b98b4628e7e82a464f8939d1e07ade3d593ff9de8e95ee529598521a061a2d79c1ab2d4a0fc89f7f96c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaspi \
mvn-org.eclipse.jetty-jetty-jaspi \
mvn-org.eclipse.jetty-jetty-jaspi-pom- \
osgi-org.eclipse.jetty.security.jaspi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-jaspic-api \
mvn-org.eclipse.jetty-jetty-security"

inherit rpm
