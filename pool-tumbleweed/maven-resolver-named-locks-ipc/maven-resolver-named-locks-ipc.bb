SUMMARY = "Maven Artifact Resolver Named Locks using IPC"
DESCRIPTION = "A synchronization utility implementation using IPC."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-named-locks-ipc-2.0.22-1.1.noarch.rpm"
RPM_HASH = "298892c3c9de889515eedcf582dded7b25c98e226b4e3ebda5f032dfa190df903d3560268a235493285a4ac4f9c0d7168d0bc0d032b243106fc7bed613a69b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-named-locks-ipc \
mvn-org.apache.maven.resolver-maven-resolver-named-locks-ipc \
mvn-org.apache.maven.resolver-maven-resolver-named-locks-ipc-pom- \
mvn-org.eclipse.aether-aether-named-locks-ipc \
mvn-org.eclipse.aether-aether-named-locks-ipc-pom- \
osgi-org.apache.maven.resolver.named.locks.ipc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
