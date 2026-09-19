SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 6.0"
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-servlet-6_0-api-10.1.59-1.1.noarch.rpm"
RPM_HASH = "ae9a2cd13a572c91756d0671a29830ea0c60abd4b7d0a805b84e2713e95116c35112f80fd94ac434f726eb280fe89e16de831d7e2da7d8a01e6bfbf0cbe013d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.apache.tomcat-tomcat-servlet-api-pom- \
mvn-org.mortbay.jetty-servlet-api \
mvn-org.mortbay.jetty-servlet-api-pom- \
osgi-org.apache.tomcat-servlet-api \
servlet11 \
servlet60 \
tomcat-implementation-servlet-api \
tomcat-servlet-6.0-api \
tomcat10-servlet-6-0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
