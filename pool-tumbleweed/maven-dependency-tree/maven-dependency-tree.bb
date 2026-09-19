SUMMARY = "Maven dependency tree artifact"
DESCRIPTION = "Apache Maven dependency tree artifact. Originally part of maven-shared."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-dependency-tree-3.3.0-1.2.noarch.rpm"
RPM_HASH = "492f51e8020fe4257f7fc59fcdf6f2e7d80e77c7d315069dd923749f6ce7d3bf8df74bf5a86747af733183d06505cd006f63d4947af4d101735dd86890b3113c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.apache.maven.shared-maven-dependency-tree-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.slf4j-slf4j-api"

inherit rpm
