SUMMARY = "Maven XML Plugin"
DESCRIPTION = "A plugin for various XML related tasks like validation and transformation."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-1.0.2-2.23.noarch.rpm"
RPM_HASH = "b48de00e09cc5657d0b1b194127b93fe4e91acd802f43fc88337dd00412ed473cf1be0e485ebcfc470f319eb877e181af08bf611bb361df79046687d3b4a3941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-xml-maven-plugin \
mvn-org.codehaus.mojo-xml-maven-plugin-pom- \
xml-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-utils \
mvn-xml-resolver-xml-resolver"

inherit rpm
