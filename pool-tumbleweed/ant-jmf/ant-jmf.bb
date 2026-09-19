SUMMARY = "Optional jmf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jmf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-jmf-1.10.18-1.1.noarch.rpm"
RPM_HASH = "4528840ae302d9fb6b4e6cf5f9e0318fddd5c1a6ce701b632aae2cda448137e4ebfef4160ba8c2435240b1888ba1732bde0d56ca5ae33dbbde687efbfa59cf76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jmf \
config-ant-jmf \
mvn-org.apache.ant-ant-jmf \
mvn-org.apache.ant-ant-jmf-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
