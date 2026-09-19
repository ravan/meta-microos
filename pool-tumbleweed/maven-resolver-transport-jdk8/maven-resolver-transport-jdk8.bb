SUMMARY = "Maven Artifact Resolver Transport JDK 8"
DESCRIPTION = "Maven Artifact Transport JDK Java 8+."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-jdk8-2.0.22-1.1.noarch.rpm"
RPM_HASH = "556646cbfd5b1a6491c247efe0867ea3bd2b5c2d1b36fef0d206c2823cee0e6b9eca12aec3145de0c93506c995fc81c7a35dbeba886e461754f22e08af92ab2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-jdk8 \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk8 \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk8-pom- \
osgi-org.apache.maven.resolver.transport.jdk.8"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
