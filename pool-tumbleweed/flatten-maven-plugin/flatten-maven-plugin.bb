SUMMARY = "Maven Flatten Plugin"
DESCRIPTION = "Plugin to generate flattened POM (reduced and resolved \
information required for consumers of maven repositories) \
and to use (install, sign, deploy) it instead of original \
pom.xml."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "flatten-maven-plugin-1.7.1-1.4.noarch.rpm"
RPM_HASH = "bd4635242016656cccf5330ced8396f4b7b53d912313571c1ba50ae6c4943288786a548cbb6e090e5b00f19331ca2d99a75ed35403d1ee721a0d4ebe5158ba7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flatten-maven-plugin \
mvn-org.codehaus.mojo-flatten-maven-plugin \
mvn-org.codehaus.mojo-flatten-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
