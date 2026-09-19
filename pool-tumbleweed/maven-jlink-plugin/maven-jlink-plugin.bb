SUMMARY = "Apache Maven JLink Plugin"
DESCRIPTION = "The Maven JLink Plugin is intended to create Modular Run-Time Images. \
http://openjdk.java.net/jeps/282, http://openjdk.java.net/jeps/220"
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "maven-jlink-plugin-3.3.0-1.2.noarch.rpm"
RPM_HASH = "2d115af14fec5cf9d622c930fa1f350a82ecfa142af380b64e169a6391646a220afa35f67b13c326f66a8e986eecd4d1e1d5924d559a2213315daf4b5d38bd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jlink-plugin \
mvn-org.apache.maven.plugins-maven-jlink-plugin \
mvn-org.apache.maven.plugins-maven-jlink-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-java"

inherit rpm
