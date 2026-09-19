SUMMARY = "http2-http-client-transport module for Jetty"
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
This package contains http2-http-client-transport module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-http-client-transport-9.4.58-5.1.noarch.rpm"
RPM_HASH = "d15b10853ef5e85285e2d39e6af27539be3dde6075ab9cb8ac2c2fd116883656b506fafcd6443631f362abb76f252b91d51c1c9bd5cf07135d92aa86a5dd9321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-http-client-transport \
mvn-org.eclipse.jetty.http2-http2-http-client-transport \
mvn-org.eclipse.jetty.http2-http2-http-client-transport-pom- \
osgi-org.eclipse.jetty.http2.client.http"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-alpn-java-client \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty.http2-http2-client"

inherit rpm
