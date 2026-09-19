SUMMARY = "BND Maven plugin"
DESCRIPTION = "Collection of various Maven plugins provided by the Bnd project."
LICENSE = "Apache-2.0"

PV = "6.4.1"

RPM_NAME = "bnd-maven-plugin-6.4.1-7.1.noarch.rpm"
RPM_HASH = "4abd6da5f724a22a373ff670783c50aa2aa80f35deb481fda037aa360797e61954cd0d8a21da1d1536ee00b1dc1c7383a7d3f87ea500eeca8100abcdca195c32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin \
mvn-biz.aQute.bnd-bnd-baseline-maven-plugin \
mvn-biz.aQute.bnd-bnd-baseline-maven-plugin-pom- \
mvn-biz.aQute.bnd-bnd-maven-plugin \
mvn-biz.aQute.bnd-bnd-maven-plugin-pom- \
mvn-biz.aQute.bnd-maven-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-org.apache.maven.shared-maven-mapping \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
