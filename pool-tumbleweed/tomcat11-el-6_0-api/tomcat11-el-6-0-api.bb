SUMMARY = "Expression Language v6.0 API"
DESCRIPTION = "Expression Language API version 6.0."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-el-6_0-api-11.0.25-1.1.noarch.rpm"
RPM_HASH = "0767946a3b5cb8da6a566f4c16ce8922cca84cc1bc829144d5d608691e4487f3e3e27dff779aaa2687eceaedf0e3e6ae214e64875d6ddc4cba22ad25346ef75b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el-6-0-api \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-el-api-pom- \
mvn-org.eclipse.jetty.orbit-jakarta.el \
mvn-org.eclipse.jetty.orbit-jakarta.el-pom- \
osgi-org.apache.tomcat-el-api \
tomcat-el-6.0-api \
tomcat-implementation-el-api \
tomcat11-el-6-0-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
