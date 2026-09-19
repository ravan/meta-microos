SUMMARY = "The openid module for Jetty"
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
This package contains The openid module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-openid-9.4.58-5.1.noarch.rpm"
RPM_HASH = "b6c141edd35ffaf09efd4913f13a4019494974416df33a9b7e829d667e899e78447470663dfed441947c413eee8154ae0b0728ef3f7439f11820dafdaf62950b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-openid \
mvn-org.eclipse.jetty-jetty-openid \
mvn-org.eclipse.jetty-jetty-openid-pom- \
osgi-org.eclipse.jetty.openid"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-client \
mvn-org.eclipse.jetty-jetty-security \
mvn-org.eclipse.jetty-jetty-server \
mvn-org.eclipse.jetty-jetty-util-ajax"

inherit rpm
