SUMMARY = "Maven Artifact Resolver Test Utilities"
DESCRIPTION = "A collection of utility classes to ease testing of the repository system."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-test-util-2.0.22-1.1.noarch.rpm"
RPM_HASH = "8a1ddc32076bb1574512a8eac3274b903db61f6b5abef91b17336990208704c6d2170478f927acf7de2efef86e03b98c883aa28e5e0c6dc8545e0dfbca5cb2a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-test-util \
mvn-org.apache.maven.resolver-maven-resolver-test-util \
mvn-org.apache.maven.resolver-maven-resolver-test-util-pom- \
mvn-org.eclipse.aether-aether-test-util \
mvn-org.eclipse.aether-aether-test-util-pom- \
osgi-org.apache.maven.resolver.test.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi"

inherit rpm
