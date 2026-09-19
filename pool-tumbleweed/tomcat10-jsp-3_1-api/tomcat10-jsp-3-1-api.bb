SUMMARY = "Apache Tomcat JSP API implementation classes"
DESCRIPTION = "Apache Tomcat JSP API implementation classes version 3.1"
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-jsp-3_1-api-10.1.59-1.1.noarch.rpm"
RPM_HASH = "8a571078e1f8c16bebb30263ea1beed42704b6300a13d72e86ae66995fd0bc2b9dea96bc7d1076781a1f2fc46fa4c685c13d37678a2f1fb3041f982a5a9e4853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsp31 \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-jsp-api-pom- \
mvn-org.eclipse.jetty.orbit-jakarta.servlet.jsp \
mvn-org.eclipse.jetty.orbit-jakarta.servlet.jsp-pom- \
osgi-org.apache.tomcat-jsp-api \
tomcat-implementation-jsp-api \
tomcat-jsp-3.1-api \
tomcat10-jsp-3-1-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-servlet-api"

inherit rpm
