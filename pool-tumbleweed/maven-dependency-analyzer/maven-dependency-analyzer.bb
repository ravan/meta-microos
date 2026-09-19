SUMMARY = "Maven dependency analyzer"
DESCRIPTION = "Analyzes the dependencies of a project for undeclared or unused artifacts. \
 \
Warning: Analysis is not done at source but bytecode level, then some cases are \
not detected (constants, annotations with source-only retention, links in \
javadoc) which can lead to wrong result if they are the only use of a \
dependency."
LICENSE = "Apache-2.0"

PV = "1.17.1"

RPM_NAME = "maven-dependency-analyzer-1.17.1-1.2.noarch.rpm"
RPM_HASH = "76a253a5876e69f613ada3e05c441405609892b960c5b565eb2e0da61338e7a222168e14235c712a7dd3e2977ab9f1de20d3b2c1d547acf3b52b23e2af66b233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-analyzer \
mvn-org.apache.maven.shared-maven-dependency-analyzer-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
