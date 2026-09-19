SUMMARY = "Maven Artifact Resolver GnuPG Signer Generator"
DESCRIPTION = "A generator implementation for GnuPG signatures."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-generator-gnupg-2.0.22-1.1.noarch.rpm"
RPM_HASH = "b200e2284ed70a25308ef1f7fae8ca9398004c4bdfd619dc01a06c58df9b9528e421bacac8e30d8098568a0995368c0cca74fa566b993b14dd5ff149b8c7fd48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-generator-gnupg \
mvn-org.apache.maven.resolver-maven-resolver-generator-gnupg \
mvn-org.apache.maven.resolver-maven-resolver-generator-gnupg-pom- \
mvn-org.eclipse.aether-aether-generator-gnupg \
mvn-org.eclipse.aether-aether-generator-gnupg-pom- \
osgi-org.apache.maven.resolver.generator.gnupg"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.bouncycastle-bcpg-jdk18on \
mvn-org.bouncycastle-bcprov-jdk18on \
mvn-org.bouncycastle-bcutil-jdk18on \
mvn-org.slf4j-slf4j-api"

inherit rpm
