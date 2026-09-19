SUMMARY = "The alpn modules for Jetty (server components)"
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
This package contains The alpn modules for Jetty (server components)"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-alpn-server-9.4.58-5.1.noarch.rpm"
RPM_HASH = "f1c7f91a4ff26270f557e7476dc1ab5bf781da56a58f3d0f932fc24dd5f09524c70fd43c2adc8af415c18c7f5b863967dbba93ba198a76d272d6d3665ebfed2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-alpn-server \
mvn-org.eclipse.jetty-jetty-alpn-conscrypt-server \
mvn-org.eclipse.jetty-jetty-alpn-conscrypt-server-pom- \
mvn-org.eclipse.jetty-jetty-alpn-java-server \
mvn-org.eclipse.jetty-jetty-alpn-java-server-pom- \
mvn-org.eclipse.jetty-jetty-alpn-openjdk8-server \
mvn-org.eclipse.jetty-jetty-alpn-openjdk8-server-pom- \
mvn-org.eclipse.jetty-jetty-alpn-server \
mvn-org.eclipse.jetty-jetty-alpn-server-pom- \
osgi-org.eclipse.jetty.alpn.conscrypt.server \
osgi-org.eclipse.jetty.alpn.java.server \
osgi-org.eclipse.jetty.alpn.openjdk8.server \
osgi-org.eclipse.jetty.alpn.server"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.conscrypt-conscrypt-openjdk-uber \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-server"

inherit rpm
