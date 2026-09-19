SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 2.3"
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-jsp-2_3-api-9.0.121-1.1.noarch.rpm"
RPM_HASH = "82d9b6022ecfef524804a814df432ecb6ba6e56e210dda64e751cfb6e63592f812d9b7d692eccf033b82ec3a88c5272594e3132670e202af915f84fc7ba2fce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp \
jsp23 \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-jsp-api-pom- \
mvn-org.eclipse.jetty.orbit-javax.servlet.jsp \
mvn-org.eclipse.jetty.orbit-javax.servlet.jsp-pom- \
osgi-org.apache.tomcat-jsp-api \
tomcat-implementation-jsp-api \
tomcat-jsp-2-3-api \
tomcat-jsp-2.3-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-servlet-api"

inherit rpm
