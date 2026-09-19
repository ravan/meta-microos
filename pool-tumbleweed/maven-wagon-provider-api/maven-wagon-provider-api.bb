SUMMARY = "The provider-api module for maven-wagon"
DESCRIPTION = "The provider-api module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-provider-api-3.5.3-2.9.noarch.rpm"
RPM_HASH = "3f25e1af00925f0f95d4fa65828a5772f06f0682baef7a4fe57ee132712859be8392f087b521db229c773d32f041d37c3b4519e55bb426da55a5da93b68aa13c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
