SUMMARY = "The plus module for Jetty"
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
This package contains The plus module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-plus-9.4.58-5.1.noarch.rpm"
RPM_HASH = "c4f945d5e126ed2cc92ecae8b97a3e800900ee77aabfa639f63caf362ec2f17d70856086948acd8978ce3df80df48140a1d6f16a9b565a8819c76e439b848a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-plus \
mvn-org.eclipse.jetty-jetty-plus \
mvn-org.eclipse.jetty-jetty-plus-pom- \
osgi-org.eclipse.jetty.plus"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-jndi \
mvn-org.eclipse.jetty-jetty-webapp"

inherit rpm
