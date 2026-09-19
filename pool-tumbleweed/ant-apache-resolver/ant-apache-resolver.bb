SUMMARY = "Optional apache resolver tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache resolver tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-resolver-1.10.18-1.1.noarch.rpm"
RPM_HASH = "273a8de102c84b8e5eb84a8e0a30f880f66cb2f1814a3bd37de9a559ca20e9147fa3ac9459a58ab357e0e10f18826b6f819bb3d629a6d2a8dd132092c773493e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-resolver \
config-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver \
mvn-org.apache.ant-ant-apache-resolver-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xml-resolver-xml-resolver \
xml-resolver"

inherit rpm
