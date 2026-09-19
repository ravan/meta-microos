SUMMARY = "ANTLR 4 plugin for Apache Maven"
DESCRIPTION = "This package provides plugin for Apache Maven which can be used to \
generate ANTLR parsers during build."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-maven-plugin-4.13.0-7.5.noarch.rpm"
RPM_HASH = "b3ca71cbdac4b6ac9c496bc8eda9e4605f26e2fb2639fd6a323468dbaaf75a4a16d3fc35741fd72d2f4c6626f898ff4ee945b61b41238a84cc500c5ab47d382f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4-maven-plugin \
mvn-org.antlr-antlr4-maven-plugin \
mvn-org.antlr-antlr4-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.antlr-antlr4 \
mvn-org.codehaus.plexus-plexus-compiler-api \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
