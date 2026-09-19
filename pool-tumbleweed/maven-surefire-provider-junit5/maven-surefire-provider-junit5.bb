SUMMARY = "JUnit 5 provider for Maven Surefire"
DESCRIPTION = "JUnit 5 provider for Maven Surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-provider-junit5-3.6.0-1.1.noarch.rpm"
RPM_HASH = "b9417e4934cd28e8be6bce63ee1f0fbf247b4166e18b17f4c391bea31ab78dd42a6a69ca5c4536409380637740b0b58db43c4d452dfcde427ed94bfa3be10262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-provider-junit5 \
mvn-org.apache.maven.surefire-surefire-junit-platform \
mvn-org.apache.maven.surefire-surefire-junit-platform-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-common-java5 \
mvn-org.apache.maven.surefire-surefire-api \
mvn-org.junit.platform-junit-platform-engine \
mvn-org.junit.platform-junit-platform-launcher"

inherit rpm
