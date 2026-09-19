SUMMARY = "Maven Artifact Resolver Named Locks"
DESCRIPTION = "A synchronization utility implementation using Named locks"
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-named-locks-2.0.22-1.1.noarch.rpm"
RPM_HASH = "7ad8d85a88897091b24190801880c1bfc0d1616265562b26a0b25ab0c6f8532855154679144818d825c472f2da16624803f9c9638876dd4108d12fb1fa60a58e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-named-locks \
mvn-org.apache.maven.resolver-maven-resolver-named-locks-pom- \
mvn-org.eclipse.aether-aether-named-locks \
mvn-org.eclipse.aether-aether-named-locks-pom- \
osgi-org.apache.maven.resolver.named.locks"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
