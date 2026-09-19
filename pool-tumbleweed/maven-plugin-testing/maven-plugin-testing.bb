SUMMARY = "Maven Plugin Testing"
DESCRIPTION = "The Maven Plugin Testing contains the necessary modules \
to be able to test Maven Plugins."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-testing-3.5.1-1.4.noarch.rpm"
RPM_HASH = "696d563a5cc4a417cbb455167ff116cd39227d3f78ca7ab81927dbcb46966a6f4c75e18e80e827ee8296c9fdd6114845d8f33ab07fd5dc10f735d8144a3fa60d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-testing \
mvn-org.apache.maven.plugin-testing-maven-plugin-testing-pom- \
mvn-org.apache.maven.shared-maven-plugin-testing-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-parent-pom-"

inherit rpm
