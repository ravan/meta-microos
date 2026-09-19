SUMMARY = "Maven Plugin Testing Mechanism"
DESCRIPTION = "The Maven Plugin Testing Harness provides mechanisms to manage tests \
on Mojo."
LICENSE = "Apache-2.0 & MIT"

PV = "4.0.0~rc6"

RPM_NAME = "maven4-testing-4.0.0~rc6-2.1.aarch64.rpm"
RPM_HASH = "9647f22f791c1058d2b08206f27a7fb45511df90181b587be63c41cdff8c4f3221262fe1323748f6d65529281487cb1bdfca089bee9dd0a47c29895bb5daff25"

RPROVIDES:${PN} += "maven4-testing \
mvn-org.apache.maven-maven-testing \
mvn-org.apache.maven-maven-testing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.inject-guice--classes- \
mvn-org.apache.maven-maven-api-core \
mvn-org.apache.maven-maven-api-di \
mvn-org.apache.maven-maven-api-model \
mvn-org.apache.maven-maven-core-4.0.0-rc-6 \
mvn-org.apache.maven-maven-xml \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-transport-apache \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.junit.jupiter-junit-jupiter-api \
mvn-org.mockito-mockito-core \
mvn-org.slf4j-slf4j-api"

inherit rpm
