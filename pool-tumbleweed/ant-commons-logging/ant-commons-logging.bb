SUMMARY = "Optional commons logging tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional commons logging tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-commons-logging-1.10.18-1.1.noarch.rpm"
RPM_HASH = "afd9db7285f508a270820e7ae072f6232b40492d6014e4388c5d61b37fb1893d9370b55b602ac0cde6e865e053c407afced2d47035e2efe5a9b3440a77d2a356"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-commons-logging \
config-ant-commons-logging \
mvn-org.apache.ant-ant-commons-logging \
mvn-org.apache.ant-ant-commons-logging-pom-"

RDEPENDS:${PN} += "ant \
apache-commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging-api \
mvn-org.apache.ant-ant"

inherit rpm
