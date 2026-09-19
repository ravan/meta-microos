SUMMARY = "Maven Artifact Resolver Transport JDK 11"
DESCRIPTION = "Maven Artifact Transport JDK Java 11+."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-transport-jdk11-2.0.22-1.1.noarch.rpm"
RPM_HASH = "dbc44d296959f20cdba615480e58b9792ea88bbb5dc441325f7a55477df1dcc3caac097390756d1993512c6501eb81e13deb62aea660e88b3c65ea2624f0d314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-transport-jdk11 \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk11 \
mvn-org.apache.maven.resolver-maven-resolver-transport-jdk11-pom- \
osgi-org.apache.maven.resolver.transport.jdk.11"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.mizosoft.methanol-methanol \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
