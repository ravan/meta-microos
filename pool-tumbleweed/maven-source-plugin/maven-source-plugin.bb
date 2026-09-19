SUMMARY = "Plugin for creating source JARs"
DESCRIPTION = "The Maven Source Plugin creates a JAR archive of the \
source files of the current project."
LICENSE = "Apache-2.0"

PV = "3.4.0"

RPM_NAME = "maven-source-plugin-3.4.0-1.3.noarch.rpm"
RPM_HASH = "9f516652f22fd55d463dcda6338305c4837df02185786d7867dcb271c59845469ee94f341c62d45d468726437f823605a97490181b7ffe7b710f6541d7008586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-source-plugin \
mvn-org.apache.maven.plugins-maven-source-plugin \
mvn-org.apache.maven.plugins-maven-source-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-archiver \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
