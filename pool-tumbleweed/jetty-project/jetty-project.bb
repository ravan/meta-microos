SUMMARY = "POM files for Jetty"
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
This package contains POM files for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-project-9.4.58-5.1.noarch.rpm"
RPM_HASH = "ee7c5f1e89391dd1d8015a61b662b4ddaabe324f5d4ff6b49f73556fce8b630d9ef94d27669cd5fcaf238af562fb0c30048be5b2d5ee10f3e3001753fd687808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-project \
mvn-org.eclipse.jetty-jetty-bom-pom- \
mvn-org.eclipse.jetty-jetty-project-pom- \
mvn-org.eclipse.jetty.fcgi-fcgi-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
