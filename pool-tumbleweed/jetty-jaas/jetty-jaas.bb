SUMMARY = "The jaas module for Jetty"
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
This package contains The jaas module for Jetty."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-jaas-9.4.58-5.1.noarch.rpm"
RPM_HASH = "21b168acc86c55c19135a1432a7c9c25861e03b798e3eb3e49db5ceae3b721ef63aa2013831aee05efe95b6752dc983fe712a821cf897b5c1be1a5e3b490f194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas \
mvn-org.eclipse.jetty-jetty-jaas-pom- \
osgi-org.eclipse.jetty.jaas"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.eclipse.jetty-jetty-security"

inherit rpm
