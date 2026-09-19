SUMMARY = "Optional commons net tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons net tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-commons-net-1.10.18-1.1.noarch.rpm"
RPM_HASH = "ba30278a58486f3bd6330b5ca0c875761b61679335129cc1fe0d631aae83c4bbbb1657b0ea8aff7ae41713741f3dc06d290023ba857e558968594f0a3ba02e0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-net \
config-ant-commons-net \
mvn-org.apache.ant-ant-commons-net \
mvn-org.apache.ant-ant-commons-net-pom-"

RDEPENDS:${PN} += "ant \
apache-commons-net \
java-headless \
javapackages-filesystem \
mvn-commons-net-commons-net \
mvn-org.apache.ant-ant"

inherit rpm
