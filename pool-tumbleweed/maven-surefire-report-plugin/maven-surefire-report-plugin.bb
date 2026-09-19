SUMMARY = "Surefire reports plugin for maven"
DESCRIPTION = "Plugin for generating reports from surefire test runs."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-report-plugin-3.6.0-1.1.noarch.rpm"
RPM_HASH = "bcc7ef97acf2b9cafb1545d87f035d0c7399ec8abe049c077b611752a54d02d9444820036da1e07317c00ecee08b0b4085d330ccad550d6dec700ca223995b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-report-plugin \
mvn-org.apache.maven.plugins-maven-surefire-report-plugin \
mvn-org.apache.maven.plugins-maven-surefire-report-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-surefire-logger-api \
mvn-org.apache.maven.surefire-surefire-report-parser \
mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-simple"

inherit rpm
