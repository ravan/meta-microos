SUMMARY = "Maven Resources Plugin"
DESCRIPTION = "The Resources Plugin handles the copying of project resources \
to the output directory."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "maven-resources-plugin-3.5.0-2.1.noarch.rpm"
RPM_HASH = "06679616ba575a3614ce63c8d35011c870695436f9e6d60d9baa72fdcd309c27cb2e81cb6b1b990e370a82732e99281275383c397029fb51ebd51826eeb950de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
