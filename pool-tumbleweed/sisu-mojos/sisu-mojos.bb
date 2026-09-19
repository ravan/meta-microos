SUMMARY = "Sisu plugin for Apache Maven"
DESCRIPTION = "The Sisu Plugin for Maven provides mojos to generate \
META-INF/sisu/javax.inject.Named index files for the Sisu container."
LICENSE = "EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-mojos-1.1.0-2.1.noarch.rpm"
RPM_HASH = "1b52d41e33745137c524821cbb8840530fa8a1e13d4b8a7781119fca2cc2c2f0cd767f35f5664f56b460ea671c3f0ba1c76ba6332e6329018385f82078a5b7fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.eclipse.sisu-sisu-maven-plugin \
mvn-org.eclipse.sisu-sisu-maven-plugin-pom- \
mvn-org.sonatype.plugins-sisu-maven-plugin \
mvn-org.sonatype.plugins-sisu-maven-plugin-pom- \
sisu-mojos"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.codehaus.plexus-plexus-build-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.slf4j-slf4j-nop"

inherit rpm
