SUMMARY = "The quickstart module for Jetty"
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
This package contains The quickstart module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-quickstart-9.4.58-5.1.noarch.rpm"
RPM_HASH = "d8563ea3f8cf3fff64eb433dad23956388298b6d61e4547c461abc4796163377ea9373cb7ffce75c797f1f2132e72e3801a2ec21d04b6b508b2e35fdb577da6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-quickstart \
mvn-org.eclipse.jetty-jetty-quickstart \
mvn-org.eclipse.jetty-jetty-quickstart-pom- \
osgi-org.eclipse.jetty.quickstart"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.transaction-javax.transaction-api \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-jmx \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
