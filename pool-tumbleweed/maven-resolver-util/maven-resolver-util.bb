SUMMARY = "Maven Artifact Resolver Utilities"
DESCRIPTION = "A collection of utility classes to ease usage of the repository system."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-util-2.0.22-1.1.noarch.rpm"
RPM_HASH = "842cc86def2efed4e00225dbefee1ea31af4dcfdaf98a0cbcb2a84503173e74d67105a788e081022e0bbbe9d76fb3cfec301bb5d20294e28dccd35ebc70342a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-util \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.resolver-maven-resolver-util-pom- \
mvn-org.eclipse.aether-aether-util \
mvn-org.eclipse.aether-aether-util-pom- \
osgi-org.apache.maven.resolver.util"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-api"

inherit rpm
