SUMMARY = "Maven Artifact Resolver API"
DESCRIPTION = "The application programming interface for the repository system."
LICENSE = "Apache-2.0"

PV = "2.0.22"

RPM_NAME = "maven-resolver-api-2.0.22-1.1.noarch.rpm"
RPM_HASH = "f7fa46edf38a57abd490d4a892579ffa1c12c732c32bd74cef0573b840517f271eea7668fcc45394fb579f490443717ff381c3b5ca11f675c5f3e412624190c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-api-pom- \
mvn-org.eclipse.aether-aether-api \
mvn-org.eclipse.aether-aether-api-pom- \
osgi-org.apache.maven.resolver.api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
