SUMMARY = "ANTLR 4 Tool"
DESCRIPTION = "ANTLR (ANother Tool for Language Recognition) is a parser \
generator for reading, processing, executing, or translating \
structured text or binary files.  It can be used to build languages, \
tools, and frameworks. From a grammar, ANTLR generates a parser that \
can build and walk parse trees. \
 \
This package provides the ANTLR 4 grammar compiler."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "antlr4-tool-4.13.0-7.5.noarch.rpm"
RPM_HASH = "c2a12ebfe9b8638d70a141e37eac5d18c12328a0ca64b4fbb83e8e85c5269351a78c154427b0779836ed4aed5d7fbab8af6688bc6211e0e10e57b4aafc775aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "antlr4 \
antlr4-tool \
mvn-org.antlr-antlr4 \
mvn-org.antlr-antlr4-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.ibm.icu-icu4j \
mvn-org.abego.treelayout-org.abego.treelayout.core \
mvn-org.antlr-ST4 \
mvn-org.antlr-antlr-runtime \
mvn-org.antlr-antlr4-runtime"

inherit rpm
