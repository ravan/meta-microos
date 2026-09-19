SUMMARY = "Command Line Interface Library for Java"
DESCRIPTION = "The CLI library provides an API for working with the \
command line arguments and options."
LICENSE = "Apache-2.0"

PV = "1.11.0"

RPM_NAME = "apache-commons-cli-1.11.0-1.3.noarch.rpm"
RPM_HASH = "4c226cbc6487f69e4e44dc856fccee2d80f1ecb3d5293928a40f977095fca443652655c99d3893ee5a5e8017f8e697b66231810192f6d23b625bae9c4cc4e0eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-cli \
apache-commons-cli \
jakarta-commons-cli \
mvn-commons-cli-commons-cli \
mvn-commons-cli-commons-cli-pom- \
mvn-org.apache.commons-commons-cli \
mvn-org.apache.commons-commons-cli-pom- \
osgi-org.apache.commons.cli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
