SUMMARY = "APT module for maven-doxia"
DESCRIPTION = "This package provides APT module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-module-apt-2.1.0-1.3.noarch.rpm"
RPM_HASH = "9c7660185f8da1167ed0b538912ec6fc76819b908e1f4a66a6fab92eed69534cfbea3fe320fd5de609695955376e8cdad5899024e38c703600a1c60fb223bd28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-apt \
mvn-org.apache.maven.doxia-doxia-module-apt \
mvn-org.apache.maven.doxia-doxia-module-apt-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
