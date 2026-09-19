SUMMARY = "Maven JAR Plugin"
DESCRIPTION = "Builds a Java Archive (JAR) file from the compiled \
project classes and resources."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-jar-plugin-3.5.1-2.1.noarch.rpm"
RPM_HASH = "e3337a5e062d67d2361481644883faff1fea3ab98e77c07ecf74437c55af5b3d4449ad73193593543a77de192be7391516e3d92eeb4023768215cd6ca809f70a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin \
mvn-org.apache.maven.plugins-maven-jar-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.shared-file-management \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.slf4j-slf4j-api"

inherit rpm
