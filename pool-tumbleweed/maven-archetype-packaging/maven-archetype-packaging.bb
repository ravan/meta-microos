SUMMARY = "Maven Archetype packaging configuration for archetypes"
DESCRIPTION = "Maven Archetype packaging configuration for archetypes."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-packaging-3.4.1-1.7.noarch.rpm"
RPM_HASH = "98448a9c6bc88ce3fb0b8e8f2da7e7c451d6e091e1bfd67f045a40fbfa044b7b1771f5df63f3d246abaadf45007654dce58f5c3b96d78d1049545f75bdcdff8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging \
mvn-org.apache.maven.archetype-archetype-packaging-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
