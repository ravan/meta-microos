SUMMARY = "Maven Plugin Tools APIs"
DESCRIPTION = "The Maven Plugin Tools API provides an API to extract information from \
and generate documentation for Maven Plugins."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-tools-api-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "946d28e51520696228531f487d91775838c66edf8ae9411a9c6de81a9fe8b11444bf0020762aca2b825001218e71563e2c6fc258b285a5d57f00ebfeb0e0c514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
