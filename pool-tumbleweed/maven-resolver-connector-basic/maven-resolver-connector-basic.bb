SUMMARY = "Maven Artifact Resolver Connector Basic"
DESCRIPTION = "A repository connector implementation for repositories using URI-based layouts."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-connector-basic-2.0.22-1.1.noarch.rpm"
RPM_HASH = "eaea6a8ce350d169859e0442a0836ebf951dfaf70846cb9b7da46733477e9be8704ef79027310c4ac9778aff91f375a37afa0861ead0816ca6340da66dba29ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic-pom- \
mvn-org.eclipse.aether-aether-connector-basic \
mvn-org.eclipse.aether-aether-connector-basic-pom- \
osgi-org.apache.maven.resolver.connector.basic"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
