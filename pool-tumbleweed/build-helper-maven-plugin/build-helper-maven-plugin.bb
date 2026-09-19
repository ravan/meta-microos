SUMMARY = "Build Helper Maven Plugin"
DESCRIPTION = "This plugin contains various small independent goals to assist with \
Maven build lifecycle."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "build-helper-maven-plugin-3.6.0-1.7.noarch.rpm"
RPM_HASH = "13dc07d29207194363867af318f44e8324ded9cd8b4caa66b58bd12eafaab6d06fa1dabea14ce8110b1d3794810e17ebc804fc733961b234b7a2c9b96bc7ed79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-helper-maven-plugin \
maven-plugin-build-helper \
mvn-org.codehaus.mojo-build-helper-maven-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-extras.beanshell-bsh \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api"

inherit rpm
