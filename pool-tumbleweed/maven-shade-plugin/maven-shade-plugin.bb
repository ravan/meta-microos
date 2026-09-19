SUMMARY = "Capability to package the artifact in an uber-jar"
DESCRIPTION = "This plugin provides the capability to package the artifact in an \
uber-jar, including its dependencies and to shade, i.e. rename, the \
packages of some of the dependencies."
LICENSE = "Apache-2.0"

PV = "3.6.2"

RPM_NAME = "maven-shade-plugin-3.6.2-1.2.noarch.rpm"
RPM_HASH = "46daf15a5c392d3f14ccd090a54158717e436c36d1721fc9044a8183eecc90223ee01e6ddff960bc6989f9651d180d303f2484ff1754ee136b878f306ba6dc8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin \
mvn-org.apache.maven.plugins-maven-shade-plugin \
mvn-org.apache.maven.plugins-maven-shade-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons \
mvn-org.vafer-jdependency"

inherit rpm
