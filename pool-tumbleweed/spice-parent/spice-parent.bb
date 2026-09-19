SUMMARY = "Sonatype Spice Components"
DESCRIPTION = "Spice components and libraries are common components \
used throughout the Sonatype Forge."
LICENSE = "Apache-2.0"

PV = "26"

RPM_NAME = "spice-parent-26-2.6.noarch.rpm"
RPM_HASH = "5fbdaaaaefbcd05a587cd9eb71dde828a5269d1ecb1d6ea1f59e4e6bb96c0a29c39e2b603acb94cc53d0742a22669dac0b53b44ffcc83751c84e2ce3c3270ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.spice-spice-parent-pom- \
spice-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.forge-forge-parent-pom-"

inherit rpm
