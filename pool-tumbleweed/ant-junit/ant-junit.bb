SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-junit-1.10.18-1.1.noarch.rpm"
RPM_HASH = "d222b55c3d0c9ae9d13809186dc3f24a81509a64cc20c58c32d07bcfec2dbc365b34f96acd1dfe83088bab205da68d642b03b6f754afef1fecd3248b695bf13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit \
config-ant-junit \
mvn-org.apache.ant-ant-junit \
mvn-org.apache.ant-ant-junit-pom- \
mvn-org.apache.ant-ant-junit4 \
mvn-org.apache.ant-ant-junit4-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit4 \
mvn-junit-junit \
mvn-org.apache.ant-ant"

inherit rpm
