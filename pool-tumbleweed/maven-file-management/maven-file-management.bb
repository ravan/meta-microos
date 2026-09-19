SUMMARY = "Maven File Management API"
DESCRIPTION = "Provides a component for plugins to easily resolve project dependencies."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-file-management-3.2.0-1.6.noarch.rpm"
RPM_HASH = "30aa93202799f319aea341674955bdda7fbbcd5ed3fad02018b5aba2293ae8e620b80c2d35a028c2c4f90f6aea577bb7b627ac4e677720227625fff3664b431d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-file-management \
mvn-org.apache.maven.shared-file-management \
mvn-org.apache.maven.shared-file-management-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
