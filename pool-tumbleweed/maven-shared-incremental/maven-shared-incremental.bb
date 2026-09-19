SUMMARY = "Maven Incremental Build support utilities"
DESCRIPTION = "Various utility classes and plexus components for supporting \
incremental build functionality in maven plugins."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-1.1-4.8.noarch.rpm"
RPM_HASH = "5591afe46030cf1eb92fbfee4d45a96708af842e546a7ea5f5384355cc79e48c27b3929880fb198c67c1bc9f6fd557ea7be1dfa6f5eba1764a9dcc1736407e78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-incremental \
mvn-org.apache.maven.shared-maven-shared-incremental-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
