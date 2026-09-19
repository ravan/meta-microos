SUMMARY = "Sink-api module for maven-doxia"
DESCRIPTION = "This package provides Sink-api module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-sink-api-2.1.0-1.3.noarch.rpm"
RPM_HASH = "a765991f795b6addc23590b587b37c5ad20bb6e7398fb227fa62ff13c8f9767e0fdd08d7acf09ed93ec43424333ae5b4fd327b16c4545dd7530f184e1cbe0705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-sink-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
