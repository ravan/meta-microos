SUMMARY = "Maven Archiver"
DESCRIPTION = "The Maven Archiver is used by other Maven plugins \
to handle packaging"
LICENSE = "Apache-2.0"

PV = "4.0.0~beta5"

RPM_NAME = "maven-archiver4-4.0.0~beta5-2.4.noarch.rpm"
RPM_HASH = "2ffdedf40e259ddffeafbcebff80c63dd91288b2aea24e1513a7c62e9e25b254101c7264b0aef9588c77b838a45317ca81ad57ccb7d26664cf55b53c0b0f09aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver4 \
mvn-org.apache.maven.shared-maven-archiver \
mvn-org.apache.maven.shared-maven-archiver-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-api-core \
mvn-org.apache.maven-maven-api-model \
mvn-org.apache.maven-maven-api-xml \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
