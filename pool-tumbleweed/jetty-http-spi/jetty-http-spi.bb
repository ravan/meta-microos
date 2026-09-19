SUMMARY = "The http-spi module for Jetty"
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
This package contains The http-spi module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http-spi-9.4.58-5.1.noarch.rpm"
RPM_HASH = "d7faaa1e6b9207b51d0969dc1c62a55246f7cd4c6033a8836a0f03a926ee71b2501a00c13c3a39304024da181a10e3a056e944b3c9ed20f1f8a6c9fc6d82618a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi \
mvn-org.eclipse.jetty-jetty-http-spi-pom- \
osgi-org.eclipse.jetty.http.spi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
