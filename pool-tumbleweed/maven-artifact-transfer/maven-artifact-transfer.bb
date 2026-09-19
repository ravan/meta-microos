SUMMARY = "Apache Maven Artifact Transfer"
DESCRIPTION = "An API to either install or deploy artifacts with Maven 3."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "maven-artifact-transfer-0.13.1-6.6.noarch.rpm"
RPM_HASH = "6282d0b18d7bbc7d7690c3c6de113eceec6ecdf5589ece8cacc26b1007b9ab20e67d44c110e5f2ceb4ae48762fe265f1173df6a8223b03aa71ed46b7b37659af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-artifact-transfer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.aether-aether-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
