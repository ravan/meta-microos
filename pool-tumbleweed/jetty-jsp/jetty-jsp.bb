SUMMARY = "The jsp module for Jetty"
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
This package contains The jsp module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-jsp-9.4.58-5.1.noarch.rpm"
RPM_HASH = "6300060849ac884de0748ce22bf5807d4a997e455d095a25870a5bba80e1b6fb7d5bd4f0252c967516dd45d9917d95318a780fc626e18523490edd34678e5552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jsp \
mvn-org.eclipse.jetty-apache-jsp \
mvn-org.eclipse.jetty-apache-jsp--nolog- \
mvn-org.eclipse.jetty-apache-jsp-pom- \
mvn-org.eclipse.jetty-jetty-jsp \
mvn-org.eclipse.jetty-jetty-jsp--nolog- \
mvn-org.eclipse.jetty-jetty-jsp-pom- \
osgi-org.eclipse.jetty.apache-jsp"

RDEPENDS:${PN} += "glassfish-el \
java-headless \
javapackages-filesystem \
mvn-javax.servlet-javax.servlet-api \
mvn-org.apache.tomcat-tomcat-jasper \
mvn-org.eclipse.jetty-jetty-annotations \
mvn-org.eclipse.jetty-jetty-util \
mvn-org.eclipse.jetty.toolchain-jetty-schemas"

inherit rpm
