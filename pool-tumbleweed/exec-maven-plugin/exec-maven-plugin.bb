SUMMARY = "Exec Maven Plugin"
DESCRIPTION = "A plugin to allow execution of system and Java programs."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "exec-maven-plugin-3.6.3-1.2.noarch.rpm"
RPM_HASH = "2e9e2bcd90ef6de6ab96afd3720a52d7320a36b47e5b7236ba57d3b94cb1466147e5e330b2f45809f0bdebc93a8d48170a53b476794c578ab7cc2dcfa2cf751d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exec-maven-plugin \
mvn-org.codehaus.mojo-exec-maven-plugin \
mvn-org.codehaus.mojo-exec-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-exec \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
