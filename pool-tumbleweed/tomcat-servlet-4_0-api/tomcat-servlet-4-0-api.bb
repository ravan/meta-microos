SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 3.1"
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-servlet-4_0-api-9.0.121-1.1.noarch.rpm"
RPM_HASH = "5c8598ed4cd48a9957514ffc8825ecbcbc71bcca762d00e6f37d41f9d97b32c44fe13a50c044c0bd202ed7b8cbe3e57474570c8a9350044750af113012e66f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.apache.tomcat-tomcat-servlet-api-pom- \
mvn-org.mortbay.jetty-servlet-api \
mvn-org.mortbay.jetty-servlet-api-pom- \
osgi-org.apache.tomcat-servlet-api \
servlet \
servlet31 \
servlet7 \
tomcat-implementation-servlet-api \
tomcat-servlet-4-0-api \
tomcat-servlet-4.0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
