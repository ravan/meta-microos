SUMMARY = "Optional imageio tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional imageio tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-imageio-1.10.18-1.1.noarch.rpm"
RPM_HASH = "98eb159d8138507bb06a03d20abf3bf7dde825e00d2eab3739dd6e078d37bd45538365b100e331f02ada314bee7cd61bda87b3681e39d2104e66ad873efbff83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-imageio \
config-ant-imageio \
mvn-org.apache.ant-ant-imageio \
mvn-org.apache.ant-ant-imageio-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant"

inherit rpm
