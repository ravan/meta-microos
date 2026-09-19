SUMMARY = "Optional jdepend tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jdepend tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-jdepend-1.10.18-1.1.noarch.rpm"
RPM_HASH = "b54a92d6408976967ba7132fb55691389844ffbe212e6e71db2978eeaf5a918a369b6cabccca373e8ccde17e33dda7c939660119a2a38c512810e6031823b576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jdepend \
config-ant-jdepend \
mvn-org.apache.ant-ant-jdepend \
mvn-org.apache.ant-ant-jdepend-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
jdepend \
mvn-jdepend-jdepend \
mvn-org.apache.ant-ant"

inherit rpm
