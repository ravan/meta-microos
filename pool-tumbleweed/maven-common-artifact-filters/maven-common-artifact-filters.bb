SUMMARY = "Maven Common Artifact Filters"
DESCRIPTION = "A collection of ready-made filters to control inclusion/exclusion of artifacts \
during dependency resolution."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-common-artifact-filters-3.3.2-2.11.noarch.rpm"
RPM_HASH = "2eda1bf2fe9fcd7a11ec6935828eb6f1e939c7bc06f6781c51d4fa50bd2be0f0ae1a200d4da5182c15bcf8938303ee1efe60cf6faa30b354a01c8ab1432284d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-common-artifact-filters-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
