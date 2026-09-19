SUMMARY = "Maven Assembly Plugin"
DESCRIPTION = "A Maven plugin to create archives of your project's sources, classes, \
dependencies etc. from flexible assembly descriptors."
LICENSE = "Apache-2.0"

PV = "3.8.0"

RPM_NAME = "maven-assembly-plugin-3.8.0-1.4.noarch.rpm"
RPM_HASH = "725130ad7c600b42bec0595414efc3d909cb495de71135f129a600e0ac200486aeddbcc271cea37597d0124741929b445232270320e9571507bba53d69feffb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin \
mvn-org.apache.maven.plugins-maven-assembly-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.shared-maven-common-artifact-filters \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
