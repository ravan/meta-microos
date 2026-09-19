SUMMARY = "Optional jsch tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jsch tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-jsch-1.10.18-1.1.noarch.rpm"
RPM_HASH = "30281bc66415d9ea9e1a2af9dd82e05745a9ddeb8ded7ecf61d2245fb0502778cdf20da8a4b2ed47309860dff7d9a89e2ceff97e7f0d99e4d11fdc2140a02272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jsch \
config-ant-jsch \
mvn-org.apache.ant-ant-jsch \
mvn-org.apache.ant-ant-jsch-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
jsch \
mvn-com.jcraft-jsch \
mvn-org.apache.ant-ant"

inherit rpm
