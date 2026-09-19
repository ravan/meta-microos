SUMMARY = "Expression Language v3.0 API"
DESCRIPTION = "Expression Language API version 3.0."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-el-3_0-api-9.0.121-1.1.noarch.rpm"
RPM_HASH = "10c2cf35ebc416ec4f1368d20862b7b9ebb5d07b1eadbc49ac332164279ee6d8eba43eaf354420e70e3b7c301ebed83b463d931aa819a5ffeb9910e8ab3c44f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-el-api-pom- \
mvn-org.eclipse.jetty.orbit-javax.el \
mvn-org.eclipse.jetty.orbit-javax.el-pom- \
osgi-org.apache.tomcat-el-api \
tomcat-el-3-0-api \
tomcat-el-3.0-api \
tomcat-implementation-el-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
