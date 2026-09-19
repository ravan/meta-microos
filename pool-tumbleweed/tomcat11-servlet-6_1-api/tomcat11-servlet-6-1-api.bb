SUMMARY = "Apache Tomcat Servlet API implementation classes"
DESCRIPTION = "Apache Tomcat Servlet API implementation classes version 6.1"
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-servlet-6_1-api-11.0.25-1.1.noarch.rpm"
RPM_HASH = "e2974bf39c67d33711603b58412c3869eae74be5dc744719c5be6e5ccaee224ff3c1750f4f449172369af9715f7fdf4e56597c93695d22d4a7d7713d855c3afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.apache.tomcat-tomcat-servlet-api-pom- \
mvn-org.mortbay.jetty-servlet-api \
mvn-org.mortbay.jetty-servlet-api-pom- \
osgi-org.apache.tomcat-servlet-api \
servlet11 \
servlet60 \
tomcat-implementation-servlet-api \
tomcat-servlet-6.1-api \
tomcat11-servlet-6-1-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
