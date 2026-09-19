SUMMARY = "The jndi module for Jetty"
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
This package contains The jndi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-jndi-9.4.58-5.1.noarch.rpm"
RPM_HASH = "89dc4472606d07520f6f6d035bf3dd5cb05e806d4cf883e6abe25a14138077be3a11309073056ee48637c98c593bbb79f65de6159f1cee2abcd51fca9e0a6feb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi \
mvn-org.eclipse.jetty-jetty-jndi-pom- \
osgi-org.eclipse.jetty.jndi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
