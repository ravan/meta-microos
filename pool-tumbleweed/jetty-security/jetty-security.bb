SUMMARY = "The security module for Jetty"
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
This package contains The security module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-security-9.4.58-5.1.noarch.rpm"
RPM_HASH = "0d3a17312c5298576582c2a1d50fedb6e953942470046536d0bd77444271983a4b41bb3feef5b63ed4ab5b12a3c7366b76fba025954424354f3e449c707393f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-security \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-security-pom- \
osgi-org.eclipse.jetty.security"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
