SUMMARY = "The alpn modules for Jetty (client components)"
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
This package contains The alpn modules for Jetty (client components)"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-alpn-client-9.4.58-5.1.noarch.rpm"
RPM_HASH = "1e64289f96d0062d706b42ab5baff2e7761e59bf5d0dbe7720d3a86e0d254cbd706b1acde1a70d02c1fe81a08be899775038ff9a8ef6f2076d300fcf88d75782"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-alpn-client \
mvn-org.eclipse.jetty-jetty-alpn-client \
mvn-org.eclipse.jetty-jetty-alpn-client-pom- \
mvn-org.eclipse.jetty-jetty-alpn-conscrypt-client \
mvn-org.eclipse.jetty-jetty-alpn-conscrypt-client-pom- \
mvn-org.eclipse.jetty-jetty-alpn-java-client \
mvn-org.eclipse.jetty-jetty-alpn-java-client-pom- \
mvn-org.eclipse.jetty-jetty-alpn-openjdk8-client \
mvn-org.eclipse.jetty-jetty-alpn-openjdk8-client-pom- \
osgi-org.eclipse.jetty.alpn.client \
osgi-org.eclipse.jetty.alpn.conscrypt.client \
osgi-org.eclipse.jetty.alpn.java.client \
osgi-org.eclipse.jetty.alpn.openjdk8.client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.conscrypt-conscrypt-openjdk-uber \
mvn-org.eclipse.jetty-jetty-io"

inherit rpm
