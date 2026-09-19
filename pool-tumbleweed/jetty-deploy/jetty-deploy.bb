SUMMARY = "The deploy module for Jetty"
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
This package contains The deploy module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-deploy-9.4.58-5.1.noarch.rpm"
RPM_HASH = "f42b1bbe1eafcd70f5ff056f53743408563b5f12394e03a3a01cf1038657064f634021734ae7811fe51e53833380f0048c4a5027c07e4f0e9a795f08b3390876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-deploy \
mvn-org.eclipse.jetty-jetty-deploy \
mvn-org.eclipse.jetty-jetty-deploy-pom- \
osgi-org.eclipse.jetty.deploy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-webapp \
mvn-org.eclipse.jetty-jetty-xml"

inherit rpm
