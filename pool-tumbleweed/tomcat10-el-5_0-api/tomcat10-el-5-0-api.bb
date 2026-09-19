SUMMARY = "Expression Language v5.0 API"
DESCRIPTION = "Expression Language API version 5.0."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-el-5_0-api-10.1.59-1.1.noarch.rpm"
RPM_HASH = "fe0dde03eee960a47cd49ba3d1412863a5194bcfbd7c31abe40e6cc7375d39b84f8c10c76454e189a6b2f132ee4986a2bfeee41017c4ddf24affac6b5d7b642e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el-5-0-api \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-el-api-pom- \
mvn-org.eclipse.jetty.orbit-jakarta.el \
mvn-org.eclipse.jetty.orbit-jakarta.el-pom- \
osgi-org.apache.tomcat-el-api \
tomcat-el-5.0-api \
tomcat-implementation-el-api \
tomcat10-el-5-0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
