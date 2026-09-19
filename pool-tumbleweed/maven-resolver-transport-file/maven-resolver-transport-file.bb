SUMMARY = "Maven Artifact Resolver Transport File"
DESCRIPTION = "A transport implementation for repositories using file:// URLs."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-file-2.0.22-1.1.noarch.rpm"
RPM_HASH = "cbdf153f12f08e7dac7344b05798ddda8d243c0b4c2e3628291325daea71b983207e65b020645b6e6d10e279053f6344bdcaec8700e1e1d1f177733da22350a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-file-pom- \
mvn-org.eclipse.aether-aether-transport-file \
mvn-org.eclipse.aether-aether-transport-file-pom- \
osgi-org.apache.maven.resolver.transport.file"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.slf4j-slf4j-api"

inherit rpm
