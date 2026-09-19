SUMMARY = "The jmx module for Jetty"
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
This package contains The jmx module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-jmx-9.4.58-5.1.noarch.rpm"
RPM_HASH = "ce0f05fb49151d82249c556e412b9f6066ec52112921c2b2c7c587884a117c787bc1d93e7d9f7917601425572b555190c6b922083a7918d35008998bd1e64c0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jmx \
mvn-org.eclipse.jetty-jetty-jmx \
mvn-org.eclipse.jetty-jetty-jmx-pom- \
osgi-org.eclipse.jetty.jmx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
