SUMMARY = "Apache Log4j BOM"
DESCRIPTION = "Apache Log4j 2 Bill of Material"
LICENSE = "Apache-2.0"

PV = "2.26.1"

RPM_NAME = "log4j-bom-2.26.1-2.1.noarch.rpm"
RPM_HASH = "6576250c9daea7291fcfe9a14c286d60261788ae8d8cc392916c1cd68a9790e8d74c1e58df1771ce239bf68ffd268f6ba6dd55db14ba231351f816f4f52f5184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-bom \
mvn-org.apache.logging.log4j-log4j-bom-pom-"

RDEPENDS:${PN} += "javapackages-filesystem \
mvn-org.apache.logging-logging-parent-pom- \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
