SUMMARY = "Java regression testing framework (minimal)"
DESCRIPTION = "JUnit is a popular regression testing framework for Java platform."
LICENSE = "EPL-2.0"

PV = "5.14.4"

RPM_NAME = "junit5-minimal-5.14.4-2.3.noarch.rpm"
RPM_HASH = "1d5a8d52309c02c15207077b8d8df6e5f69d0cd9439a77870ca03e0c9b6065cd10505d7d7830d3fe1dd013104cf0c891d6237c0be1c4e56179f7d5e89003ae17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit5-minimal \
mvn-org.junit.jupiter-junit-jupiter-api \
mvn-org.junit.jupiter-junit-jupiter-api-pom- \
mvn-org.junit.platform-junit-platform-commons \
mvn-org.junit.platform-junit-platform-commons-pom- \
mvn-org.junit.platform-junit-platform-engine \
mvn-org.junit.platform-junit-platform-engine-pom- \
mvn-org.junit.platform-junit-platform-launcher \
mvn-org.junit.platform-junit-platform-launcher-pom- \
osgi-junit-jupiter-api \
osgi-junit-platform-commons \
osgi-junit-platform-engine \
osgi-junit-platform-launcher"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-org.opentest4j-opentest4j"

inherit rpm
