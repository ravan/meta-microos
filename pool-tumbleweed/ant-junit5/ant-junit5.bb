SUMMARY = "Optional junit tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional JUnit5 tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-junit5-1.10.18-1.1.noarch.rpm"
RPM_HASH = "32c2527705b11f145412137510eb4137943a6f1e0f4b369f5bc66d22510b5c69f6a042595a996b2df1a9bf3a08c515482fed7a08079dddcb2ee769c9523bf7b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-junit5 \
config-ant-junit5 \
mvn-org.apache.ant-ant-junitlauncher \
mvn-org.apache.ant-ant-junitlauncher-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit5 \
mvn-org.apache.ant-ant \
mvn-org.junit.platform-junit-platform-launcher"

inherit rpm
