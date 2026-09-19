SUMMARY = "The cdi module for Jetty"
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
This package contains The cdi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-cdi-9.4.58-5.1.noarch.rpm"
RPM_HASH = "8eb47472fe77f37b0a85cca88178d556426dfec4c4b0fc2bcee674615b7fc958a06e0ff1f9a14d8af8e0c8702612189156703853c384b3b87378164da0673dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-cdi \
mvn-org.eclipse.jetty-jetty-cdi \
mvn-org.eclipse.jetty-jetty-cdi-pom- \
osgi-org.eclipse.jetty.cdi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty-jetty-webapp \
mvn-org.jboss.logging-jboss-logging"

inherit rpm
