SUMMARY = "http2-server module for Jetty"
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
This package contains http2-server module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-server-9.4.58-5.1.noarch.rpm"
RPM_HASH = "ca1faf3044c5a1ccc80622588bf62ebf1c31102c717cea568e3399f09bd5b20cf35d93dc625461584c04f092acb1332d8841c8852074d9accdfd5805232a2b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-server \
mvn-org.eclipse.jetty.http2-http2-server \
mvn-org.eclipse.jetty.http2-http2-server-pom- \
osgi-org.eclipse.jetty.http2.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty.http2-http2-common"

inherit rpm
