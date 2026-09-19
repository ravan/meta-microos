SUMMARY = "Sonatype Plugins Parent POM"
DESCRIPTION = "This package provides Sonatype plugins parent POM used by other Sonatype \
packages."
LICENSE = "Apache-2.0"

PV = "8"

RPM_NAME = "sonatype-plugins-parent-8-1.32.noarch.rpm"
RPM_HASH = "0a845811afc7634e5349670aa8781692e2c25b2958faf9d783e199f75291c5201e580fc37e549665f74c49fcc57a91c5d313a94f5ff18e4b2646ca21f7fcddd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.plugins-plugins-parent-pom- \
sonatype-plugins-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.forge-forge-parent-pom-"

inherit rpm
