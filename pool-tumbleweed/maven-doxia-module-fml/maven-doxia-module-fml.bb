SUMMARY = "FML module for maven-doxia"
DESCRIPTION = "This package provides FML module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-module-fml-2.1.0-1.3.noarch.rpm"
RPM_HASH = "1253d597244c896a60080a431a77b32b25a9cb57f29eb4d7967423451515826567527e23caf44be66eb72d21db2bbe809e2043a60cb789533fdd48c651f97e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-fml \
mvn-org.apache.maven.doxia-doxia-module-fml \
mvn-org.apache.maven.doxia-doxia-module-fml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
