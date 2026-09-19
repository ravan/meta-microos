SUMMARY = "Optional swing tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional swing tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-swing-1.10.18-1.1.noarch.rpm"
RPM_HASH = "737779a18b632fbf089affdeec5b7208271328ad81c9cd53304d7709465d481961bf628e6d3d4c88fb13e16cce7fc90bf2d3c9db3a35586568ab79c23a7f532c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-swing \
config-ant-swing \
mvn-org.apache.ant-ant-swing \
mvn-org.apache.ant-ant-swing-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
