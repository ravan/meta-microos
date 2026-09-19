SUMMARY = "Optional apache log4j tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache log4j tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-log4j-1.10.18-1.1.noarch.rpm"
RPM_HASH = "c47fe8eb059300a52e4658d7a77f690e0e4e68f4b69c392e51720f8828f2239251dddaa9d5f93b377dd37dce38398135bdcae40c0f4a16b59caf0e2aa0661ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-log4j \
ant-jakarta-log4j \
config-ant-apache-log4j \
mvn-org.apache.ant-ant-apache-log4j \
mvn-org.apache.ant-ant-apache-log4j-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-log4j-log4j \
mvn-org.apache.ant-ant \
reload4j"

inherit rpm
