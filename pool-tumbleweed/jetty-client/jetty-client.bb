SUMMARY = "The client module for Jetty"
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
This package contains The client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-client-9.4.58-5.1.noarch.rpm"
RPM_HASH = "e9a752a42adda706dfeca1bc98cb1cbf4b27d5e5b255e299db60bcc37d1291eecbb22def5d63bc58d9ed8357087e68b30343081ece6e91ed2fdcb376481ec474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-client \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-client-pom- \
osgi-org.eclipse.jetty.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io"

inherit rpm
