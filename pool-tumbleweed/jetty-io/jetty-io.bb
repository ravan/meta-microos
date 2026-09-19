SUMMARY = "The io module for Jetty"
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
This package contains The io module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-io-9.4.58-5.1.noarch.rpm"
RPM_HASH = "772223d04ed2ddcfac35453ef71089910571bfedc2ba5a48414b98e45e2464ad75d3910b4d001d76f386957eae2284aa5942dac754c1592b0c3bc242d4cb153f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-io \
mvn-org.eclipse.jetty-jetty-io \
mvn-org.eclipse.jetty-jetty-io-pom- \
osgi-org.eclipse.jetty.io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-util"

inherit rpm
