SUMMARY = "Maven Install Plugin"
DESCRIPTION = "Copies the project artifacts to the user's local repository."
LICENSE = "Apache-2.0"

PV = "3.1.4"

RPM_NAME = "maven-install-plugin-3.1.4-1.6.noarch.rpm"
RPM_HASH = "1cdcaefa77a0aa81391b4538303503c1b0017f0f4ec4dd37dd6b9c0bd8ceb8c494eb7d51e363d298ae05648bebccd73412f879733389519ad4106c5e965f1724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-install-plugin \
mvn-org.apache.maven.plugins-maven-install-plugin \
mvn-org.apache.maven.plugins-maven-install-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
