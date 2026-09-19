SUMMARY = "Maven Artifact Resolver Transport Wagon"
DESCRIPTION = "A transport implementation based on Maven Wagon."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-wagon-2.0.22-1.1.noarch.rpm"
RPM_HASH = "c240b96dee12ab1323dfa8f04c3e89da97460aa7486a6433a41c1a65c62e9e9266f76f1320c1aef43cc47b92e4882ffc7869238f6bc339f2546c2868a2738382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon-pom- \
mvn-org.eclipse.aether-aether-transport-wagon \
mvn-org.eclipse.aether-aether-transport-wagon-pom- \
osgi-org.apache.maven.resolver.transport.wagon"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
