SUMMARY = "Maven Deploy Plugin"
DESCRIPTION = "Uploads the project artifacts to the internal remote repository."
LICENSE = "Apache-2.0"

PV = "3.1.4"

RPM_NAME = "maven-deploy-plugin-3.1.4-2.1.noarch.rpm"
RPM_HASH = "8d68180026acc91c2586fa618efca99b5e159673ee64f1223058e68246924025bf2b48b59aa6f73fc28be422da69f8cbcafe891f8d723feb66877214eac72186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin \
mvn-org.apache.maven.plugins-maven-deploy-plugin \
mvn-org.apache.maven.plugins-maven-deploy-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm
