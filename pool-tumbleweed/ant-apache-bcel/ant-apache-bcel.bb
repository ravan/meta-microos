SUMMARY = "Optional apache bcel tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bcel tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-bcel-1.10.18-1.1.noarch.rpm"
RPM_HASH = "cf873ccba5a376e381312fe5e0cae42725ec5c71e05d3c5a2df730f369a15cd8c4ab20a6a51ed7395bc7f799525a872f8a25c6098f67e91acdf7184469754ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bcel \
ant-jakarta-bcel \
config-ant-apache-bcel \
mvn-org.apache.ant-ant-apache-bcel \
mvn-org.apache.ant-ant-apache-bcel-pom-"

RDEPENDS:${PN} += "ant \
bcel \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.bcel-bcel"

inherit rpm
