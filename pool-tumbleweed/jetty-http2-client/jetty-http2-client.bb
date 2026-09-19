SUMMARY = "http2-client module for Jetty"
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
This package contains http2-client module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-client-9.4.58-5.1.noarch.rpm"
RPM_HASH = "a97fcdf8a4ff2be6f934ef50e7ea666af418a91923bb7bdb59ff4ce6be80920d2bb60394dcb1709ce9ff29478dbd4e892f3580a42207ca0f0ef4c9d92805b5b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-client \
mvn-org.eclipse.jetty.http2-http2-client \
mvn-org.eclipse.jetty.http2-http2-client-pom- \
osgi-org.eclipse.jetty.http2.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-alpn-client \
mvn-org.eclipse.jetty.http2-http2-common"

inherit rpm
