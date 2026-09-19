SUMMARY = "Maven Archetype Catalog model"
DESCRIPTION = "Maven Archetype Catalog model."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-catalog-3.4.1-1.7.noarch.rpm"
RPM_HASH = "6d7d1881e9e1a9cb764ee5eb3dbc9ec0b6e67a5e5fbc22b2e8f8b51813584b75fb4e57168ca3174fe4ed2b6ed9a53fe914f9bc81b4e4a84ad58ca48ed77cb672"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-catalog-pom- \
osgi-org.apache.maven.archetype.catalog"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
