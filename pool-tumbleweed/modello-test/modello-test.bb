SUMMARY = "Modello Test Package"
DESCRIPTION = "Modello Test Package contains the basis to create Modello generator \
unit-tests, including sample models and xml files to test every \
feature for every plugin."
LICENSE = "Apache-2.0 & MIT"

PV = "2.8.1"

RPM_NAME = "modello-test-2.8.1-1.1.noarch.rpm"
RPM_HASH = "0d29ac3d868c7c9bdd3b9f83426746c160853b2480909592633d43c14ebb2d406f98edc3a7a10034cc0590beb6f5dead61797d996176d75f398dd0a7b348b55f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-test \
mvn-org.codehaus.modello-modello-test \
mvn-org.codehaus.modello-modello-test-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
modello \
mvn-org.codehaus.plexus-plexus-testing \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.junit.jupiter-junit-jupiter-api"

inherit rpm
