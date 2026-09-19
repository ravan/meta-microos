SUMMARY = "Plexus Build API"
DESCRIPTION = "Plexus Build API"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "plexus-build-api-1.2.0-3.5.noarch.rpm"
RPM_HASH = "9a0af62a831893ee831d179bef4370259c88ecf76bb3e9bfb628b64dc569d23c498ca2539d968a48ee1a39379f9c82595c2a6fe4ea78fff4e30ad2f9b2274cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-build-api \
mvn-org.codehaus.plexus-plexus-build-api-pom- \
plexus-build-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
