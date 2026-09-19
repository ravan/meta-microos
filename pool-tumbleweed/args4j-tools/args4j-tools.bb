SUMMARY = "Development-time tool for generating additional artifacts"
DESCRIPTION = "This package contains args4j development-time tool for generating \
additional artifacts."
LICENSE = "MIT"

PV = "2.33"

RPM_NAME = "args4j-tools-2.33-3.9.noarch.rpm"
RPM_HASH = "c5661ce513c7202e68282621269dac2db863a30c9a49f1a4052e67f5c873fc62dd9154f1075b324dbadef9249bdd03223cdf711f89dc37832ad188003be75a6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "args4j-tools \
mvn-args4j-args4j-tools \
mvn-args4j-args4j-tools-pom- \
osgi-org.kohsuke.args4j-tools"

RDEPENDS:${PN} += "args4j \
java-headless \
javapackages-filesystem \
mvn-args4j-args4j"

inherit rpm
