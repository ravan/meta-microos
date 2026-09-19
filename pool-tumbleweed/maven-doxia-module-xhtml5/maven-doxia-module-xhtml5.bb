SUMMARY = "XHTML5 module for maven-doxia"
DESCRIPTION = "This package provides XHTML5 module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "maven-doxia-module-xhtml5-2.1.0-1.3.noarch.rpm"
RPM_HASH = "ede0e5b55c5287da663852fc7348d71268b9d3936e362948929bc9be607ab7896527a1ef26992f729f1355ec7e91db1c9700136acf98706a532227522c79acb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-xhtml5 \
mvn-org.apache.maven.doxia-doxia-module-xhtml5 \
mvn-org.apache.maven.doxia-doxia-module-xhtml5-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
