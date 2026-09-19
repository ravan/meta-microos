SUMMARY = "Core module for maven-doxia"
DESCRIPTION = "This package provides Core module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-core-2.1.0-1.3.noarch.rpm"
RPM_HASH = "66af9dc4c2e8e132f66e410c1456f99d92b9f60f2accba0a85173618c513c2dda42553c25641c69d888d48ae9bd2510c25798b436c8fad863909c1b389bc6e23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-core \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
