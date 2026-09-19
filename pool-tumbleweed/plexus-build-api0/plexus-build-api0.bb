SUMMARY = "Sonatype Plexus Build API"
DESCRIPTION = "Sonatype Plexus Build API"
LICENSE = "Apache-2.0"

PV = "0.0.8"

RPM_NAME = "plexus-build-api0-0.0.8-2.8.noarch.rpm"
RPM_HASH = "178cfda165e9b316d4be83a694669c3f7984b1a54bee49095f907db143de95d2a37eabd5ec4e33f0ef0dcd21bc7d675427625ffba4b242f072b4986a632a8f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.plexus-plexus-build-api \
mvn-org.sonatype.plexus-plexus-build-api-pom- \
plexus-build-api0"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
