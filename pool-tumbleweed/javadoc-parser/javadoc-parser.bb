SUMMARY = "Java library for parsing information from a structured Javadoc string"
DESCRIPTION = "This library provides a parsing mechanism for Javadoc comments \
within java files. \
To get the parsing mechanism work properly the Javadoc comment \
has to follow a specific structure. The structure should be as \
close as possible to the Writers Guide from Oracle."
LICENSE = "Apache-2.0"

PV = "0.3.1"

RPM_NAME = "javadoc-parser-0.3.1-1.9.noarch.rpm"
RPM_HASH = "f8dde8189121bdea76c97858a750cc9886a3dba6b31558d556a04bf3a89dd1944a45236d98772b388dce90641a75aec5b41511c902e0411d7e56c52639117f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javadoc-parser \
mvn-com.github.chhorz-javadoc-parser \
mvn-com.github.chhorz-javadoc-parser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
