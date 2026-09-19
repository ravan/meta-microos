SUMMARY = "http2-hpack module for Jetty"
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
This package contains http2-hpack module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-http2-hpack-9.4.58-5.1.noarch.rpm"
RPM_HASH = "0931667ffd573fc22527de3a166f6b73aad2a4b61749c2b4bae931555c8fe3d931b92ca6911fd16b00fe1797702b6fa3f50c50430d35cf2f502957e183281707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-http2-hpack \
mvn-org.eclipse.jetty.http2-http2-hpack \
mvn-org.eclipse.jetty.http2-http2-hpack-pom- \
osgi-org.eclipse.jetty.http2.hpack"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-http \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
