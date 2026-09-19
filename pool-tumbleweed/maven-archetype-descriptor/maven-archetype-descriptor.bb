SUMMARY = "Maven Archetype Descriptor model"
DESCRIPTION = "Maven Archetype Descriptor model."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-descriptor-3.4.1-1.7.noarch.rpm"
RPM_HASH = "51b24b87eadfd7fca8ab9292d9a3cdb1cb86867456296d2c98a2243dfaba8bc9b7b957b2b11578639fd49fae0120dfa60156d39ab0db7ea7f855a37baa8b6577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.archetype-archetype-descriptor-pom- \
osgi-org.apache.maven.archetype.descriptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
