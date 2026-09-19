SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 4.0"
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-jsp-4_0-api-11.0.25-1.1.noarch.rpm"
RPM_HASH = "8d31b2298e8cfe22f581d8a6561371de26e67efdceac9e0a65305273228dad26ddb1a0ae63c3cd636efc919641d7e11bbb09b2601763330eba2db51e1b99e482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp40 \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-jsp-api-pom- \
mvn-org.eclipse.jetty.orbit-jakarta.servlet.jsp \
mvn-org.eclipse.jetty.orbit-jakarta.servlet.jsp-pom- \
osgi-org.apache.tomcat-jsp-api \
tomcat-implementation-jsp-api \
tomcat-jsp-4.0-api \
tomcat11-jsp-4-0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-servlet-api"

inherit rpm
