SUMMARY = "Maven Artifact Resolver Transport Classpath"
DESCRIPTION = "A transport implementation for repositories using classpath:// URLs."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-classpath-2.0.22-1.1.noarch.rpm"
RPM_HASH = "071a7526ab441fda761af4898a7edd8d6c6cbcf18b42cf2a997aa794e76cd07afbe1ccbf89b6775c57e73dca10ae8c695813f7d432148a6a1946b515c8ccfecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-classpath \
mvn-org.apache.maven.resolver-maven-resolver-transport-classpath \
mvn-org.apache.maven.resolver-maven-resolver-transport-classpath-pom- \
mvn-org.eclipse.aether-aether-transport-classpath \
mvn-org.eclipse.aether-aether-transport-classpath-pom- \
osgi-org.apache.maven.resolver.transport.classpath"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util"

inherit rpm
