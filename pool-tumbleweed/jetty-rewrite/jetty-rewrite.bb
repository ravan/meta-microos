SUMMARY = "The rewrite module for Jetty"
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
This package contains The rewrite module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-rewrite-9.4.58-5.1.noarch.rpm"
RPM_HASH = "2b3abc0166f48ea80cbbb69cc493e2bae509df9b823d7793ddd28f3612694683638597b590021b42241581b33b266266025abab3f4bc8e891a2d01adbd6cada6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-rewrite \
mvn-org.eclipse.jetty-jetty-rewrite \
mvn-org.eclipse.jetty-jetty-rewrite-pom- \
osgi-org.eclipse.jetty.rewrite"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
