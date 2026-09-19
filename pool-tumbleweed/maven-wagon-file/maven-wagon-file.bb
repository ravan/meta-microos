SUMMARY = "The file module for maven-wagon"
DESCRIPTION = "The file module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-file-3.5.3-2.9.noarch.rpm"
RPM_HASH = "0373f43987dfa966c53faed92ba61cc0f4db28ce8296287a516d27815882857491aea88eb310e9ab8c788a521b7acdc9f3ed386d5ad167557306c6698409879f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-file \
mvn-org.apache.maven.wagon-wagon-file \
mvn-org.apache.maven.wagon-wagon-file-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
