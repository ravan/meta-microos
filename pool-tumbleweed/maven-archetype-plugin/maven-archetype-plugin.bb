SUMMARY = "Maven Plugin for using archetypes"
DESCRIPTION = "Maven Plugin for using archetypes."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-archetype-plugin-3.4.1-1.7.noarch.rpm"
RPM_HASH = "83ebf3c5b084c6450bc8b81f9a788f638b3f28548cd13002ce58aedbf783ca06b0778ddc1fa97c836b97c8c64b2b8232552ae05970e3d7f926c120860b436747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-plugin \
mvn-org.apache.maven.plugins-maven-archetype-plugin \
mvn-org.apache.maven.plugins-maven-archetype-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-common \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api"

inherit rpm
