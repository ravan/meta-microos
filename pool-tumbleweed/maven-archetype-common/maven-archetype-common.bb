SUMMARY = "Maven Archetype common classes"
DESCRIPTION = "Maven Archetype common classes."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-common-3.4.1-1.7.noarch.rpm"
RPM_HASH = "253a0a071f89bc73ba913758cedfb6bbcbce2e4c03d47476c725094f6062dd936a352a816c389020e688ce6922f47b97695d65c6398daa1ce46584cec7e130b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-common \
mvn-org.apache.maven.archetype-archetype-common \
mvn-org.apache.maven.archetype-archetype-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ibm.icu-icu4j \
mvn-commons-collections-commons-collections \
mvn-commons-io-commons-io \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.jdom-jdom2"

inherit rpm
