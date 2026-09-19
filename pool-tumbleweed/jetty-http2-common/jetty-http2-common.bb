SUMMARY = "http2-common module for Jetty"
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
This package contains http2-common module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-common-9.4.58-5.1.noarch.rpm"
RPM_HASH = "45442220c2ba4d66bc1b2d699f42f8eae2562bb40cbaaf0ce14dd4826a2b224b61a09a6d3ce70e48fb57201a227c9aa61cac82c44a8ad95170f8dfa55c1be0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-common \
mvn-org.eclipse.jetty.http2-http2-common \
mvn-org.eclipse.jetty.http2-http2-common-pom- \
osgi-org.eclipse.jetty.http2.common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty.http2-http2-hpack"

inherit rpm
