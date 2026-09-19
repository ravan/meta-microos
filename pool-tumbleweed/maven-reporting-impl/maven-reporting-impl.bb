SUMMARY = "Abstract classes to manage report generation"
DESCRIPTION = "Abstract classes to manage report generation, which can be run both: \
 \
* as part of a site generation (as a maven-reporting-api's MavenReport), \
* or as a direct standalone invocation (as a maven-plugin-api's Mojo). \
 \
This is a replacement package for maven-shared-reporting-impl"
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "maven-reporting-impl-4.0.0-1.7.noarch.rpm"
RPM_HASH = "248b53a9c7084286e27eb4ddeadd883fd82d1948b58ec96c67c098ecd9fb4b51b6dfff228c48bcd0e8462be0c9188e9e3f5dd18d63cb1b75dea69f3bfbadcc5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.reporting-maven-reporting-impl-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-integration-tools \
mvn-org.apache.maven.doxia-doxia-module-apt \
mvn-org.apache.maven.doxia-doxia-module-xdoc \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-model \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus"

inherit rpm
