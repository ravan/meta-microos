SUMMARY = "XDoc module for maven-doxia"
DESCRIPTION = "This package provides XDoc module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-module-xdoc-2.1.0-1.3.noarch.rpm"
RPM_HASH = "1019279f10641f628cad78d6ae817228632bd98dbbeb3129e69cb6828eb28ae97c7834944a8c475141b236572788cfc1c943051c7bddc0f5455f934145e79416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xdoc \
mvn-org.apache.maven.doxia-doxia-module-xdoc \
mvn-org.apache.maven.doxia-doxia-module-xdoc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
