SUMMARY = "Test framework for apache-commons-collections"
DESCRIPTION = "Test framework for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-testframework-3.2.2-9.10.noarch.rpm"
RPM_HASH = "7776198cbf58d6cd5dcbd5613dc0696d047d9cf7b7229d093a841856fb96f20b3cca80256d96dc8287602804c61ebdcc4206438fe1988e66450f765226ad1e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-testframework \
mvn-commons-collections-commons-collections-testframework \
mvn-org.apache.commons-commons-collections-testframework"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
