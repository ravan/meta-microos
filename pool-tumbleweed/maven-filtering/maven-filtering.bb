SUMMARY = "Shared component providing resource filtering"
DESCRIPTION = "These Plexus components have been built from the filtering process/code in \
Maven Resources Plugin. The goal is to provide a shared component for all \
plugins that needs to filter resources."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-filtering-3.5.1-1.1.noarch.rpm"
RPM_HASH = "21c86ca6666db36e1c34646b939be72053fcb87e6a51b2b4a32590d90be7a0b67027428c96ad8f63476959aa58888cb080fb1f53bdbf48e616473f9c12ccb6a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-filtering \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-filtering-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-build-api \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api"

inherit rpm
