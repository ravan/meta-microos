SUMMARY = "Sisu Plexus"
DESCRIPTION = "This package contains Sisu Plexus."
LICENSE = "BSD-3-Clause & EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-plexus-1.1.0-2.1.noarch.rpm"
RPM_HASH = "f1ee9ebfe86db434982270f63eab0b3449f1a886297f451eca7afa5d8895ea087ffa78a5ee11874d6b052a06ed48d3d92169d3960c37db8c6d5e758004a8d2ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-container-default-pom- \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus-pom- \
mvn-org.sonatype.sisu-sisu-inject-plexus \
mvn-org.sonatype.sisu-sisu-inject-plexus-pom- \
osgi-org.eclipse.sisu.plexus \
plexus-containers-container-default \
sisu-plexus"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
sisu-inject"

inherit rpm
