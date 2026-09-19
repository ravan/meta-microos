SUMMARY = "Maven Artifact Resolver SPI"
DESCRIPTION = "The service provider interface for repository system implementations and \
repository connectors."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-spi-2.0.22-1.1.noarch.rpm"
RPM_HASH = "7f936037aef0690760cc94e997a7e11b266001792fa0429d2c257bac601347231e4529e4702ec39e4de80b7060508eb9d731b0eda6b42afd96a78bd02230687a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-spi-pom- \
mvn-org.eclipse.aether-aether-spi \
mvn-org.eclipse.aether-aether-spi-pom- \
osgi-org.apache.maven.resolver.spi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.gson-gson \
mvn-org.apache.maven.resolver-maven-resolver-api"

inherit rpm
