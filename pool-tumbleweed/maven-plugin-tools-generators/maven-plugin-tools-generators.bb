SUMMARY = "Maven Plugin Tools Generators"
DESCRIPTION = "The Maven Plugin Tools Generators provides content generation \
(documentation, help) from plugin descriptor."
LICENSE = "Apache-2.0"

PV = "4.0.0~beta3"

RPM_NAME = "maven-plugin-tools-generators-4.0.0~beta3-1.1.noarch.rpm"
RPM_HASH = "c5103344250d6b995ecdb1cee25154360963f91dc0fb40781836200e18bec5198967970cb432fb1d3813c93dd0709ebf491ae74fcb39453d0297883c083de1f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-generators-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.jsoup-jsoup"

inherit rpm
