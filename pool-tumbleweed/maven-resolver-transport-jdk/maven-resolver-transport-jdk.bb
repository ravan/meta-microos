SUMMARY = "Maven Artifact Resolver Transport JDK (mr)"
DESCRIPTION = "Maven Artifact Transport JDK - Multi Release."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-jdk-2.0.22-1.1.noarch.rpm"
RPM_HASH = "b378284bd402c027305d16e67f4af53512befcc083decfcf37f4466a735320b26718ff4fee2b7bfab2013535990827457bdc840a8d5ee13d87cc9322292c84c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-jdk \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk-pom- \
osgi-org.apache.maven.resolver.transport.jdk"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.mizosoft.methanol-methanol \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
